package com.estudos.api.adapter.persisntece.inmemory.repositories;

import java.util.List;
import java.util.Optional;

public interface InMemoryRepository<T> {
	T save(T t);
	Optional<T> findById(Long id);
	void delete(Long id);
	List<T> getAll();
	Optional<T> update(T t, long id);
}
