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
	
	private Number id;
	private String nome;
	private String anotacao;
	private String ano;
	private String tipo;
	private String genero;
	private Number duracao;
	private String poster;
	private Number assistido;
	
	@JsonIgnore
	
	
	public Midia() {
		
	}
	
	public Midia(String nome, String anotacao, String ano, String tipo, String genero, Number duracao,
			String poster, Number assistido) {
		this.nome = nome;
		this.anotacao = anotacao;
		this.ano = ano;
		this.tipo = tipo;
		this.genero = genero;
		this.duracao = duracao;
		this.poster = poster;
		this.assistido = assistido;
	}

	public Number getId() {
		return id;
	}

	public void setId(Number id) {
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

	public Number getDuracao() {
		return duracao;
	}

	public void setDuracao(Number duracao) {
		this.duracao = duracao;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public Number getAssistido() {
		return assistido;
	}

	public void setAssistido(Number assistido) {
		this.assistido = assistido;
	}
}

