package com.estudos.api.application.service.produto;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.api.application.ports.persistence.produto.ReadProdutoPort;
import com.estudos.api.application.usecases.produto.FetchAllProdutos;
import com.estudos.api.application.usecases.produto.FindProdutoUseCase;
import com.estudos.api.domain.Produto;
import com.estudos.api.domain.exceptions.DomainNotFoundException;

@Service
public class FindProdutoService implements FindProdutoUseCase, FetchAllProdutos{

	@Autowired
	private ReadProdutoPort readProdutoPort;

	@Override
	public Collection<Produto> fetchAll() {
		return readProdutoPort.findAll();
	}

	@Override
	public Produto findById(Long id) {
		var produto = readProdutoPort.findById(id).orElseThrow(DomainNotFoundException::new);
		return produto;
	}
	
}
