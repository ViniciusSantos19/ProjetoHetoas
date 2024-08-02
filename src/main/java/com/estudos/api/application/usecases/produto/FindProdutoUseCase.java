package com.estudos.api.application.usecases.produto;


import com.estudos.api.domain.Produto;

public interface FindProdutoUseCase {
	Produto findById(Long id);
}
