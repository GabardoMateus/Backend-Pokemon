package com.example.Springmvctest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.assembler.InterfaceBasedMBeanInfoAssembler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springmvctest.entity.Pokemon;
import com.example.Springmvctest.service.PokemonService;

@RestController
@RequestMapping("/treinador/{treinadorId}/pokemon")
public class PokemonController {

	@Autowired
	private PokemonService pokemonService;
	
	@PostMapping
	@RequestMapping
	public Pokemon adicionarPokemon(@PathVariable Long treinadorId, Pokemon pokemon){
	
		 pokemonService.adicionarPokemon(treinadorId, pokemon);
		 
		 return pokemonService.adicionarPokemon(treinadorId, pokemon);
	}
}