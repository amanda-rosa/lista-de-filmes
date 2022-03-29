package com.projetodevcorp.movielist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Midia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String nome;
	private String anotacao;
	private String ano;
	private String tipo;
	private String genero;
	private int duracao;
	private String poster;
	private int assistido;
	
	@JsonIgnore
		
	public Midia() {
		
	}
	
	public Midia(String nome, String anotacao, String ano, String tipo, String genero, int duracao,
			String poster, int assistido) {
		this.nome = nome;
		this.anotacao = anotacao;
		this.ano = ano;
		this.tipo = tipo;
		this.genero = genero;
		this.duracao = duracao;
		this.poster = poster;
		this.assistido = assistido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAnotacao() {
		return anotacao;
	}

	public void setAnotacao(String anotacao) {
		this.anotacao = anotacao;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public int getAssistido() {
		return assistido;
	}

	public void setAssistido(int assistido) {
		this.assistido = assistido;
	}
}

