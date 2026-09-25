package com.mycompany.mywebapp.ui.components;

import com.google.gwt.user.client.ui.Label;
import com.mycompany.mywebapp.model.Priority;
import com.mycompany.mywebapp.model.Status;

public class Badge extends Label {

    public Badge(String text, String color) {
        super(text);
        setStyleName("tf-badge");
        getElement().getStyle().setProperty("borderColor", color);
        getElement().getStyle().setProperty("color", color);
    }

    public static Badge of(Priority priority) {
        return new Badge(priority.getLabel(), priority.getColor());
    }

    public static Badge of(Status status) {
        String color = status == Status.CONCLUIDA ? "#3fa34d"
                : status == Status.EM_ANDAMENTO ? "#2f5da8" : "#6b7692";
        return new Badge(status.getLabel(), color);
    }
}