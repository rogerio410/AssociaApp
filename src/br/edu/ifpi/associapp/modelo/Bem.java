package br.edu.ifpi.associapp.modelo;

public class Bem {
	
	enum SituacaoEnum{
		EXISTE, NAO_EXISTE, RUIM, BOM
	}
	
	private String nome;
	private SituacaoEnum situacao;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public SituacaoEnum getSituacao() {
		return situacao;
	}
	public void setSituacao(SituacaoEnum situacao) {
		this.situacao = situacao;
	}
	
	

}
