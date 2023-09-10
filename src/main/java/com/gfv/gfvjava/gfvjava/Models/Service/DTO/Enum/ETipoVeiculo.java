package com.gfv.gfvjava.gfvjava.Models.Service.DTO.Enum;

public enum ETipoVeiculo {
    CARRO("Carro"),
    MOTO("Moto"),
    CAMINHAO("Caminhão"),
    VAN("Van"),
    SUV("SUV"),
    CAMINHONETE("Caminhonete"),
    CARRO_ESPORTIVO("Carro esportivo"),
    ONIBUS("Ônibus"),
    TRICICLOS("Triciclos"),
    MINI_VAN("Mini-van"),
    PERUA("Perua"),
    CARRO_ELETRICO("Carro elétrico");

    private final String tipoVeiculo;

    ETipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
}
