package com.example.Springmvctest.controller;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springmvctest.entity.Treinador;
import com.example.Springmvctest.service.TreinadorService;

@RestController
@RequestMapping("/treinador")
public class TreinadorController {

	@Autowired
	private TreinadorService treinadorService;
	
	@GetMapping
	public Iterable<Treinador> obterTodos(){
		

		return treinadorService.obterTodos();
	}
	
	@PostMapping
	public Treinador criarTreinador(@RequestBody Treinador treinador){
		
		
		
		return treinadorService.criarTreinador(treinador);
		
		
	}
	
	@GetMapping("/{id}")
	public Treinador obterPorId(@PathVariable Long id){
		
		return treinadorService.obterPorId(id);
		
	}
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	public String deleteById(@PathVariable Long  id){
		
		return treinadorService.deleteById(id);
			
	}
	
	@PutMapping
	@RequestMapping("/atualiza/{id}")
	public Treinador atualizaPorId(@PathVariable Long id){
		
		return treinadorService.atualizaPorId(id);
	}
}