package com.ninjastar.us.repositorios;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ninjastar.us.modelos.Dojo;
import com.ninjastar.us.modelos.Ninja;



@Repository
public interface RepositorioDojo extends CrudRepository<Dojo, Long>{
	
	List<Dojo> findAll();

	List<Dojo> findById(long id);
	
	
	Dojo save(Dojo nuevoDojo);
	
	List<Dojo> findAllByNinjas(Ninja ninja);
	

}
