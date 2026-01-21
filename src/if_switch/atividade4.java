package if_switch;

import java.util.Scanner;
public class atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("informe um numero");
		System.out.println("informe um numero");
		System.out.println("informe um numero");
		Scanner leia = new Scanner(System.in);
		double maior = 0 ;
		double numero1= leia.nextDouble();
		double numero2 = leia.nextDouble();
		double numero3 = leia.nextDouble();
		
		if (numero1 > numero2 && numero1 > numero3){ 
			maior = numero1;
		}
		if (numero2 > numero1 && numero2 >numero3){
			maior = numero2;
	}
		if (numero3 > numero1 && numero3 > numero2) {
			maior = numero3;
		}
		System.out.println("o maoir numero é: "+ maior);
	}
}
