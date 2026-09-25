package com.mycompany.mywebapp.model;

public enum Status {
    PENDENTE("Pendente"),
    EM_ANDAMENTO("Em andamento"),
    CONCLUIDA("Concluída");

    private final String label;

    Status(String label) { this.label = label; }

    public String getLabel() { return label; }
}