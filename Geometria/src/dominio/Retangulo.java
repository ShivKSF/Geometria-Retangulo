package dominio;

public class Retangulo {
	private int base, altura;

	public Retangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}
	
	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public int calcularArea() {
		return base * altura;
	}
	
	public int calcularPerimetro() {
		return 2 * (base + altura);
	}
}
