package if_switch;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("informe um numero inteiro:");
		Scanner leia = new Scanner(System.in);
		double numero = leia.nextDouble();
		double soma = numero % 2;
		if (soma == 0) {
			System .out.println("este numero é um numero par");
		}else {
			System.out.println("este numero é um numero impar");
			}
	}

}
