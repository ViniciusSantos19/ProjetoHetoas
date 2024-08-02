package com.estudos.api.application.ports.persistence.entrypoint;

import java.util.Collection;

public interface FindPort<Dto> {
	Collection<Dto> getAll();
	Dto fetchById(Long id);
}
