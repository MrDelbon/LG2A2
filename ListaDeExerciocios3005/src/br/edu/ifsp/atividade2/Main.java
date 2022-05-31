package br.edu.ifsp.atividade2;

public class Main {

	public static void main(String[] args) {
		Ponto2D primeiroPonto = new Ponto2D(0, 0);
		
		Ponto2D segundoPonto = new Ponto2D(3, 4);
		
		Ponto2D pontoClone = primeiroPonto.clonagem();

		System.out.println(pontoClone);
		
		System.out.println(segundoPonto.distancia(primeiroPonto));
	}
}
