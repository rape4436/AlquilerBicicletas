package com.rances.service;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rances.entity.Alquiler;

public interface IAlquilerRepository extends CrudRepository<Alquiler, Long> {


			List<Alquiler> findSolicitud(Long codAlquiler);

			List<Alquiler> findSolicitudAll();

			boolean addSolicitud(Alquiler alquiler);

			void updateSolicitud(Alquiler alquiler);

			void deleteSolicitud(Alquiler alquiler);


			
			
}
