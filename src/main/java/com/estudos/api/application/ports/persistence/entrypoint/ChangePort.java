package com.estudos.api.application.ports.persistence.entrypoint;

public interface ChangePort<Dto> {
	Dto save(Dto t);
	Dto updateById(Long id, Dto t);
	void delete(Long id);
}
