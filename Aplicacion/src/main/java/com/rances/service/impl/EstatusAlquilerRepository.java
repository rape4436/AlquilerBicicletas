package com.rances.service.impl;


import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.rances.entity.EstatusAlquiler;
import com.rances.service.IEstatusAlquilerRepository;
import com.rances.util.HibernateUtil;

@Service
public class EstatusAlquilerRepository implements IEstatusAlquilerRepository {

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(EstatusAlquiler arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends EstatusAlquiler> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<EstatusAlquiler> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<EstatusAlquiler> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstatusAlquiler findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstatusAlquiler> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends EstatusAlquiler> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEstatus(EstatusAlquiler estatusAlquiler) {
		// TODO Auto-generated method stub
		
		    Session session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
	        Query query = session.createQuery("update com.rances.entity.EstatusAlquiler set descripcion = :descripcion, nombre = :nombre where cod_estatus_alquiler = :cod_estatus_alquiler");
	        query.setParameter("descripcion", estatusAlquiler.getDescripcion());
	        query.setParameter("nombre", estatusAlquiler.getNombre());
	        session.getTransaction().commit();
		
	}

	

}
