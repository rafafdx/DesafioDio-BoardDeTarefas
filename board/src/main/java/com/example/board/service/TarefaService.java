package com.example.board.service;

import com.example.board.model.Tarefa;
import com.example.board.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public List<Tarefa> listarTodas() {
        return repository.findAll();
    }

    public Tarefa salvar(Tarefa tarefa) {
        return repository.save(tarefa);
    }
}
