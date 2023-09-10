package com.gfv.gfvjava.gfvjava.Models.Service.ServiceLayer;

import com.gfv.gfvjava.gfvjava.Models.Service.DAO.Mapping.ClienteMap.VeiculoClienteMapping;

public class VeiculoSL {
    private final VeiculoClienteMapping VeiculoClienteMapping;

    public VeiculoSL(){
        this.VeiculoClienteMapping = new VeiculoClienteMapping();
    }

    public void inserirVeiculo(String marca, String modelo, String placaVeiculo, String customizado, String blindado, String carga, String tamanhoVeiculo, double pesoVeiculo, int qtdeEixos){
        VeiculoClienteMapping.inserirDadosVeiculo(marca, modelo, placaVeiculo, customizado, blindado, carga, tamanhoVeiculo, pesoVeiculo, qtdeEixos);
    }
}
