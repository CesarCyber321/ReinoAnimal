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

		Aquatico c = new Aquatico("Carcharias taurus", false, "fêmea", "7", "água salgada");
		c.comer();
		c.perfil();
		c.nadar();

		Aquatico C = new Aquatico("Pygocentrus nattereri", true, "macho", "3", "água doce");

		System.out.println("------------------");

		Terrestre t = new Terrestre("Felis catus", true, "fêmea", "2", "Ásia");
		t.perfil();
		t.mover();
		t.comer();

		System.out.println("-------------------");

		Terrestre T = new Terrestre("Hydrochoerus hydrochaeris", true, "macho", "8", "América do Sul");
		
		T.perfil();
		T.mover();
		T.comer();

		System.out.println("-------------------");

		Aereo a = new Aereo("Coragyps atratus", "macho", "3", 54.5);
		a.comer();
		a.perfil();
		a.voar();
		
		System.out.println("--------------------");
		
		Aereo A = new Aereo("Amazona aestiva", "fêmea", "10", 37.9);
		A.comer();
		A.perfil();
		A.voar();

	}
}
