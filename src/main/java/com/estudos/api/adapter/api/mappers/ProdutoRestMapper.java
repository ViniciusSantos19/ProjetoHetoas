package com.estudos.api.adapter.api.mappers;

import org.springframework.stereotype.Component;

import com.estudos.api.adapter.api.model.ProdutoDto;
import com.estudos.api.domain.Produto;
import com.estudos.api.shared.RestConverter;
@Component
public class ProdutoRestMapper implements RestConverter<Produto, ProdutoDto>{

	@Override
	public Produto mapToDomain(ProdutoDto restObject) {
		return new Produto(restObject.getKey(),
				restObject.getNome(),
				restObject.getPreco(),
				restObject.getDescricao(),
				restObject.getDisponivel(),
				restObject.getCatogoria());
	}
	
	
	@Override
	public ProdutoDto mapToRest(Produto domainObject) {
		return new ProdutoDto(domainObject.getId(),
				domainObject.getNome(),
				domainObject.getPreco(),
				domainObject.getDescricao(),
				domainObject.getDisponivel(),
				domainObject.getCatogoria());
	}
	
}
