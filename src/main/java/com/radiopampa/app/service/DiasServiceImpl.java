package com.radiopampa.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.radiopampa.app.dao.DiasDao;
import com.radiopampa.app.model.Dias;

public class DiasServiceImpl implements DiasServiceApi {
	@Autowired
	DiasDao diasdao;
	@Override
	public <S extends Dias> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Dias> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Dias> findById(Integer id) {
		// TODO Auto-generated method stub
		return diasdao.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Dias> findAll() {
		// TODO Auto-generated method stub
		return diasdao.findAll();
	}

	@Override
	public Iterable<Dias> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return diasdao.findAllById(ids);
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
	public void delete(Dias entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Dias> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
