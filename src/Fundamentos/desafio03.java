package Fundamentos;
import java.util.Scanner;

public class desafio03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite  de 1-7 para saber o dia da semana: ");
		int numero = entrada.nextInt();
		if (numero == 1) {
			System.out.println("1 eh segunda.");
		}else if(numero == 2) {
			System.out.println("2 eh terça.");
		}else if(numero == 3) {
			System.out.println("3 eh quarta.");
		}else if(numero == 4) {
			System.out.println("4 eh quinta.");
		}else if(numero == 5) {
			System.out.println("5 eh sexta.");
		}else if(numero == 6) {
			System.out.println("6 eh sabado.");
		}else if (numero == 7){
			System.out.println("7 eh domingo.");
		}else {
			System.out.println("Valor invalido");
		}
	}

}
