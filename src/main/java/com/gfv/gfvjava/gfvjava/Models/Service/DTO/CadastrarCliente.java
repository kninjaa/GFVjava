package com.gfv.gfvjava.gfvjava.Models.Service.DTO;

import org.mindrot.jbcrypt.BCrypt;

public class CadastrarCliente {
    private int idCliente;
    private String nome;
    private String cpf;
    private String cnh;
    private String email;
    private String senha;
    //id do veiculo 

    public CadastrarCliente(String nome1, String cpf1, String cnh1, String email1, String senha1) {}

    public CadastrarCliente(int idCliente, String nome, String cpf, String cnh, String email, String senha) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.cnh = cnh;
        this.email = email;
        this.senha = senha;
        setSenha(senha);
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        // Gere um hash BCrypt a partir da senha fornecida
        String hashedSenha = BCrypt.hashpw(senha, BCrypt.gensalt());
        this.senha = hashedSenha;
    }

    public boolean verificarSenha(String senha) {
        // Verifique se a senha fornecida corresponde ao hash armazenado no objeto
        return BCrypt.checkpw(senha, this.senha);
    }
}