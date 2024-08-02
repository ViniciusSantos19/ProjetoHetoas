package com.estudos.api.adapter.api.model;

import com.estudos.api.domain.enums.Categoria;

public record SaveProdutoDto(String nome,
		Double preco,
		String descricao,
		Boolean disponivel,
		Categoria catogoria) {

}
