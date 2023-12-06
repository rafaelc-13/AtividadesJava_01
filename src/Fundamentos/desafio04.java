package Fundamentos;
import java.util.Scanner;

public class desafio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		Double nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		Double nota2 = entrada.nextDouble();
		Double media = (nota1 + nota2) / 2;
		System.out.println("Sua media eh" + media);
	}

}
