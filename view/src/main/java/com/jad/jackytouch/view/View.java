package com.jad.jackytouch.view;

import com.jad.jackytouch.IController;
import com.jad.jackytouch.IModel;
import com.jad.jackytouch.IView;
import org.jetbrains.annotations.NotNull;

public class View implements IView {
    private IController controller;
    private IModel model;

    @Override
    public void setController(final IController controller) {
        this.controller = controller;
    }

    @Override
    public void setModel(final @NotNull IModel model) {
        this.model = model;
    }
}
