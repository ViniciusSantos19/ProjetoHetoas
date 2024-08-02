package com.estudos.api.adapter.persisntece.inmemory.model;

import com.estudos.api.domain.enums.Categoria;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class ProdutoEntity implements Entity{
	private Long id;
	private String nome;
	private Double preco;
	private String descricao;
	private Boolean disponivel;
	private Categoria catogoria;
}
