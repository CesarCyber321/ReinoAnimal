package ReinoAnimalTeste;

import java.util.Date;

import ReinoAnimall.*;

public class Teste {
	/**
	 * @author Cesar
	 * @param args classe criada para fazer os testes, com a classe principal do
	 *             projeto
	 */
	public static void main(String[] args) {

		// polimorfismo

		/**
		 * Aereo a = new Aereo("papagaiu", "macho", "25/10/2023", 3.2); a.comer();
		 * a.perfil(); a.voar(); 
		 */ 
		  Aquatico c = new Aquatico("salgada",true ,"peixe", "femea", "22/11/2005"); 
		  c.comer(); 
		  c.perfil(); 
		  c.nadar();
		  
		 
		  System.out.println("------------------");
		
		Terrestre t = new Terrestre("mata atlantica", true ,"onça", "femea", "08/15/10");
		t.perfil();
		t.mover();
		t.comer();
	
	}
}
