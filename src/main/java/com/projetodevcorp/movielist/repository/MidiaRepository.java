package com.projetodevcorp.movielist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetodevcorp.movielist.model.Midia;

@Repository
public interface MidiaRepository extends JpaRepository<Midia, Number> {

	List<Midia> findByNomeContains(String nome);
	
	List<Midia> findByAnoContains(String ano);
}
