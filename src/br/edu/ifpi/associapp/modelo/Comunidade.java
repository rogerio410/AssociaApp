package br.edu.ifpi.associapp.modelo;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpi.associapp.modelo.enums.TipoComunidadeEnum;

public class Comunidade {
	
//	enum TipoComunidadeEnum{
//		URBANA(1), RURAL(2);
//		
//		private int id;
//		
//		private TipoComunidadeEnum(int id) {
//			this.id = id;
//		}
//		
//		public int getId() {
//			return id;
//		}
//	}
	
	private int id;
	private String nome;
	private int idadeMinimaLider;
	private int grauSeguranca;
	private Endereco endereco;
	private GPS gps;
	private TipoComunidadeEnum tipo;
	private List<Familia> familias = new ArrayList<>();
	private List<Bem> bens = new ArrayList<>();
	private List<String> aptidoes = new ArrayList<>();
	private List<Gestao> gestoes = new ArrayList<>();
	
	public void addFamilia(Familia f){
		this.familias.add(f);
		f.setComunidade(this);
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

	public int getIdadeMinimaLider() {
		return idadeMinimaLider;
	}

	public void setIdadeMinimaLider(int idadeMinimaLider) {
		this.idadeMinimaLider = idadeMinimaLider;
	}

	public int getGrauSeguranca() {
		return grauSeguranca;
	}

	public void setGrauSeguranca(int grauSeguranca) {
		this.grauSeguranca = grauSeguranca;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public GPS getGps() {
		return gps;
	}

	public void setGps(GPS gps) {
		this.gps = gps;
	}

	public TipoComunidadeEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoComunidadeEnum tipo) {
		this.tipo = tipo;
	}

	public List<Familia> getFamilias() {
		return familias;
	}


	public List<Bem> getBens() {
		return bens;
	}

	public List<String> getAptidoes() {
		return aptidoes;
	}

	public void setAptidoes(List<String> aptidoes) {
		this.aptidoes = aptidoes;
	}

}




