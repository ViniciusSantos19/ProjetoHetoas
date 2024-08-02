package com.estudos.api.domain;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarrinhoDeCompra {
	private Long id;
	private Set<ItemCarrinho> produtos;
}
