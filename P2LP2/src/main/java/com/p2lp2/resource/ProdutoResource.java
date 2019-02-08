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

import com.p2lp2.domain.Produto;
import com.p2lp2.repository.ProdutoRepository;


@RestController
public class ProdutoResource {

		@Autowired
		private ProdutoRepository repository;
		
		@GetMapping("/produtos") 
		public List<Produto> getAllProduto(){
			List<Produto> produtos = repository.findAll();
			return produtos;
		}
		
		@PostMapping("/produtos")
		public ResponseEntity<?> saveProduto(@RequestBody Produto produto) {
			Produto savedProduto = repository.save(produto);
			
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedProduto.getId()).toUri();
			return ResponseEntity.created(uri).body("Nome e Id do novo produto: " + savedProduto.getNome() + " - " + savedProduto.getId());
		}
		
		@PutMapping("/produtos/{id}")
		public ResponseEntity<?> updateProduto(@RequestBody Produto produto,@PathVariable int id ){
			Optional<Produto> produtoFound = repository.findById(id);
			if(!produtoFound.isPresent()) {
				return ResponseEntity.notFound().build();
			}
			
			produto.setId(id);
			repository.save(produto);
			
			return ResponseEntity.noContent().build();
		}
		@DeleteMapping("/produtos/{id}")
		public void deleteProduto(@PathVariable int id) {
			Optional<Produto> produtoFound = repository.findById(id);
			if(produtoFound.isPresent()) {
				repository.deleteById(id);
			}
		}
}
