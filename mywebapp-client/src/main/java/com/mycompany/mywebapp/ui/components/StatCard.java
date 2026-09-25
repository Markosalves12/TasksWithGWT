package com.mycompany.mywebapp.ui.components;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.InlineLabel;

public class StatCard extends Composite {

    private final InlineLabel valueLabel = new InlineLabel();

    public StatCard(String title, int value) {
        FlowPanel root = new FlowPanel();
        root.setStyleName("tf-card");

        InlineLabel label = new InlineLabel(title);
        label.setStyleName("tf-card-label");
        valueLabel.setStyleName("tf-card-value");

        root.add(label);
        root.add(valueLabel);
        initWidget(root);

        setValue(value);
    }

    public void setValue(int value) {
        valueLabel.setText(String.valueOf(value));
    }
}