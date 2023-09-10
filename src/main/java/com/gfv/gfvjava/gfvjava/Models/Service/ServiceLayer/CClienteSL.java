package com.gfv.gfvjava.gfvjava.Models.Service.ServiceLayer;

import com.gfv.gfvjava.gfvjava.Models.Service.DAO.Mapping.ClienteMap.CadastrarClienteMapping;


public class CClienteSL {
    private final CadastrarClienteMapping CadastrarClienteMapping;

    public CClienteSL() {
        this.CadastrarClienteMapping = new CadastrarClienteMapping();
    }
    
    public void inserirCliente(String nome, String cpf, String cnh, String email, String senha) {
        CadastrarClienteMapping.inserirDadosCliente(nome, cpf, cnh, email, senha);
    }
}
