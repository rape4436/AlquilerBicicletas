package com.rances.service;


import org.springframework.data.repository.CrudRepository;

import com.rances.entity.Alquiler;

public interface IAlquilerRepository extends CrudRepository<Alquiler, Long> {


			Alquiler findSolicitud(Long codAlquiler);

			Alquiler findSolicitudAll();

			boolean addSolicitud(Alquiler alquiler);

			void updateSolicitud(Alquiler alquiler);

			void deleteSolicitud(Alquiler alquiler);

			
			
}
