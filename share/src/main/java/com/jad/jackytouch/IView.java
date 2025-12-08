package com.jad.jackytouch;

import org.jetbrains.annotations.NotNull;

public interface IView {
    void setController(final @NotNull IController controller);

    void setModel(final @NotNull IModel model);
}
