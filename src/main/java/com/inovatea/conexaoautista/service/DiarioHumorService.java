package com.inovatea.conexaoautista.service;

import com.inovatea.conexaoautista.model.DiarioHumor;
import com.inovatea.conexaoautista.repository.DiarioHumorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiarioHumorService {
    private final DiarioHumorRepository repository;
     @Autowired
    private DiarioHumorRepository diarioHumorRepository;
    public DiarioHumorService(DiarioHumorRepository repository) {
        this.repository = repository;
    }
    public DiarioHumor salvar(DiarioHumor diarioHumor) {
        return repository.save(diarioHumor);
    }
    public List<DiarioHumor> listar() {
        return repository.findAll();
    }
    public DiarioHumor buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    } 
    public DiarioHumor atualizar(Long id, DiarioHumor atualizado) {
        return diarioHumorRepository.findById(id).map(diario -> {
            diario.setData(atualizado.getData());
            diario.setHumor(atualizado.getHumor());
            diario.setObservacoes(atualizado.getObservacoes());
            diario.setUsuario(atualizado.getUsuario()); // cuidado: o usuário deve existir!
            return diarioHumorRepository.save(diario);
        }).orElseThrow(() -> new RuntimeException("Diário de humor não encontrado com ID: " + id));
    }
}
