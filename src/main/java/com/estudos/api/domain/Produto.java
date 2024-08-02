package com.estudos.api.domain;

import com.estudos.api.domain.enums.Categoria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
	private Long id;
	private String nome;
	private Double preco;
	private String descricao;
	private Boolean disponivel;
	private Categoria catogoria;
}
