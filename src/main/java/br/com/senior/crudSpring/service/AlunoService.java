package br.com.senior.crudSpring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senior.crudSpring.entity.Aluno;
import br.com.senior.crudSpring.repository.AlunoRepo;

@Service
@Transactional
public class AlunoService {

	@Autowired
	private AlunoRepo repo;

	public Aluno addAluno(Aluno aluno) {
		return repo.save(aluno);
	}

	public Aluno updateAluno(Aluno aluno) {
		return repo.save(aluno);
	}

	public List<Aluno> findAll() {
		return repo.findAll();
	}

	public List<Aluno> findAlunoById(Long id) {
		return repo.findAlunoById(id);
	}

	public void deletarAluno(Long id) {
		repo.deleteById(id);

	}

}
