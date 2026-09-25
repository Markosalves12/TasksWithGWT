package com.mycompany.mywebapp.ui.components;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;

public class EmptyState extends Composite {

    public EmptyState(String title, String message) {
        FlowPanel root = new FlowPanel();
        root.setStyleName("tf-empty");

        Label t = new Label(title);
        t.setStyleName("tf-empty-title");
        Label m = new Label(message);

        root.add(t);
        root.add(m);
        initWidget(root);
    }
}