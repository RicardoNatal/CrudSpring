package br.com.senior.crudSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senior.crudSpring.entity.Aluno;
import br.com.senior.crudSpring.service.AlunoService;

@RestController
@RequestMapping("/")
public class AlunoResources {

	@Autowired
	private AlunoService service;

	@PostMapping()
	public ResponseEntity<Aluno> addAluno(@RequestBody Aluno aluno) {
		Aluno newaluno = service.addAluno(aluno);
		return new ResponseEntity<>(newaluno, HttpStatus.CREATED);
	}

	@PutMapping()
	public ResponseEntity<Aluno> updateAluno(@RequestBody Aluno aluno) {
		Aluno newaluno = service.updateAluno(aluno);
		return new ResponseEntity<>(newaluno, HttpStatus.OK);
	}

	@GetMapping()
	public ResponseEntity<List<Aluno>> listarAluno() {
		List<Aluno> listar = service.findAll();
		return new ResponseEntity<>(listar, HttpStatus.OK);

	}

	@GetMapping("{id}")
	public ResponseEntity<List<Aluno>> listarAlunoId(@PathVariable("id") Long id) {
		List<Aluno> alunos = service.findAlunoById(id);
		return new ResponseEntity<>(alunos, HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public void deletar(@PathVariable("id") Long id) {
		service.deletarAluno(id);
	}

}
