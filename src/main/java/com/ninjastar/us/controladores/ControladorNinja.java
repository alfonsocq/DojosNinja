package com.ninjastar.us.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ninjastar.us.modelos.Dojo;
import com.ninjastar.us.modelos.Ninja;
import com.ninjastar.us.servicios.ServicioNinjas;

@Controller
public class ControladorNinja {

	private final ServicioNinjas servicio;
	
	public ControladorNinja(ServicioNinjas servicio) {
		this.servicio = servicio;
	}
	
	@GetMapping("/new")
	public String register(@ModelAttribute("ninja") Ninja ninja, Model model) {
		
		List<Dojo> lista_dojo = servicio.get_alldojo();
		
		model.addAttribute("dojo", lista_dojo);
		
		return "nuevoninja.jsp";
	}
	
	@PostMapping("/create")
	
	public String create(@Valid @ModelAttribute("ninja") Ninja ninja,
						 BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			
			List<Dojo> lista_dojo = servicio.get_alldojo();
			
			model.addAttribute("dojo", lista_dojo);
			
			return "nuevoninja.jsp";
		} else {
			
			servicio.save_ninja(ninja);
			return "redirect:/dojos";
		}
		
	}
}
