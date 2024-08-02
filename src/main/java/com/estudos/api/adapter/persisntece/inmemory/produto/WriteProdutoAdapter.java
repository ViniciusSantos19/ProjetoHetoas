package com.estudos.api.adapter.persisntece.inmemory.produto;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.estudos.api.adapter.persisntece.inmemory.mappers.ProdutoMapper;
import com.estudos.api.adapter.persisntece.inmemory.repositories.ProdutoRepository;
import com.estudos.api.application.ports.persistence.produto.WriteProdutoPort;
import com.estudos.api.domain.Produto;

@Component
public class WriteProdutoAdapter implements WriteProdutoPort{

	@Autowired
	private ProdutoRepository repository;
	
	private ProdutoMapper produtoInMemoryEntityMapper;
	
	@Override
	public Produto saveNew(Produto domain) {
		var produtoEntity = produtoInMemoryEntityMapper.mapToRest(domain);
		var savedProduct = repository.save(produtoEntity);
		return produtoInMemoryEntityMapper.mapToDomain(savedProduct);
	}

	@Override
	public Optional<Produto> update(Produto domain) {
		var produtoEntity = produtoInMemoryEntityMapper.mapToRest(domain);
		var updatedProduto = repository.update(produtoEntity, produtoEntity.getId());
		return updatedProduto.map(produtoInMemoryEntityMapper::mapToDomain);
	}

	@Override
	public void delete(Long id) {
		repository.delete(id);
	}

}
