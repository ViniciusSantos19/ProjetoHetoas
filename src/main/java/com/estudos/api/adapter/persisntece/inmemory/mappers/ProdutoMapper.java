package com.estudos.api.adapter.persisntece.inmemory.mappers;

import org.springframework.stereotype.Component;

import com.estudos.api.adapter.persisntece.inmemory.model.ProdutoEntity;
import com.estudos.api.domain.Produto;
import com.estudos.api.shared.RestConverter;
@Component
public class ProdutoMapper implements RestConverter<Produto, ProdutoEntity>{
	
	
	@Override
	public Produto mapToDomain(ProdutoEntity restObject) {
		return new Produto(restObject.getId(),
				restObject.getNome(),
				restObject.getPreco(),
				restObject.getDescricao(),
				restObject.getDisponivel(),
				restObject.getCatogoria());
	}
	
	
	@Override
	public ProdutoEntity mapToRest(Produto domainObject) {
		return new ProdutoEntity(domainObject.getId(),
				domainObject.getNome(),
				domainObject.getPreco(),
				domainObject.getDescricao(),
				domainObject.getDisponivel(),
				domainObject.getCatogoria());
	}
	
}
