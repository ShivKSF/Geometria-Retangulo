package controle;

import dominio.Retangulo;
import java.util.Scanner;

public class ControlaRetangulo {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
		int base = leia.nextInt();
		System.out.println("Digite o valor da altura: ");
		int altura = leia.nextInt();
		leia.close();
		
		Retangulo reta = new Retangulo(base, altura);
		
		System.out.println("GEOMETRIA: RETANGULO");
		System.out.println("BASE: " + base);
		System.out.println("ALTURA: " + altura);
		System.out.println("�REA DO RET�NGULO = BASE x ALTURA = " + reta.calcularArea());
		System.out.println("PER�METRO DO RET�NGULO = 2 x ( BASE + ALTURA ) = " + reta.calcularPerimetro());
	}
}
