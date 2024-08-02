package com.estudos.api.adapter.api.produto;

import java.util.Collection;

import com.estudos.api.adapter.api.model.ProdutoDto;
import com.estudos.api.application.ports.persistence.entrypoint.produto.FindProdutoPort;

public class FindProdutoAdapter implements FindProdutoPort{

	@Override
	public Collection<ProdutoDto> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProdutoDto fetchById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
