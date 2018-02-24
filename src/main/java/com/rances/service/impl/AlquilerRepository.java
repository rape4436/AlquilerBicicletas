package com.rances.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.rances.util.HibernateUtil;
import com.rances.util.Precios;
import com.rances.util.TipoAlquiler;
import com.rances.entity.Alquiler;
import com.rances.service.IAlquilerRepository;

@Service
public class AlquilerRepository implements IAlquilerRepository {

	private ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();

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

		if (query.list().isEmpty())
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
	public List<Alquiler> findSolicitud(Long codAlquiler) {
		// TODO Auto-generated method stub

		// busca todas la solicitud de alquiler seleccionada mediante su id

		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session
				.createQuery("from Alquiler where codAlquiler = 'codAlquiler'");
		List<Alquiler> listAlquiler = query.list();

		for (Alquiler aAlquiler : listAlquiler) {
			System.out.println(aAlquiler.getCodAlquiler());
		}

		return listAlquiler;

	}

	@Override
	public List<Alquiler> findSolicitudAll() {
		// TODO Auto-generated method stub

		// busca todas las solicitudes de alquileres

		Session session = HibernateUtil.getSessionFactory().openSession();
		Query query = session.createQuery("from Alquiler");
		List<Alquiler> listAlquiler = query.list();

		for (Alquiler aAlquiler : listAlquiler) {
			System.out.println(aAlquiler.getCodAlquiler());
		}

		return listAlquiler;
	}

	@Override
	public boolean addSolicitud(Alquiler alquiler) {
		// TODO Auto-generated method stub
		if (!exists(alquiler.getCodAlquiler())) {

			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();

			session.save(alquiler);

			session.getTransaction().commit();

			return true;
		}
		return false;
	}

	
	public boolean getBeneficio(Alquiler alquiler) {
		
		
		int count = 1;
		
		
		for (Alquiler alquiler2 : alquileres) {

			if (alquiler2.getCliente().getCodCliente().equals(alquiler.getCliente().getCodCliente())) {
				
				count++;
				
			}
			
		}
		
		if (count >= 3 &&  count <= 5)  {
			
			return true;
		} 
		
		
		return false;
   

	}


	@Override
	public void updateSolicitud(Alquiler alquiler) {
		// TODO Auto-generated method stub

		if (exists(alquiler.getCodAlquiler())) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Query query = session
					.createQuery("update com.rances.entity.Alquiler cantidad = :cantidad, fec_alta = :fec_alta, fec_baja = :fec_baja, observaciones = :observaciones, cod_tipo_alquiler = :cod_tipo_alquiler, tiempo = :tiempo, total = :total where cod_alquiler = :cod_alquiler");
			query.setParameter("fec_alta", alquiler.getFecAlta());
			query.setParameter("fec_baja", alquiler.getFecBaja());
			query.setParameter("observaciones", alquiler.getObservaciones());
			query.setParameter("cod_tipo_alquiler",
					alquiler.getCodTipoAlquiler());
			query.setParameter("tiempo", alquiler.getTiempo());
			query.setParameter("total", alquiler.getTotal());
			session.getTransaction().commit();
		} else {
			addSolicitud(alquiler);
		}
		;

	}

	@Override
	public void deleteSolicitud(Alquiler alquiler) {
		// TODO Auto-generated method stub

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session
				.createQuery("delete com.rances.entity.Alquiler where cod_alquiler = :cod_alquiler");
		query.setParameter("cod_alquiler", alquiler.getCodAlquiler());
		query.executeUpdate();
		session.getTransaction().commit();

	}

	public ArrayList<Alquiler> getAlquileres() {
		return alquileres;
	}

	@SuppressWarnings("static-access")
	public void setAlquileres(Alquiler alquiler) {


        TipoAlquiler tipo =TipoAlquiler.valueOf(alquiler.getCodTipoAlquiler());
        
		if (getBeneficio(alquiler)){
			
			alquiler.setTotal(alquiler.getTiempo() * tipo.getTipo());
			
			alquiler.setTotal(alquiler.getTotal() * Precios.getRentaFamiliar()/100);
			
		} else {
			
			alquiler.setTotal(alquiler.getTiempo() * tipo.getTipo());
		}

		this.alquileres.add(alquiler);
	}

}
