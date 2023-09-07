package com.gfv.gfvjava.gfvjava.UserInterface;

import com.gfv.gfvjava.gfvjava.Models.Service.ServiceLayer.CClienteSL;
import com.gfv.gfvjava.gfvjava.UserInterface.views.testview;



public class NewMainTest {
    public static void main(String[] args) {
        testview testview = new testview();
        CClienteSL ClienteService = new CClienteSL();

        
        ClienteService.createTable();
    } 
}
