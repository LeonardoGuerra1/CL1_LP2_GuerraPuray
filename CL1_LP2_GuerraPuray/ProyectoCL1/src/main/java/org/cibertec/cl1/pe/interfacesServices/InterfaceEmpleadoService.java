package org.cibertec.cl1.pe.interfacesServices;

import java.util.List;

import org.cibertec.cl1.pe.model.Empleado;

public interface InterfaceEmpleadoService {

	public List<Empleado> listar();
	public int registrar(Empleado a);
}
