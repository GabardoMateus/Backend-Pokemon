package com.example.Springmvctest.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Springmvctest.entity.Pokemon;

public interface PokemonRepository   extends CrudRepository <Pokemon , Long>{

}
