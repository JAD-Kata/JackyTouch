package com.jad.jackytouch.view;

import com.jad.jackytouch.ICar;
import com.jad.jackytouch.IController;
import com.jad.jackytouch.IModel;
import com.jad.jackytouch.IView;
import com.jad.textwindow.TextWindow;
import com.jad.textwindow.TextWindowSettings;
import org.jetbrains.annotations.NotNull;

import java.awt.event.KeyEvent;

public class View implements IView {
    private static final int SCREEN_HEIGHT = 40;
    private static final int SCREEN_WIDTH = 100;
    private static final int WAITING_TIME = 200;
    private final TextWindow window;
    private IController controller;
    private IModel model;

    public View() {
        TextWindowSettings settings = new TextWindowSettings();
        settings.setTitle("⛤⛤⛤ Rising of the ASCII's Cult ⛤⛤⛤");
        settings.setScreenHeight(View.SCREEN_HEIGHT);
        settings.setScreenWidth(View.SCREEN_WIDTH);
        settings.addKeyboardListener(KeyEvent.VK_SPACE, "Proceed");
        this.window = new TextWindow(settings);
        this.window.setTitle("Jacky Touch");
        this.window.setVisible(true);
    }

    @Override
    public void setController(final IController controller) {
        this.controller = controller;
    }

    @Override
    public void setModel(final @NotNull IModel model) {
        this.model = model;
    }

    @Override
    public void display(final @NotNull String message) {
        this.window.display(message);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public void displayCar(final ICar car) {
        this.display(car.getDisplay()
                             + "\n\n"
                             + View.addSeparatorBeforeCR(car.getDescription(), " > ")
                             + "\n\n"
                             + View.addSeparatorBeforeCR(car.getNames(), " | ")
                    );

        while (this.window.isOff("Proceed")) {
        }
        try {
            Thread.sleep(View.WAITING_TIME);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
    }

    private static String addSeparatorBeforeCR(final String texte, final String separator) {
        if (texte.isEmpty()) return texte;
        return separator + texte.replace("\n", "\n" + separator);
    }
}
