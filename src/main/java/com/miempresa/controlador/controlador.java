package com.miempresa.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.miempresa.interfaceServicio.IEmpleadoServicio;
import com.miempresa.modelo.Empleado;

@Controller
@RequestMapping
public class controlador {

	@Autowired
	private IEmpleadoServicio servicio;
	
	@GetMapping("/listarEmpleados")
	public String listarEmpleados(Model model) {
		List<Empleado> empleados = servicio.listar();
		model.addAttribute("empleados", empleados);
		return "empleados";
	}
	
}
