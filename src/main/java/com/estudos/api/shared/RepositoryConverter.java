package com.estudos.api.shared;

public interface RepositoryConverter<D, E> {

	default D mapToDomain(final E entityObject) {
		throw new UnsupportedOperationException();
	}

	default E mapToEntity(final D domainObject) {
		throw new UnsupportedOperationException();
	}
}
