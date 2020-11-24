package application;

import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class Main {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("betwelve", 5,"São Bernardo");
		Cavalo cavalo = new Cavalo("Sprint", 10, "Grande");
		Preguica preguica = new Preguica("Sid", 20, false);
		
		System.out.println(cachorro);
		cachorro.correr();
		cachorro.emitirSom();
		
		System.out.println();
		
		System.out.println(cavalo);
		cavalo.correr();
		cavalo.emitirSom();
		
		System.out.println();
		System.out.println(preguica);
		preguica.emitirSom();
		preguica.subirAvore();
		
	}

}
