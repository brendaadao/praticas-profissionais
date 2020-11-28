package com.marido.aluguel.marido.com.marido.aluguel.marido.Domain;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("ServicoCollection")
public class ServicoDomain {
	
	private String nome;
	
	private BigDecimal preco;
	
	private String descricao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
