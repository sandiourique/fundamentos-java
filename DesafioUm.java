/*Desafio conversão
 *
 *scanner 3 string , últimos 3 salários 
 *fazer a média
 * */
package fundamentos;

import java.util.Scanner;

public class DesafioUm {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salário: \n");
		String primeiro = teclado.nextLine().replace(",", ".");
		
		System.out.print("Informe o segundo salário: \n");
		String segundo = teclado.nextLine().replace(",", ".");
		
		System.out.print("Informe o terceiro salário: \n");
		String terceiro = teclado.nextLine().replace(",", ".");
		
		
		double valor1 = Double.parseDouble(primeiro);
		double valor2 = Double.parseDouble(segundo);
		double valor3 = Double.parseDouble(terceiro);
		
		double media = (valor1 + valor2 + valor3) / 3;
		System.out.printf("A média é: %f ", media);	
		
		teclado.close();
		
	}

}
