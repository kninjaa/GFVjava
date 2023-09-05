package com.gfv.gfvjava.gfvjava.Models.Service.ServiceLayer;

import com.gfv.gfvjava.gfvjava.Models.Service.DAO.Mapping.ClienteMap.CadastrarClienteMapping;
import com.gfv.gfvjava.gfvjava.Models.Service.DAO.*;


public class CClienteSL {
    private final CadastrarClienteMapping CadastrarClienteMapping;

    public CClienteSL() {
        this.CadastrarClienteMapping = new CadastrarClienteMapping();
    }

    public void createTable() {
        CadastrarClienteMapping.createTable();
    }
}
