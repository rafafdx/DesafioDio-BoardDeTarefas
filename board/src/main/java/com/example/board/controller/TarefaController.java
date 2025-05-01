package com.example.board.controller;

import com.example.board.model.Tarefa;
import com.example.board.service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Tarefa> listar() {
        return service.listarTodas();
    }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return service.salvar(tarefa);
    }
}
