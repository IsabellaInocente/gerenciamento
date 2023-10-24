package com.hospedagem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospedagem.entites.Tarefa;
import com.hospedagem.repository.TarefaRepository;

@Service
public class TarefaService {
	
	private final TarefaRepository tarefaRepository;
	
	@Autowired
	public TarefaService(TarefaRepository tarefaRepository) {
		this.tarefaRepository = tarefaRepository;
	}
	public List <Tarefa> buscaTarefa(){
		return tarefaRepository.findAll();
	}
	public Tarefa buscaTarefaId(Long id) {
		Optional <Tarefa> tarefa = tarefaRepository.findById(id);
		return tarefa.orElse(null);
	}
	public Tarefa SalvaTarefa(Tarefa tarefa) {
		return tarefaRepository.save(tarefa);
	}
	public Tarefa mudarTarefa(Long id, Tarefa mudarTarefa) {
		Optional <Tarefa> existeTarefa = tarefaRepository.findById(id);
		if(existeTarefa.isPresent()) {
			mudarTarefa.setId(id);
			return tarefaRepository.save(mudarTarefa);
		}
		return null;
	}
	public boolean apagarTarefa(Long  id) {
		Optional <Tarefa> existeTarefa = tarefaRepository.findById(id);
		if(existeTarefa.isPresent()) {
			tarefaRepository.deleteById(id);
			return true;	
	}
		return false;
	}


}
