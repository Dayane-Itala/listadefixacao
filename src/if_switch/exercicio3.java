package if_switch;

import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Informe sua nota:");
		System.out.println("Informe sua nota:");
		Scanner leia = new Scanner(System.in);
		double nota1 = leia.nextDouble();
		double nota2 = leia.nextDouble();
		double soma = nota1 + nota2;
		double media = soma / 2;
		if (media >=7) {
			System.out.println("Aprovado");
		}
		if (media >= 5 && media <= 6.9) {
			System.out.println("Recuperação");
		}
		if (media < 5) {
			System.out.println("Reprovado");
		}
		
	}
 
}
