package Fundamentos;
import java.util.Scanner;


public class desafio01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double resp = entrada.nextDouble();
		if (resp > 0)
			System.out.println("Valor eh positivo.");
		else
			System.out.println("Valor eh negativo.");
	}

}
