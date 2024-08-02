package com.estudos.api.domain.exceptions;

public class DomainNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DomainNotFoundException() {
		super("produto não encontrado");
	}
	
	public DomainNotFoundException(String message) {
		super(message);
	}

}
