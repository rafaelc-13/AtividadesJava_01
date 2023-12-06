package Fundamentos;
import java.util.Scanner;

public class desafio02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		double n1 = entrada.nextDouble();
		System.out.println("Digite o segundo numero: ");
		double n2 = entrada.nextDouble();
		System.out.println("Digite o terceiro numero: ");
		double n3 = entrada.nextDouble();
		if (n1 > n2 && n1 > n3 && n2 < n3) {
			System.out.println(n1 + " é o maior valor e " + n2 +" é o menor");
		}else if (n1 > n2 && n1 > n3 && n3 < n2) {
			System.out.println(n1 + " é o maior valor e " + n3 +" é o menor");
		}else if (n2 > n3 && n3 < n1) {
			System.out.println(n2 + " é o maior valor, e " + n3 +" é o menor.");
		}else if (n2<n1){
			System.out.println(n3 + " é o maior valor e "+ n2 +" é o menor.");
		}else {
			System.out.println(n3 + " é o maior valor e "+ n1 +" é o menor.");
		}
	}

}
