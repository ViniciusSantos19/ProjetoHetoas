package com.estudos.api.application.usecases.produto;

import java.util.Collection;

import com.estudos.api.domain.Produto;

public interface FetchAllProdutos {
	Collection<Produto> fetchAll();
}
