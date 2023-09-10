package com.gfv.gfvjava.gfvjava.Models.Service.DTO;

public class SolicitarCarroCliente extends CadastrarCliente {
    private int idVeiculo;
    private int idTipo;
    private String marca;
    private String modelo;
    private String placaVeiculo;
    private String customizado;
    private String blindado;
    private String carga;
    private String tamanhoVeiculo;
    private double pesoVeiculo;
    private int qtdeEixos;

    public SolicitarCarroCliente(String marca, String modelo, String placaVeiculo,
                                 String customizado, String blindado, String carga, String tamanhoVeiculo,
                                 double pesoVeiculo, int qtdeEixos) {
        super(0);
        this.idVeiculo = 0;
        this.idTipo = 0;
        this.marca = marca;
        this.modelo = modelo;
        this.placaVeiculo = placaVeiculo;
        this.customizado = customizado;
        this.blindado = blindado;
        this.carga = carga;
        this.tamanhoVeiculo = tamanhoVeiculo;
        this.pesoVeiculo = pesoVeiculo;
        this.qtdeEixos = qtdeEixos;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getCustomizado() {
        return customizado;
    }

    public void setCustomizado(String customizado) {
        this.customizado = customizado;
    }

    public String getBlindado() {
        return blindado;
    }

    public void setBlindado(String blindado) {
        this.blindado = blindado;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public String getTamanhoVeiculo() {
        return tamanhoVeiculo;
    }

    public void setTamanhoVeiculo(String tamanhoVeiculo) {
        this.tamanhoVeiculo = tamanhoVeiculo;
    }

    public double getPesoVeiculo() {
        return pesoVeiculo;
    }

    public void setPesoVeiculo(double pesoVeiculo) {
        this.pesoVeiculo = pesoVeiculo;
    }

    public int getQtdeEixos() {
        return qtdeEixos;
    }

    public void setQtdeEixos(int qtdeEixos) {
        this.qtdeEixos = qtdeEixos;
    }

    @Override
    public String toString() {
        return "SolicitarCarroCliente{" +
                "idVeiculo=" + idVeiculo +
                ", marca ='" + marca + '\'' +
                ", modelo ='" + modelo + '\'' +
                ", placaVeiculo='" + placaVeiculo + '\'' +
                ", customizado=" + customizado +
                ", blindado=" + blindado +
                ", carga=" + carga +
                ", tamanhoVeiculo='" + tamanhoVeiculo + '\'' +
                ", pesoVeiculo=" + pesoVeiculo +
                ", qtdeEixos=" + qtdeEixos +
                "} " + super.toString();
    }
}
