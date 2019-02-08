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

import com.p2lp2.domain.Cliente;
import com.p2lp2.repository.ClienteRepository;

@RestController
public class ClienteResource {
	//POST, GET, PUT, DELETE
	
	@Autowired // vai dar new automaticamente
	private ClienteRepository repository;
	
	@GetMapping("/clientes")  //vai recuperar todas as pessoas
	public List<Cliente> getAllCliente(){
		List<Cliente> cliente = repository.findAll();
		return cliente;
	}
	
	//vai pegar apartir do corpo da requisição
	@PostMapping("/clientes")
	public ResponseEntity<?> saveCliente(@RequestBody Cliente cliente) {
		Cliente savedCliente = repository.save(cliente);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedCliente.getId()).toUri();
		return ResponseEntity.created(uri).body("Nome e Id do novo cliente" + savedCliente.getNome() + " - " + savedCliente.getId());
	}
	
	@PutMapping("/clientes/{id}")
	public ResponseEntity<?> updateCliente(@RequestBody Cliente cliente,@PathVariable int id ){
		Optional<Cliente> clienteFound = repository.findById(id);
		if(!clienteFound.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		cliente.setId(id);
		repository.save(cliente);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/clientes/{id}")
	public void deleteCliente(@PathVariable int id) {
		Optional<Cliente> clienteFound = repository.findById(id);
		if(clienteFound.isPresent()) {
			repository.deleteById(id);
		}
	}
}





