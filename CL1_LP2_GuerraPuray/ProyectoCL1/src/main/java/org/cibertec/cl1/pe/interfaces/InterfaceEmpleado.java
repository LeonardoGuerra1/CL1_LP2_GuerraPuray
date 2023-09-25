package org.cibertec.cl1.pe.interfaces;

import org.cibertec.cl1.pe.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfaceEmpleado extends JpaRepository<Empleado, Integer> {

}
