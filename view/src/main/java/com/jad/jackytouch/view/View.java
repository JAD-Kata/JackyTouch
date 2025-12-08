package com.jad.jackytouch.view;

import com.jad.jackytouch.IController;
import com.jad.jackytouch.IModel;
import com.jad.jackytouch.IView;
import com.jad.textwindow.TextWindow;
import org.jetbrains.annotations.NotNull;

public class View implements IView {
    private final TextWindow window;
    private IController controller;
    private IModel model;

    public View() {
        this.window = new TextWindow();
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
}
