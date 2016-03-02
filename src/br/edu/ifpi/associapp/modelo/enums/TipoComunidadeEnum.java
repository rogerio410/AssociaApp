package br.edu.ifpi.associapp.modelo.enums;

public enum TipoComunidadeEnum{
	URBANA(1), RURAL(2);
	
	private int id;
	
	private TipoComunidadeEnum(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public static TipoComunidadeEnum fromInteger(int i){
		if (i == 1){
			return TipoComunidadeEnum.RURAL;
		}else{
			return TipoComunidadeEnum.URBANA;
		}
	}
}