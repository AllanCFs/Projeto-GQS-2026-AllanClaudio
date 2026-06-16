package com.adopethub.domain;
public class Usuario {
    private int id;
    private String nome;
    private boolean historicoDevolucao;

    public Usuario(int id, String nome, boolean historicoDevolucao) {
        this.id = id;
        this.nome = nome;
        this.historicoDevolucao = historicoDevolucao;
    }
    public boolean temHistoricoDevolucao() { return historicoDevolucao; }
}
