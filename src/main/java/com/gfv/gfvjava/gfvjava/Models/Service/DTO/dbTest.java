package com.gfv.gfvjava.gfvjava.Models.Service.DTO;

public class dbTest {
    private int id;
    private String name;
    private String idade;

    public dbTest() {
    }

    public dbTest(int id, String name, String idade) {
        this.id = id;
        this.name = name;
        this.idade = idade;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
}
