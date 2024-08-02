package com.estudos.api.adapter.api.produto;

import org.springframework.beans.factory.annotation.Autowired;

import com.estudos.api.adapter.api.mappers.ProdutoRestMapper;
import com.estudos.api.adapter.api.model.ProdutoDto;
import com.estudos.api.application.ports.persistence.entrypoint.produto.ChangeProdutoPort;
import com.estudos.api.application.usecases.produto.CreateNewProdutoUseCase;
import com.estudos.api.application.usecases.produto.DeleteProdutoUseCase;
import com.estudos.api.application.usecases.produto.UpdateProdutoUseCase;

public class ChangeProdutoAdapter implements ChangeProdutoPort{

	@Autowired
	private CreateNewProdutoUseCase createNewProdutoUseCase;
	
	@Autowired
	private UpdateProdutoUseCase updateProdutoUseCase;
	
	@Autowired
	private DeleteProdutoUseCase deleteProdutoUseCase;
	
	@Autowired
	private ProdutoRestMapper produtoRestMapper;
	
	@Override
	public ProdutoDto save(ProdutoDto t) {
		var produtoDomain = produtoRestMapper.mapToDomain(t);
		var savedProduto =  createNewProdutoUseCase.saveNew(produtoDomain);
		
		return null;
	}

	@Override
	public ProdutoDto updateById(Long id, ProdutoDto t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
