package ReinoAnimall;

import java.util.Date;

public class Terrestre extends Animal{
	private String regiao;
	private boolean pelagem;
	
	/**
	 * @author Cesar
	 * @param especie
	 * @param sexo
	 * @param dataNasci
	 */
	

	public Terrestre(String regiao, boolean pelagem, String especie, String sexo, String dataNasci) {
		super(especie, sexo, dataNasci);
		this.regiao = regiao;
		this.pelagem = pelagem;
	}
	
	public void mover() {
		System.out.println("o animal esta se movendo");
	}
	/**
	 * esse metodo diz quando o animal está se movendo 
	 */
	
	public void comer() {
		System.out.println("o animal terrestre esta comendo");
	}
     
	
	public void perfil() {
		System.out.println(getContador());
		System.out.println(getDataNasci());
		System.out.println(getespecie());
		System.out.println(getSexo());
		System.out.println(regiao);
		System.out.println(pelagem);

	}

	

}
