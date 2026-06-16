package com.adopethub.service;
import com.adopethub.domain.Usuario;
import com.adopethub.infra.Repositorio;

public class UsuarioService {
    private Repositorio repo;
    public UsuarioService(Repositorio repo) { this.repo = repo; }
    public void cadastrar(Usuario usuario) { repo.usuarios.add(usuario); }
}
