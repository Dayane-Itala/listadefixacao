package if_switch;

import java.util.Scanner;
public class exercicio2 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		System.out.println("informe sua idade");
		Scanner leia = new Scanner(System.in);
		double idade = leia.nextDouble();
		
		if(idade < 18 ) {
			System.out.println("Menor de idade");
		}
		if(idade >= 18 && idade <= 60) {
			System.out.println("Adulto");	
		}  
		if (idade > 60){
			System.out.println("Idoso");
				
		}

	}

}
