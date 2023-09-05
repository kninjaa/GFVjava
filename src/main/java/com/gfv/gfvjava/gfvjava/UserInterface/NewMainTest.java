package com.gfv.gfvjava.gfvjava.UserInterface;

import com.gfv.gfvjava.gfvjava.Models.Service.ServiceLayer.CClienteSL;

public class NewMainTest {
    public static void main(String[] args) {
        CClienteSL ClienteService = new CClienteSL();
        ClienteService.createTable();
    } 
}
