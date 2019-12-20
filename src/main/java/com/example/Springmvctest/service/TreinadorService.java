package com.example.Springmvctest.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Springmvctest.entity.Treinador;
import com.example.Springmvctest.repository.TreinadorRepository;

@Service
public class TreinadorService {

	@Autowired
	private TreinadorRepository treinadorRepository;

	public Iterable<Treinador> obterTodos() {

		return treinadorRepository.findAll();
	}

	public Treinador criarTreinador(Treinador treinador) {

		return treinadorRepository.save(treinador);

	}

	public Treinador obterPorId(Long id) {

		Optional<Treinador> optionalTreinador = treinadorRepository.findById(id);

		return optionalTreinador.orElseThrow(() -> new RuntimeException("Treinador não existe"));

	}

	public String deleteById(Long id) {
		try {
			treinadorRepository.deleteById(id);

			return "Deletado";

		} catch (Exception Ex) {

			return "Id não encontrado";
		}

	}

	public Treinador atualizaPorId(Long id) {
		
		Treinador treinador = treinadorRepository.findById(id).get();
		treinador.setNome("roberto");
		return treinadorRepository.save(treinador);
		
	}

	public void atualizarTreinador() {
		
		
	}
}
