package Fundamentos;
import java.util.Scanner;

public class desafio01_2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double resp = entrada.nextDouble();
		System.out.println((resp > 0) ? "Valor eh positivo" : "Valor eh negativo");
	}

}
