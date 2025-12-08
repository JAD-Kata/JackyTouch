package com.jad.jackytouch.model;

import com.jad.jackytouch.IAsciiAsset;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

record AsciiAsset(char[][] pixels) implements IAsciiAsset {
    public static final int ASSET_HEIGHT = 3;
    public static final int ASSET_WIDTH = 12;
    public static final char TRANSPARENT_PIXEL = '.';
    private static final Map<String, AsciiAsset> ASCII_CACHE = new ConcurrentHashMap<>();

    AsciiAsset {
        if (pixels == null || pixels.length != AsciiAsset.ASSET_HEIGHT || pixels[0].length != AsciiAsset.ASSET_WIDTH) {
            throw new IllegalArgumentException("Invalid asset dimensions");
        }
    }

    static AsciiAsset get(final @NotNull String name) {
        return AsciiAsset.ASCII_CACHE.computeIfAbsent(name, AsciiAsset::loadFromResources);
    }

    private static AsciiAsset loadFromResources(String name) {
        String resourcePath = "/" + name.toLowerCase() + ".txt";
        InputStream inputStream = AsciiAsset.class.getResourceAsStream(resourcePath);
        if (inputStream == null) {
            throw new IllegalArgumentException("ASCII asset not found: " + resourcePath);
        }
        try {
            String content = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
            return AsciiAsset.ofString(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static AsciiAsset ofString(final @NotNull String assetString) {
        final String normalized = assetString.replace("\r", "");
        String[] lines = normalized.split("\n");
        char[][] pixels = new char[lines.length][];
        for (int i = 0; i < lines.length; i++) {
            pixels[i] = lines[i].toCharArray();
        }
        return new AsciiAsset(pixels);
    }

    static AsciiAsset merge(final @NotNull IAsciiAsset firstAsset, final @NotNull IAsciiAsset secondAsset) {
        char[][] mergedPixels = new char[AsciiAsset.ASSET_HEIGHT][AsciiAsset.ASSET_WIDTH];
        for (int row = 0; row < AsciiAsset.ASSET_HEIGHT; row++) {
            for (int col = 0; col < AsciiAsset.ASSET_WIDTH; col++) {
                char firstChar = firstAsset.getCharAt(row, col);
                char secondChar = secondAsset.getCharAt(row, col);
                mergedPixels[row][col] = (secondChar != AsciiAsset.TRANSPARENT_PIXEL) ? secondChar : firstChar;
            }
        }
        return new AsciiAsset(mergedPixels);
    }

    static String getDisplay(final @NotNull AsciiAsset asciiAsset) {
        StringBuilder builder = new StringBuilder();
        for (int row = 0; row < AsciiAsset.ASSET_HEIGHT; row++) {
            for (int col = 0; col < AsciiAsset.ASSET_WIDTH; col++) {
                builder.append(asciiAsset.getCharAt(row, col));
            }
            if (row < AsciiAsset.ASSET_HEIGHT - 1) builder.append('\n');
        }
        return builder.toString();
    }

    @Override
    public char getCharAt(final @NotNull int row, final @NotNull int column) {
        return this.pixels[row][column];
    }
}
