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

import com.p2lp2.domain.Venda;
import com.p2lp2.repository.VendaRepository;


@RestController
public class VendaResource {
	@Autowired
	private VendaRepository repository;
	
	@GetMapping("/vendas") 
	public List<Venda> getAllVenda(){
		List<Venda> vendas = repository.findAll();
		return vendas;
	}
	
	@PostMapping("/vendas")
	public ResponseEntity<?> saveVenda(@RequestBody Venda venda) {
		Venda savedVenda = repository.save(venda);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedVenda.getId()).toUri();
		return ResponseEntity.created(uri).body("Id da nova venda:  " + savedVenda.getId());
	}
	
	@PutMapping("/vendas/{id}")
	public ResponseEntity<?> updateVenda(@RequestBody Venda venda,@PathVariable int id ){
		Optional<Venda> vendaFound = repository.findById(id);
		if(!vendaFound.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		venda.setId(id);
		repository.save(venda);
		
		return ResponseEntity.noContent().build();
	}
	@DeleteMapping("/vendas/{id}")
	public void deleteVenda(@PathVariable int id) {
		Optional<Venda> vendaFound = repository.findById(id);
		if(vendaFound.isPresent()) {
			repository.deleteById(id);
		}
	}
}
