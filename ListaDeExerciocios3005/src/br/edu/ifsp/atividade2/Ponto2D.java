package br.edu.ifsp.atividade2;

public class Ponto2D {
	private double x = 0;
	private double y = 0;
	
	public Ponto2D() {
		
	}
	
	public Ponto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Ponto2D(Ponto2D outroPonto2D) {
		this(outroPonto2D.x, outroPonto2D.y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void movimenta(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Ponto2D) {
		Ponto2D teste = (Ponto2D) obj;
		
		return (this.x == teste.x && this.y == teste.y);
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return new StringBuilder("(").append(x).append(", ").append(y).append(")").toString();		
	}
	
	public double distancia(Ponto2D comparado) {
		return Math.sqrt(Math.pow(comparado.x - this.x, 2) + Math.pow(comparado.y - this.y, 2));
	}
	
	public Ponto2D clonagem() {
		return new Ponto2D(this);
	}
	
}
