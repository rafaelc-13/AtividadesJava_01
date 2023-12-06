package Fundamentos;
import java.util.Scanner;

public class desafio06 {
	public static void main(String[] args) {
		int contador = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Telefonou para a vitima?(1 = sim ou 0 = nao) ");
		int telefonou = entrada.nextInt();
		if (telefonou == 1) {
			contador += 1;
		}System.out.println("Esteve no local do crime? (1 = sim ou 0 = nao) ");
		int local = entrada.nextInt();
		if (local == 1) {
			contador += 1;
		}System.out.println("Mora perto da vitima? (1 = sim ou 0 = nao))");
		int morar = entrada.nextInt();
		if (morar == 1) {
			contador++;
		}System.out.println("Devia dinheiro para a vitima? (1 = sim ou 0 = nao) ");
		int devendo = entrada.nextInt();
		if (devendo == 1) {
			contador += 1;
		}System.out.println("Ja trabalhou com a vitima? (1 = sim ou 0 = nao))");
		int trabalhou = entrada.nextInt();
		if (trabalhou == 1) {
			contador += 1;
		}
		if (contador == 2) {
			System.out.println("Voce e um suspeito");
		}else if (contador == 3 || contador == 4) {
			System.out.println("Voce e um cumplice");
		}else if(contador == 5) {
			System.out.println("Voce e um assassino");
		}else if(contador > 2) {
			System.out.println("Aparentemente voce e inocente, aparentemente.");
		}
		
	}

}
