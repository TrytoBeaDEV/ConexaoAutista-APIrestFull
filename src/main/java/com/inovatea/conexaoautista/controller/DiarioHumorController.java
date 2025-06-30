package com.inovatea.conexaoautista.controller;

import com.inovatea.conexaoautista.model.DiarioHumor;
import com.inovatea.conexaoautista.service.DiarioHumorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diarios")
public class DiarioHumorController {
    private final DiarioHumorService service;

     @Autowired
    private DiarioHumorService diarioHumorService;

    public DiarioHumorController(DiarioHumorService service) {
        this.service = service;
    }

    @PostMapping
    public DiarioHumor salvar(@RequestBody DiarioHumor diarioHumor) {
        return service.salvar(diarioHumor);
    }

    @GetMapping
    public List<DiarioHumor> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public DiarioHumor buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.excluir(id);
    }
    @PutMapping("/{id}")
    public ResponseEntity<DiarioHumor> atualizar(@PathVariable Long id, @RequestBody DiarioHumor atualizado) {
        DiarioHumor atualizadoSalvo = diarioHumorService.atualizar(id, atualizado);
        return ResponseEntity.ok(atualizadoSalvo);
    }
}
