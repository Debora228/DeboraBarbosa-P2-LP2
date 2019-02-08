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
public class Fornecedor { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cnpj;
	
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "fornecedor")
	private List<Produto> produto;
	
	
	
	public Fornecedor() {}

	public Fornecedor( String cnpj) {
		super();
		this.cnpj = cnpj;
		this.produto = new ArrayList<Produto>();
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public List<Produto> getProduto() {
		return produto;
	}

	public void setProdutos(List<Produto> produto) {
		this.produto = produto;
	}
	
}