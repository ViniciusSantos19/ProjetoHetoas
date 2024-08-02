package com.estudos.api.application.ports.persistence;

import java.util.Optional;

public interface WritePort<D> {
	D saveNew(D domain);
	Optional<D> update(D domain);
	void delete(Long id);
}
