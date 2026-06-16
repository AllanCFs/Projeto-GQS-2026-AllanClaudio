package com.adopethub.service;
import com.adopethub.domain.Animal;
import com.adopethub.domain.StatusAnimal;
import com.adopethub.infra.Repositorio;

public class RelatorioService {
    private Repositorio repo;
    public RelatorioService(Repositorio repo) { this.repo = repo; }
    public long contarAdocoesMes() {
        return repo.animais.stream().filter(a -> a.getStatus() == StatusAnimal.ADOTADO).count();
    }
}
