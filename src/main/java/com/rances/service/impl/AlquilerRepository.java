package com.rances.service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.rances.util.HibernateUtil;
import com.rances.util.Precios;
import com.rances.entity.Alquiler;
import com.rances.service.IAlquilerRepository;

@Service
public class AlquilerRepository implements IAlquilerRepository {

	Precios precios = new Precios();
	

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

			calcularOperacion(alquiler);

			session.save(alquiler);

			session.getTransaction().commit();

			return true;
		}
		return false;
	}

	public void calcularOperacion(Alquiler alquiler) {
		
		
		// TODO Auto-generated method stub
		

		// calculo de alquiler, se calcula mediante el codigo seleccionado en un
		// combo Tipo de Alquiler de la vista

		// SI EL ALQUILER ES POR HORA
		if (alquiler.getCodTipoAlquiler() == "1") {

			alquilerPorHora(alquiler);

		}
		// SI EL ALQUILER ES POR DIA
		else if (alquiler.getCodTipoAlquiler() == "2") {

			alquilerPorDia(alquiler);
		}
		// SI EL ALQUILER ES POR SEMANA
		else if (alquiler.getCodTipoAlquiler() == "3") {

			alquilerPorSemana(alquiler);

		} else {

			alquiler.setTotal(0);
		}

		// calculo de promocion

		if (alquiler.getCantidad() >= 3 && alquiler.getCantidad() <= 5) {
			
			calcularPromocion(alquiler);

		}

	}

	public void calcularPromocion(Alquiler alquiler) {
		// TODO Auto-generated method stub

		alquiler.setTotal(alquiler.getTotal() * Precios.getRentaFamiliar()/100);

	}

	public void alquilerPorSemana(Alquiler alquiler) {
		// TODO Auto-generated method stub

		Double sumatoria = (double) 0;

		sumatoria = (alquiler.getTiempo() * Precios.getSemana());

		alquiler.setTotal(sumatoria * alquiler.getCantidad());

	}

	public void alquilerPorDia(Alquiler alquiler) {
		// TODO Auto-generated method stub

		Double sumatoria = (double) 0;

		sumatoria = (alquiler.getTiempo() * Precios.getDia());

		alquiler.setTotal(sumatoria * alquiler.getCantidad());

	}

	public void alquilerPorHora(Alquiler alquiler) {
		// TODO Auto-generated method stub

		Double sumatoria = (double) 0;

		sumatoria = (alquiler.getTiempo() * Precios.getHora());

		alquiler.setTotal(sumatoria * alquiler.getCantidad());

	}

	@Override
	public void updateSolicitud(Alquiler alquiler) {
		// TODO Auto-generated method stub

		if (exists(alquiler.getCodAlquiler())) {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Query query = session
					.createQuery("update com.rances.entity.Alquiler cantidad = :cantidad, fec_alta = :fec_alta, fec_baja = :fec_baja, observaciones = :observaciones, cod_tipo_alquiler = :cod_tipo_alquiler, tiempo = :tiempo, total = :total where cod_alquiler = :cod_alquiler");
			query.setParameter("cantidad", alquiler.getCantidad());
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

}
