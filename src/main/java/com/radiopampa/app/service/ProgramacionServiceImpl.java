package com.radiopampa.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.radiopampa.app.dao.ProgramacionDao;
import com.radiopampa.app.model.Programacion;

public class ProgramacionServiceImpl implements ProgramacionServiceApi {
	@Autowired
	ProgramacionDao programacionDao ;
	@Override
	public <S extends Programacion> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Programacion> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Programacion> findById(Integer id) {
		// TODO Auto-generated method stub
		return programacionDao .findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Programacion> findAll() {
		// TODO Auto-generated method stub
		return programacionDao.findAll();
	}

	@Override
	public Iterable<Programacion> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return programacionDao.findAllById(ids);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Programacion entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Programacion> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
