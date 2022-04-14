package com.ninjastar.us.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninjastar.us.modelos.Dojo;
import com.ninjastar.us.modelos.Ninja;
import com.ninjastar.us.repositorios.RepositorioDojo;
import com.ninjastar.us.repositorios.RepositorioNinja;

@Service
public class ServicioNinjas {
		
	@Autowired
	private RepositorioDojo repositorio_dojo;
	
	@Autowired
	private RepositorioNinja repositorio_ninja;
	

	public List<Dojo> get_alldojo(){
		return repositorio_dojo.findAll();
	}
	public Dojo find_dojo(Long id) {
		Optional<Dojo> optionalDojo = repositorio_dojo.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}
	
	public Ninja find_ninja(Long id) {
		Optional<Ninja> optionalNinja = repositorio_ninja.findById(id);
		if(optionalNinja.isPresent()) {
			return optionalNinja.get();
		} else {
			return null;
		}
	}
	
	public Ninja save_ninja(Ninja nuevoNinja) {
		return repositorio_ninja.save(nuevoNinja);
	}
	
	public Dojo save_dojo(Dojo nuevoDojo) {
		return repositorio_dojo.save(nuevoDojo);
	}
}
