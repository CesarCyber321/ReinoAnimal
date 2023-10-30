package ReinoAnimall;

import java.util.Date;

public class Aquatico extends Animal {
	
	private String TipoAgua;
	private  boolean escamas;
	/**
	 * @author Cesar
	 * @param TipoAgua
	 * @param escamas
	 */
	
	public Aquatico(String TipoAgua, boolean escamas , String especie, String sexo, String dataNasci) {
		super(especie, sexo, dataNasci);
		this.TipoAgua = TipoAgua;
		this.escamas = escamas;
		// TODO Auto-generated constructor stub
	}

	public void nadar() {
		System.out.println("o animal esta nadando");
	}
	/**
	 * o metodo nadar e responsavel por dizer que o animal esta nadando
	 */
	
	
	
	public void perfil() {
		System.out.println(getContador());
		System.out.println(getespecie());
		System.out.println(escamas);
		System.out.println(TipoAgua);
		System.out.println(getDataNasci());
		System.out.println(getSexo());
		

	}

	

}
