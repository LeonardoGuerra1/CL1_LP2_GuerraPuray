package org.cibertec.cl1.pe.controllers;

import java.util.List;

import org.cibertec.cl1.pe.interfacesServices.InterfaceEmpleadoService;
import org.cibertec.cl1.pe.model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpleadoController {

	@Autowired
	public InterfaceEmpleadoService service;
	
	@GetMapping("/listado")
	public String listar(Model m) {
		List<Empleado> lista = service.listar();
		m.addAttribute("lista", lista);
		return "listar";
	}
	
	@GetMapping("/nuevo")
	public String registrar(Model m) {
		m.addAttribute("empleado", new Empleado());
		return "registrar";
	}
	
	@PostMapping("/guardado")
	public String guardar(Empleado e, Model m) {
		service.registrar(e);
		return "redirect:/listado";
	}
}
