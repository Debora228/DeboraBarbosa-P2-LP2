package com.p2lp2.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private int telefone;
	
	@JsonManagedReference//referencia gerenciada
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoa")
	private List<Endereco> enderecos;
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
	private List<Venda> vendas;
	
	public Cliente() {}

	public Cliente(String nome, int telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.enderecos = new ArrayList<Endereco>();
		this.vendas = new ArrayList<Venda>();
	}


	public List<Venda> getVendas() {
		return vendas;
	}
	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}