package br.edu.ifsp.atividade1;

public class Main {

	public static void main(String[] args) {
		Contador teste = new Contador();
		
		teste.incrementa();
		
		System.out.println(teste.retorna());
		
		teste.zera();
		
		System.out.println(teste.retorna());
	}

}
