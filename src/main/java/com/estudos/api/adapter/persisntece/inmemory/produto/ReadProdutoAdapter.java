package com.estudos.api.adapter.persisntece.inmemory.produto;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.estudos.api.adapter.persisntece.inmemory.mappers.ProdutoMapper;
import com.estudos.api.adapter.persisntece.inmemory.repositories.ProdutoRepository;
import com.estudos.api.application.ports.persistence.produto.ReadProdutoPort;
import com.estudos.api.domain.Produto;

@Component
public class ReadProdutoAdapter implements ReadProdutoPort {

	@Autowired
	private ProdutoRepository repository;
	
	@Autowired
	private ProdutoMapper produtoInMemoryMapper;
	
	@Override
	public Optional<Produto> findById(Long id) {
		return repository.findById(id).map(produtoInMemoryMapper::mapToDomain);
	}

	@Override
	public List<Produto> findAll() {
		return repository.getAll()
				.stream()
				.map(produtoInMemoryMapper::mapToDomain)
				.collect(Collectors.toList());
	}

}
