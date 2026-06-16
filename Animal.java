package com.adopethub.domain;
public class Animal {
    private int id;
    private String nome;
    private StatusAnimal status;

    public Animal(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.status = StatusAnimal.DISPONIVEL;
    }
    public int getId() { return id; }
    public String getNome() { return nome; }
    public StatusAnimal getStatus() { return status; }
    public void setStatus(StatusAnimal status) { this.status = status; }
}
