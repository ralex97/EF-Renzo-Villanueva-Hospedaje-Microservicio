package com.idat.EC4HospedajeMicroservicio.services;

import java.util.List;

import com.idat.EC4HospedajeMicroservicio.dto.HospedajeDTO;

public interface HospedajeService {
  List<HospedajeDTO> listar();
  HospedajeDTO obtenerId(Integer id);
  void guardar(HospedajeDTO hospedaje);
	void actualizar(HospedajeDTO hospedaje);
	void eliminar(Integer id);
}
