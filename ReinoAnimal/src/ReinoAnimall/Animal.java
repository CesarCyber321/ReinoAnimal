package ReinoAnimall;

import java.util.Date;

public class Animal {
	private String especie;
	private String sexo;
	private String dataNasci;
	private static int contador;

	/**
	 * @author Cesar construtor com parametro
	 * @param especie, esse parametro é responsavel por dizer de qual especie é o animal.
	 * @param sexo, diz o sexo do animal.
	 * @param dataNasci, data de nascimento do animal.
	 * @param contador
	 */

	public Animal(String especie, String sexo, String dataNasci) {
		this.especie = especie;
		this.sexo = sexo;
		this.dataNasci = dataNasci;
		this.setContador(contador + 1);
	}
	
	/**
	 * o metodo Animal é um metodo abstrato, que contem como parametros os atributos da classe.
	 */

	public void comer() {
		System.out.println("o animal, "  + especie + ", esta comendo");
	}
	
	/**
	 * o metodo comer diz que o animal esta comendo.
	 */
	public void perfil() {
		contador = contador + 1;
		System.out.println(contador);
		System.out.println(especie);
		System.out.println("a data de nascimento é " + dataNasci);
		System.out.println(sexo);
	}

	/*
	 * metodos get e set
	 */

	private String getespecie() {
		return especie;
	}
	/**
	 * @param especie
	 */

	private void setEspecie(String especie) {
		this.especie = especie;
	}

	private String getSexo() {
		return sexo;
	}

	private void setSexo(String sexo) {
		this.sexo = sexo;
	}

	private String getDataNasci() {
		return dataNasci;
	}

	private void setDataNasci(String dataNasci) {
		this.dataNasci = dataNasci;
	}

	private static double getContador() {
		return contador;
	}

	private void setContador(int contador) {
		this.contador = contador;
	}

}
