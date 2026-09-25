package com.mycompany.mywebapp.model;

public enum Priority {
    BAIXA("Baixa", "#3fa34d"),
    MEDIA("Média", "#d98a1f"),
    ALTA("Alta", "#c0392b");

    private final String label;
    private final String color;

    Priority(String label, String color) {
        this.label = label;
        this.color = color;
    }

    public String getLabel() { return label; }
    public String getColor() { return color; }
}