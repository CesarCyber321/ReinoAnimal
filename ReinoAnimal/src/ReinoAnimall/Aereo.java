package ReinoAnimall;

import java.util.Date;

/**
 * Classe para descrever um animal aereo..
 * @author Cesar
 *
 */

public class Aereo extends Animal{
	private double altitude;
	
	public Aereo(String especie, String sexo, String sataNasci, double altitude) {
		super(especie, sexo, sataNasci);
		this.altitude = altitude;
		// TODO Auto-generated constructor stub
	}
	
	public void voar() {
		System.out.println("o animal está voando há " + altitude + " metros");
	}
	
	/**
	 * metodo voar escreve que o animal esta voando. 
	 * @param altitude
	 * @param especie
	 * 
	 * 
	 */
	
	public void comer(String especie) {
		System.out.println("o animal, "  + especie + ", esta  comendo");
	}
	
	/**
	 * metodo comer tem como objetivo escrever que o animal esta comendo
	 * @param contador
	 */
	
	public void perfil() {
		System.out.println(getContador());
		System.out.println(getDataNasci());
		System.out.println(getespecie());
		System.out.println(getSexo());
		System.out.println(altitude);
	}

}
