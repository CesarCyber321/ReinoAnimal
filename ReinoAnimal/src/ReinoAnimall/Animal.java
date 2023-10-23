package ReinoAnimall;

import java.util.Date;

public class Animal {
	private String especie;
	private String sexo;
	private Date dataNasci;
	private double contador;

	public void comer() {
		System.out.println("o animal esta comendo");
	}

	public void perfil() {
		contador = contador + 1;
		
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNasci() {
		return dataNasci;
	}

	public void setDataNasci(Date dataNasci) {
		this.dataNasci = dataNasci;
	}

	public double getContador() {
		return contador;
	}

	private void setContador(double contador) {
		this.contador = contador;
	}

}
