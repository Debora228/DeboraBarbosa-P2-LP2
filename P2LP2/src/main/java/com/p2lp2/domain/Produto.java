
package com.p2lp2.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Produto {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String descricao;
	private int quantidade;
	private String marca;
	private double precoVendaUnitario;
	
	@JsonBackReference
	@ManyToOne(optional = false)
	@JoinColumn(name = "fornecedor_id")
	private Fornecedor fornecedor;
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "produto")
	private List<Venda> vendas;
	
	public Produto() {}

	public Produto(String nome, String descricao, int quantidade, String marca, double precoVendaUnitario) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.marca = marca;
		this.precoVendaUnitario = precoVendaUnitario;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecoVendaUnitario() {
		return precoVendaUnitario;
	}

	public void setPrecoVendaUnitario(double precoVendaUnitario) {
		this.precoVendaUnitario = precoVendaUnitario;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}