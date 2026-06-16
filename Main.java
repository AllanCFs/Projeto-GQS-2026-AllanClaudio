package com.adopethub.ui;
import com.adopethub.domain.*;
import com.adopethub.infra.Repositorio;
import com.adopethub.service.*;

public class Main {
    public static void main(String[] args) {
        Repositorio repo = new Repositorio();
        AnimalService animalService = new AnimalService(repo);
        AdocaoService adocaoService = new AdocaoService();

        Animal rex = new Animal(1, "Rex");
        animalService.cadastrar(rex);
        Usuario joao = new Usuario(1, "Joao", true); // Histórico ruim!

        System.out.println("Status Rex antes: " + rex.getStatus());
        
        SolicitacaoAdocao sol = adocaoService.criarSolicitacao(rex, joao);
        System.out.println("Status Rex em analise: " + rex.getStatus());
        
        adocaoService.avaliarSolicitacao(sol, true);
        System.out.println("Aprovado 1x (Status Solicitacao): " + sol.getStatus());
        
        adocaoService.avaliarSolicitacao(sol, true);
        System.out.println("Aprovado 2x (Status Solicitacao): " + sol.getStatus());
        System.out.println("Status Rex Final: " + rex.getStatus());
    }
}
