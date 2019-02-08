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

import com.p2lp2.domain.Fornecedor;
import com.p2lp2.repository.FornecedorRepository;


@RestController
public class FornecedorResource {

	@Autowired 
	private FornecedorRepository repository;
	
	@GetMapping("/fornecedores")  
	public List<Fornecedor> getAllFornecedor(){
		List<Fornecedor> fornecedores = repository.findAll();
		return fornecedores;
	}
	
	@PostMapping("/fornecedores")
	public ResponseEntity<?> saveFornecedor(@RequestBody Fornecedor fornecedor) {
		Fornecedor savedFornecedor = repository.save(fornecedor);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedFornecedor.getId()).toUri();
		
		return ResponseEntity.created(uri).body("Nome e Id do novo fornecedor" + savedFornecedor.getCnpj() + " - " + savedFornecedor.getId());
	}

	@PutMapping("/fornecedores/{id}")
	public ResponseEntity<?> updateFornecedor(@RequestBody Fornecedor fornecedor,@PathVariable int id ){
		Optional<Fornecedor> fornecedorFound = repository.findById(id);
		if(!fornecedorFound.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		fornecedor.setId(id);
		repository.save(fornecedor);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/fornecedores/{id}")
	public void deleteFornecedor(@PathVariable int id) {
		Optional<Fornecedor> fornecedorFound = repository.findById(id);
		if(fornecedorFound.isPresent()) {
			repository.deleteById(id);
		}
	}
}