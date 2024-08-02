package com.estudos.api.adapter.api.model;

import java.util.Objects;

import org.springframework.hateoas.RepresentationModel;

import com.estudos.api.domain.enums.Categoria;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class ProdutoDto extends RepresentationModel<ProdutoDto>{
	@JsonProperty("id")
	private Long key;
	private String nome;
	private Double preco;
	private String descricao;
	private Boolean disponivel;
	private Categoria catogoria;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoDto other = (ProdutoDto) obj;
		return catogoria == other.catogoria && Objects.equals(descricao, other.descricao)
				&& Objects.equals(disponivel, other.disponivel) && Objects.equals(key, other.key)
				&& Objects.equals(nome, other.nome) && Objects.equals(preco, other.preco);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(catogoria, descricao, disponivel, key, nome, preco);
		return result;
	}
	
	
	
}
