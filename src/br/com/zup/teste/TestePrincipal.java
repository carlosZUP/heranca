package br.com.zup.teste;

import br.com.zup.heranca.Programador;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import br.com.zup.heranca.Ator;
public class TestePrincipal {
	
	
	public static void main(String[] args) {
	
		List<String> linguagens = new ArrayList<String>(Arrays.asList("Java" , "Python", "Pascal"));
		List<String> filmesParticipados = new ArrayList<String>(Arrays.asList("Avengers", "O grito", "django livre"));
		
		Random random = new Random();
		
		Programador programador = new Programador (linguagens, 8, true, "Mario", " Silva", 28);
		
		Ator ator = new Ator(filmesParticipados, false, 1988, "toby", " Aranha", 34);
		int numero = random.nextInt(ator.getFilmesParticipados().size());
		ator.setMelhorFilme(ator.sorteioFilme(numero, ator.getFilmesParticipados()));
	
		System.out.println(programador);
		System.out.println(ator);
	}

}
