package org.cibertec.cl1.pe.services;

import java.util.List;

import org.cibertec.cl1.pe.interfaces.InterfaceEmpleado;
import org.cibertec.cl1.pe.interfacesServices.InterfaceEmpleadoService;
import org.cibertec.cl1.pe.model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServices implements InterfaceEmpleadoService {

	@Autowired
	public InterfaceEmpleado data;
	
	@Override
	public List<Empleado> listar() {
		return (List<Empleado>) data.findAll();
	}

	@Override
	public int registrar(Empleado a) {
		Empleado empleado = data.save(a);
		if (!empleado.equals(null)) return 1;
		else return 0;
	}

}
