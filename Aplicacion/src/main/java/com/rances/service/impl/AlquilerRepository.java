package com.rances.service.impl;


import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.rances.util.HibernateUtil;
import com.rances.entity.Alquiler;
import com.rances.service.IAlquilerRepository;

@Service
public class AlquilerRepository implements IAlquilerRepository {

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
	public void delete(Alquiler arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Alquiler> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Long codAlquiler) {
		// TODO Auto-generated method stub
		
		Session session = HibernateUtil.getSessionFactory().openSession();
        StringBuffer hql = new StringBuffer();
        hql.append("FROM Datos D WHERE D.referencia = :referencia");
        Query query = session.createQuery(hql.toString());
        query.setParameter("codAlquiler", codAlquiler);
        
        if(query.list().isEmpty())
       	 	return false;
		return false;
	}

	@Override
	public Iterable<Alquiler> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Alquiler> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alquiler findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Alquiler> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Alquiler> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alquiler findSolicitud(Long codAlquiler) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alquiler findSolicitudAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addSolicitud(Alquiler alquiler) {
		// TODO Auto-generated method stub
        if(!exists(alquiler.getCodAlquiler())){
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(alquiler);
            session.getTransaction().commit();
            return true;
        }
        return false;
	}

	@Override
	public void updateSolicitud(Alquiler alquiler) {
		// TODO Auto-generated method stub
		
		if (exists(alquiler.getCodAlquiler())){
			  Session session = HibernateUtil.getSessionFactory().openSession();
		        session.beginTransaction();
		        Query query = session.createQuery("update com.rances.entity.Alquiler set afiliado = :afiliado, cobro_alquiler = :cobro_alquiler, dni = :dni, estatus_alquiler = :estatus_alquiler, fec_alta = :fec_alta, fec_baja = :fec_baja, observacion = :observacion, promocion_alquiler = :promocion_alquiler, tiempo_alquiler = :tiempo_alquiler where cod_alquiler = :cod_alquiler");
		        query.setParameter("afiliado", alquiler.getAfiliado());
		        query.setParameter("cobro_alquiler", alquiler.getCobroAlquiler());
		        query.setParameter("dni", alquiler.getDni());
		        query.setParameter("estatus_alquiler", alquiler.getEstatusAlquiler());
		        query.setParameter("fec_alta", alquiler.getFecAlta());
		        query.setParameter("fec_baja", alquiler.getFecBaja());
		        query.setParameter("observacion", alquiler.getObservaciones());
		        query.setParameter("promocion_alquiler", alquiler.getPromocionAlquiler());
		        query.setParameter("tiempo_alquiler", alquiler.getTiempoAlquiler());
		        session.getTransaction().commit();
		}else{
			addSolicitud(alquiler);
		};
		
	}

	@Override
	public void deleteSolicitud(Alquiler alquiler) {
		// TODO Auto-generated method stub
		
		 Session session = HibernateUtil.getSessionFactory().openSession();
	        session.beginTransaction();
	        Query query = session.createQuery("delete com.metrogas.entidad.Datos where cod_alquiler = :cod_alquiler");
	        query.setParameter("cod_alquiler", alquiler.getCodAlquiler());
	        query.executeUpdate();
	        session.getTransaction().commit();
		
	}

	
	

}
