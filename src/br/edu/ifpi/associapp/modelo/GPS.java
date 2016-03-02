package br.edu.ifpi.associapp.modelo;

public class GPS {
	
	private float latidude;
	private float longitude;
	
	public GPS(float latidude, float longitude) {
		this.latidude = latidude;
		this.longitude = longitude;
	}
	
	public float getLatidude() {
		return latidude;
	}
	
	public void setLatidude(float latidude) {
		this.latidude = latidude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	
	
	
}
