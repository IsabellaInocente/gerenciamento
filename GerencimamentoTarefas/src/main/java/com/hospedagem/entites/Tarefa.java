package com.hospedagem.entites;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "tarefas")
public class Tarefa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "datalimiteex")
	private String dataLimiteEx;
	
	@Column(name = "detalhestarefas")
	private String detalhesTarefas;
	
	@Column(name = "statusTarefas")
	private String statusTarefas;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getdataLimiteEx() {
		return dataLimiteEx;
	}
	public void setdataLimiteEx(String dataLimiteEx) {
		this.dataLimiteEx = dataLimiteEx;
	}
	public String getdetalhesTarefas() {
		return detalhesTarefas;
	}
	public void setdetalesTarefas(String detalhesTarefas) {
		this.detalhesTarefas = detalhesTarefas;
	}
	public String getstatusTarefas() {
		return statusTarefas;
	}
	public void setstatusTarefas(String statusTarefas) {
		this.statusTarefas = statusTarefas;
	}
}

