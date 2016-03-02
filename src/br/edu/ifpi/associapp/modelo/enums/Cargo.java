package br.edu.ifpi.associapp.modelo.enums;

public enum Cargo {
	
	PRESIDENTE(1), 
	VICE_PRESIDENTE(2), 
	TESOUREIRO(3), 
	SECRETARIO(4);
	
	private int id;

	private Cargo(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public static Cargo fromInteger(int  i){
		switch (i) {
		case 1:
			return Cargo.PRESIDENTE;
		case 2:
			return Cargo.VICE_PRESIDENTE;
		case 3:
			return Cargo.TESOUREIRO;
		case 4:
			return Cargo.SECRETARIO;
		default:
			throw new IllegalArgumentException();
		}
	}

}









