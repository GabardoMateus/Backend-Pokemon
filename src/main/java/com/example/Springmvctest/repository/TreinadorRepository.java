package com.example.Springmvctest.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Springmvctest.entity.Treinador;

public interface TreinadorRepository extends CrudRepository<Treinador, Long> {
	

}
