package fundamentos;

import java.util.Scanner;

public class console {
	
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("dia \n");
		System.out.println("Bom dia");		
		System.out.printf("Megasena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f \n", 123.465789);
		
//scanner System.in entrada do teclado
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("Nome %s %s tem  %d anos ", nome, sobrenome, idade );
		
		entrada.close();
	}
}
