package com.p2lp2.resource;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.p2lp2.domain.Funcionario;
import com.p2lp2.repository.FuncionarioRepository;


@RestController

public class FuncionarioResource {
	
	@Autowired 
	private FuncionarioRepository repository;
	
	@GetMapping("/funcionarios") 
	public List<Funcionario> getAllFuncionario(){
		List<Funcionario> funionarios = repository.findAll();
		return funionarios;
	}
	
	
	@PostMapping("/funcionarios")
	public ResponseEntity<?> saveFuncionario(@RequestBody Funcionario funcionario) {
		Funcionario savedFuncionario = repository.save(funcionario);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedFuncionario.getId()).toUri();
		return ResponseEntity.created(uri).body("Nome e Id da nova pessoa" + savedFuncionario.getCpf() + " - " + savedFuncionario.getId());
	}
	@PutMapping("/funcionarios/{id}")
	public ResponseEntity<?> updateFornecedor(@RequestBody Funcionario funcionario,@PathVariable int id ){
		Optional<Funcionario> funcionarioFound = repository.findById(id);
		if(!funcionarioFound.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		funcionario.setId(id);
		repository.save(funcionario);
		
		return ResponseEntity.noContent().build();
	}
	@DeleteMapping("/funcionarios/{id}")
	public void deleteFuncionario(@PathVariable int id) {
		Optional<Funcionario> funcionarioFound = repository.findById(id);
		if(funcionarioFound.isPresent()) {
			repository.deleteById(id);
		}
	}
}
