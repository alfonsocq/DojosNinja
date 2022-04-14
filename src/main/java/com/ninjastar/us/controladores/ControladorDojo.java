package com.ninjastar.us.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ninjastar.us.modelos.Dojo;
import com.ninjastar.us.servicios.ServicioNinjas;

@Controller
public class ControladorDojo {

private final ServicioNinjas servicio;
	
	public ControladorDojo(ServicioNinjas servicio) {
		this.servicio = servicio;
	}
	
	
	@GetMapping("/dojos/{id}")
	public String show_dojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo_separado = servicio.find_dojo(id);
		model.addAttribute("dojo", dojo_separado);
		return "dojoshow.jsp";
	}
	
	@RequestMapping("/dojos")
	public String dojo(@ModelAttribute("dojo") Dojo dojo) {
		return "dojos.jsp";
	}
	
	@PostMapping("/crear")
	public String crear(@Valid @ModelAttribute("dojo") Dojo dojo,
						 BindingResult result) {
			servicio.save_dojo(dojo);
			if(result.hasErrors()) {
							
				return "nuevodojo.jsp";
			} else {
				servicio.save_dojo(dojo);
				return "redirect:/dojos";
			}
		}
		
	}


