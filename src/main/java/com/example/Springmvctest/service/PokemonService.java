package com.example.Springmvctest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Springmvctest.entity.Pokemon;
import com.example.Springmvctest.entity.Treinador;
import com.example.Springmvctest.repository.PokemonRepository;

@Service
public class PokemonService {

	@Autowired
	private TreinadorService treinadorService;
	
	@Autowired
	private PokemonRepository pokemonRepository;
	
	public Pokemon adicionarPokemon(Long treinadorId , Pokemon pokemon){
		
		Treinador treinador = treinadorService.obterPorId(treinadorId);
		
		treinador.getPokemon();
		
		treinadorService.atualizarTreinador();
		
		return pokemonRepository.save(pokemon);
	}
}
