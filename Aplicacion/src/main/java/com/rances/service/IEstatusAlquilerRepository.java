package com.rances.service;

import org.springframework.data.repository.CrudRepository;

import com.rances.entity.EstatusAlquiler;

public interface IEstatusAlquilerRepository extends CrudRepository<EstatusAlquiler, Long>{

	void updateEstatus(EstatusAlquiler estatusAlquiler);

}
