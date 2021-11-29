package br.com.senior.crudSpring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "alunos")
@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_aluno")
	private Long id;

	@Column(name = "nome_aluno")
	private String nome;

	@Column(name = "idade_aluno")
	private int idade;

	public Aluno(Long id, String nome, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;

	}

	@Deprecated
	public Aluno() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
