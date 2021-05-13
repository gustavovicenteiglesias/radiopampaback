package com.radiopampa.app.service;

import org.springframework.data.repository.CrudRepository;

import com.radiopampa.app.model.Programacion;

public interface ProgramacionServiceApi extends CrudRepository<Programacion, Integer> {

}
