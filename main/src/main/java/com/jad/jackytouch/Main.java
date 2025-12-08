package com.jad.jackytouch;

import com.jad.jackytouch.controller.Controller;
import com.jad.jackytouch.model.Model;
import com.jad.jackytouch.view.View;

public enum Main {
    ;

    public static void main(String[] args) {
        IModel model = new Model();
        IView view = new View();
        IController controller = new Controller(view, model);
        controller.proceed();
    }
}
