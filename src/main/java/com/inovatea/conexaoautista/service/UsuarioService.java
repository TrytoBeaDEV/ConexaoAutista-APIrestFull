package com.inovatea.conexaoautista.service;

import com.inovatea.conexaoautista.model.Usuario;
import com.inovatea.conexaoautista.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository repository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }
    public Usuario salvar(Usuario usuario) {
        return repository.save(usuario);
    }
    public List<Usuario> listar() {
        return repository.findAll();
    }
    public Usuario buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
    public Usuario atualizar(Long id, Usuario usuarioAtualizado) {
    Usuario usuarioExistente = usuarioRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Usuário não encontrado com ID: " + id));

    usuarioExistente.setNome(usuarioAtualizado.getNome());
    usuarioExistente.setEmail(usuarioAtualizado.getEmail());
    usuarioExistente.setSenha(usuarioAtualizado.getSenha());
    usuarioExistente.setTipo(usuarioAtualizado.getTipo());

    return usuarioRepository.save(usuarioExistente);
    }
}
