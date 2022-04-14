package com.ninjastar.us.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ninjastar.us.modelos.Ninja;

@Repository
public interface RepositorioNinja extends CrudRepository<Ninja, Long> {
	
	
	List<Ninja> findAll();	
	List<Ninja> findById(long id);
	Ninja save(Ninja nuevoNinja);

}
