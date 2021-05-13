package com.radiopampa.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.radiopampa.app.model.Dias;
@Transactional
public interface DiasDao extends CrudRepository<Dias, Integer> {

}
