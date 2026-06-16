package com.adopethub.domain;
public class SolicitacaoAdocao {
    private Animal animal;
    private Usuario adotante;
    private StatusSolicitacao status;
    private int aprovacoesAdmin; // Regra de dupla aprovação

    public SolicitacaoAdocao(Animal animal, Usuario adotante) {
        this.animal = animal;
        this.adotante = adotante;
        this.status = StatusSolicitacao.PENDENTE;
        this.aprovacoesAdmin = 0;
    }
    public void adicionarAprovacao() { this.aprovacoesAdmin++; }
    public int getAprovacoesAdmin() { return aprovacoesAdmin; }
    public void setStatus(StatusSolicitacao status) { this.status = status; }
    public StatusSolicitacao getStatus() { return status; }
    public Animal getAnimal() { return animal; }
    public Usuario getAdotante() { return adotante; }
}
