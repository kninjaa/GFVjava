package com.gfv.gfvjava.gfvjava.Models.Service.DTO;

import com.gfv.gfvjava.gfvjava.Models.Service.DTO.CadastrarCliente;

public class SolicitarCarroCliente extends CadastrarCliente{
    
    private int idVeiculo;	
    private int tipoVeiculoFK; //se possui carga
      
    private boolean Customizado;
    private boolean Blindado;
    
    private String placaVeiculo;
    private float tamanhoVeiculo;
    private float pesoVeiculo;
    private int qtdeEixos;
    
    private int idCliente;
    
    public SolicitarCarroCliente(int idCliente, String cpf, String cnh, String email, String senha, String placaVeiculo, float tamanhoVeiculo, float pesoVeiculo, int qtdeEixos) {
        super(idCliente, null, cpf, cnh, email, senha); 
        this.placaVeiculo = placaVeiculo;
        this.tamanhoVeiculo = tamanhoVeiculo;
        this.pesoVeiculo = pesoVeiculo;
        this.qtdeEixos = qtdeEixos;
    }

    public String getPlacaCarro() {
        return placaVeiculo;
    }

    public void setPlacaCarro(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }


    public float getTamanhoCarro() {
        return tamanhoVeiculo;
    }

    public void setTamanhoCarro(float tamanhoVeiculo) {
        this.tamanhoVeiculo = tamanhoVeiculo;
    }

    public float getPesoCarro() {
        return pesoVeiculo;
    }

    public void setPesoCarro(float pesoVeiculo) {
        this.pesoVeiculo = pesoVeiculo;
    }

    public int getQtdeRodas() {
        return qtdeEixos;
    }

    public void setQtdeRodas(int qtdeEixos) {
        this.qtdeEixos = qtdeEixos;
    }

    @Override
    public String toString() {
        return "ID: " + getIdCliente() + "\n Cpf: " + getCpf() + "\n Placa do carro: " + getPlacaCarro() + "\n Cnh: " + getCnh() + 
                "\n Tamanho do carro: " + getTamanhoCarro() + "\n Peso do carro: " + getPesoCarro() + "\n Quantidade de rodas: " + getQtdeRodas();
    }	
}