package br.com.senior.crudSpring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senior.crudSpring.entity.Aluno;

public interface AlunoRepo extends JpaRepository<Aluno, Long> {

	List<Aluno> findAlunoById(Long id);

}
