package com.adopethub.service;
import com.adopethub.domain.Animal;
import com.adopethub.domain.StatusAnimal;
import com.adopethub.infra.Repositorio;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalService {
    private Repositorio repo;
    public AnimalService(Repositorio repo) { this.repo = repo; }
    public void cadastrar(Animal animal) { repo.animais.add(animal); }
    public List<Animal> listarDisponiveis() {
        return repo.animais.stream()
                .filter(a -> a.getStatus() == StatusAnimal.DISPONIVEL)
                .collect(Collectors.toList());
    }
}
