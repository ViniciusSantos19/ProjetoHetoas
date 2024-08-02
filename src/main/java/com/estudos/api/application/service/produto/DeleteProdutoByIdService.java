package com.estudos.api.application.service.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudos.api.application.ports.persistence.produto.ReadProdutoPort;
import com.estudos.api.application.ports.persistence.produto.WriteProdutoPort;
import com.estudos.api.application.usecases.produto.DeleteProdutoUseCase;
import com.estudos.api.domain.exceptions.DomainNotFoundException;

@Service
public class DeleteProdutoByIdService implements DeleteProdutoUseCase{

	@Autowired
	private WriteProdutoPort writeProdutoPort;
	
	@Autowired
	private ReadProdutoPort readProdutoPort;
	
	@Override
	public void delete(Long id) {
		readProdutoPort.findById(id).orElseThrow(DomainNotFoundException::new);
		
		writeProdutoPort.delete(id);
	}

}
