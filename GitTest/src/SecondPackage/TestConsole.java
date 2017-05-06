package SecondPackage;

import FirstPackage.MaClasse_A;
import FirstPackage.MaClasse_B;

public class TestConsole {

	public static void main(String[] args) {

		MaClasse_A a = new MaClasse_A();
		MaClasse_B b = new MaClasse_B();
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		System.out.println("Date courante: " + b.getDateAjh()); // modif Maria le 06/05/17 à 19h29
	}

}
