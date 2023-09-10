package com.gfv.gfvjava.gfvjava.Models.Service.DTO.Enum;

public enum Evalidacao {
    True("true"),
    False("false");

    private final String validacao;

    Evalidacao(String validacao) {
        this.validacao = validacao;
    }

    public String getValidacao() {
        return validacao;
    }
}
