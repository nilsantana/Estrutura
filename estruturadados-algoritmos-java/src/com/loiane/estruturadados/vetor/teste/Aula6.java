package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula6 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);


		vetor.adiciona("Curso");
		vetor.adiciona("Estrutura de dados");
		vetor.adiciona("elemento 3");
		System.out.println(vetor.busca("elemento 3"));
		
		
	}
}
