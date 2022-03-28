package com.projetodevcorp.movielist.controller;

import java.util.List;
import java.util.Optional; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.projetodevcorp.movielist.model.Midia;
import com.projetodevcorp.movielist.repository.MidiaRepository;

@RestController
public class MidiaController {
	
	@Autowired
	private MidiaRepository midiaRepository;
	
		//Teste para criar mídia
/*	@GetMapping("/midia/criarmidias")
	public void criarFilmes() {
		midiaRepository.save(new Midia("Titãs, Temporada 1", "2008", "Titans segue os jovens super-heróis da equipe de mesmo nome enquanto eles combatem o mal e outros perigos. [2] Dissolvida quando a história começa, a série vê o retorno da equipe quando o original e os novos membros reformam os Titãs. Os Titãs lutam contra o crime em vários locais, incluindo Detroit e São Francisco.", "Série", "Ficção", 0, "Titans", 0));
	} */
	
		// Retorna a lista de filmes e séries
	@GetMapping("/midia")
	public List<Midia> buscarFilme() {
		return midiaRepository.findAll();   
	}

		// Retorna a lista de filmes e séries pelo o ID
	@GetMapping("/midia/{id}")
	public Optional<Midia> buscarFilmePorId(@PathVariable Number id) {
		return midiaRepository.findById(id);  
	}
	
		// Criar
	@PostMapping("/midia")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Midia salvar(@RequestBody Midia midia) {
		return midiaRepository.save(midia);
	}
	
		// Atualizar
	@PutMapping("/midia/{id}")
	public ResponseEntity<Midia> atualizarFilmePorId(@PathVariable Number id, @RequestBody Midia midia) {
		Optional<Midia> atualizarMidia = midiaRepository.findById(id);
		
		if(atualizarMidia.isPresent()) {
			
			Midia midiaAtualizada = midiaRepository.save(midia);
			return ResponseEntity.ok(midiaAtualizada);
	}else{
			return ResponseEntity.notFound().build();
	}
 }
	
		// Deletar
	@DeleteMapping("/midia/{id}")
	public ResponseEntity<Midia> deletarFilmePorId(@PathVariable Number id) {
		Optional<Midia> deleteMidia = midiaRepository.findById(id);
		
		if(deleteMidia.isPresent()) {
			midiaRepository.delete(deleteMidia.get());
			return ResponseEntity.ok(deleteMidia.get());
	}else{
			return ResponseEntity.notFound().build();
		
	}
 }
	
		// Consultas Customizadas
	@GetMapping("/midia/nome") //localhost:8080/midia/nome?valor= 
	public List<Midia> buscarFilmePorNome(@RequestParam("valor") String valor) {
		return midiaRepository.findByNomeContains(valor);   // Consulta o filme pelo o nome
	}
	
	@GetMapping("/midia/ano") //localhost:8080/midia/ano?valor= 
	public List<Midia> buscarFilmePeloAno(@RequestParam("valor") String valor) {
		return midiaRepository.findByAnoContains(valor);    // Consulta o filme pelo o ano
	}
	
}
