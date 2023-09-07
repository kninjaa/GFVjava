package com.gfv.gfvjava.gfvjava.Models.Service.DTO;

import com.gfv.gfvjava.gfvjava.Models.Service.DTO.CadastrarCliente;

public class SolicitarCarroCliente extends CadastrarCliente{
	
    private String placaCarro;
    private float tamanhoCarro;
    private float pesoCarro;
    private int qtdeRodas;

    public SolicitarCarroCliente(int idCliente, String cpf, String cnh, String email, String senha, String placaCarro, float tamanhoCarro, float pesoCarro, int qtdeRodas) {
        super(idCliente, null, cpf, cnh, email, senha); 
        this.placaCarro = placaCarro;
        this.tamanhoCarro = tamanhoCarro;
        this.pesoCarro = pesoCarro;
        this.qtdeRodas = qtdeRodas;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }


    public float getTamanhoCarro() {
        return tamanhoCarro;
    }

    public void setTamanhoCarro(float tamanhoCarro) {
        this.tamanhoCarro = tamanhoCarro;
    }

    public float getPesoCarro() {
        return pesoCarro;
    }

    public void setPesoCarro(float pesoCarro) {
        this.pesoCarro = pesoCarro;
    }

    public int getQtdeRodas() {
        return qtdeRodas;
    }

    public void setQtdeRodas(int qtdeRodas) {
        this.qtdeRodas = qtdeRodas;
    }

    @Override
    public String toString() {
        return "ID: " + getIdCliente() + "\n Cpf: " + getCpf() + "\n Placa do carro: " + getPlacaCarro() + "\n Cnh: " + getCnh() + 
                "\n Tamanho do carro: " + getTamanhoCarro() + "\n Peso do carro: " + getPesoCarro() + "\n Quantidade de rodas: " + getQtdeRodas();
    }	
}