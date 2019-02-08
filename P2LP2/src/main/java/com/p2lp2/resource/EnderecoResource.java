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

import com.p2lp2.domain.Endereco;
import com.p2lp2.repository.EnderecoRepository;


@RestController
public class EnderecoResource {

		@Autowired
		private EnderecoRepository repository;
		
		@GetMapping("/enderecos") 
		public List<Endereco> getAllEndereco(){
			List<Endereco> endereco = repository.findAll();
			return endereco;
		}
		
		@PostMapping("/enderecos")
		public ResponseEntity<?> saveEndereco(@RequestBody Endereco endereco) {
			Endereco savedEndereco = repository.save(endereco);
			
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedEndereco.getId()).toUri();
			return ResponseEntity.created(uri).body("Id da nova venda:  " + savedEndereco.getId());
		}
		
		@PutMapping("/enderecos/{id}")
		public ResponseEntity<?> updateEndereco(@RequestBody Endereco endereco,@PathVariable int id ){
			Optional<Endereco> enderecoFound = repository.findById(id);
			if(!enderecoFound.isPresent()) {
				return ResponseEntity.notFound().build();
			}
			
			endereco.setId(id);
			repository.save(endereco);
			
			return ResponseEntity.noContent().build();
		}
		@DeleteMapping("/enderecos/{id}")
		public void deleteEndereco(@PathVariable int id) {
			Optional<Endereco> enderecoFound = repository.findById(id);
			if(enderecoFound.isPresent()) {
				repository.deleteById(id);
			}
		}
}
