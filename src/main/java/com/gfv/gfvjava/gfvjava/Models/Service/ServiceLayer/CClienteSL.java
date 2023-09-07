package com.gfv.gfvjava.gfvjava.Models.Service.ServiceLayer;

import com.gfv.gfvjava.gfvjava.Models.Service.DAO.Mapping.ClienteMap.CadastrarClienteMapping;


public class CClienteSL {
    private final CadastrarClienteMapping CadastrarClienteMapping;

    public CClienteSL() {
        this.CadastrarClienteMapping = new CadastrarClienteMapping();
    }

    public void createTable() {
        CadastrarClienteMapping.createTable();
    }
    
    public void inserirCliente(String nome, String cpf, String cnh, String email, String senha) {
        CadastrarClienteMapping.inserirCliente(nome, cpf, cnh, email, senha);
    }
}
