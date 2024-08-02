package com.estudos.api.adapter.persisntece.inmemory.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.estudos.api.adapter.persisntece.inmemory.model.Entity;

public abstract class InMemoryGenericRepository<T extends Entity> implements InMemoryRepository<T>{

	private final Map<Long, T> storage = new HashMap<>();
	private Long currrentId = 1L;
	

	public Map<Long, T> getStorage() {
		return storage;
	}

	public Long getCurrrentId() {
		return currrentId;
	}

	@Override
	public T save(T t) {
		if (t.getId() == null) {
			t.setId(currrentId++);
		}
		storage.put(t.getId(), t);
		return t;
	}

	@Override
	public Optional<T> findById(Long id) {
		return Optional.ofNullable(storage.get(id));
	}

	@Override
	public void delete(Long id) {
		storage.remove(id);
	}

	@Override
	public List<T> getAll() {
		return storage.values().stream().collect(Collectors.toList());
	}

	@Override
	public Optional<T> update(T t, long id) {
		if (storage.containsKey(id)) {
			t.setId(id);
			storage.put(id, t);
			return Optional.of(t);
		}
		return Optional.empty();
	}

}
