package com.gfv.gfvjava.gfvjava.UserInterface.views;

import com.gfv.gfvjava.gfvjava.Models.Service.DTO.CadastrarCliente;
import java.util.Scanner;


public class testview {
    private Scanner scanner;

    public testview() {
        scanner = new Scanner(System.in);
    }
    
    public CadastrarCliente solicitarDadosCliente() {
        System.out.println("Cadastro de Cliente");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("CNH: ");
        String cnh = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        return new CadastrarCliente(nome, cpf, cnh, email, senha);
    }
}
