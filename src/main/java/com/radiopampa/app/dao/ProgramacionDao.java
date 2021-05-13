package com.radiopampa.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.radiopampa.app.model.Programacion;
@Transactional
public interface ProgramacionDao extends CrudRepository<Programacion, Integer> {

}
