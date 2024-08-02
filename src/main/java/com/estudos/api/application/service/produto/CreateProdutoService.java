package com.estudos.api.application.service.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.api.application.ports.persistence.produto.WriteProdutoPort;
import com.estudos.api.application.usecases.produto.CreateNewProdutoUseCase;
import com.estudos.api.domain.Produto;

@Service
public class CreateProdutoService implements CreateNewProdutoUseCase{
	
	@Autowired
	private WriteProdutoPort writeProdutoPort;

	@Override
	public Produto saveNew(Produto produto) {
		return writeProdutoPort.saveNew(produto);
	}
	
	
	
}
