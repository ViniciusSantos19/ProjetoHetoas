package com.estudos.api.application.service.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.api.application.ports.persistence.produto.WriteProdutoPort;
import com.estudos.api.application.usecases.produto.UpdateProdutoUseCase;
import com.estudos.api.domain.Produto;
import com.estudos.api.domain.exceptions.DomainNotFoundException;

@Service
public class UpdateProdutoByIdService implements UpdateProdutoUseCase{

	@Autowired
	private WriteProdutoPort writeProdutoPort;

	@Override
	public Produto update(Produto produto) {
		var produtoUpdated = writeProdutoPort.update(produto).orElseThrow(DomainNotFoundException::new);
		return produtoUpdated;
	}
	
}
