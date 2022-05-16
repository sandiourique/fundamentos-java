package fundamentos;

import java.util.Scanner;

public class DesafioImprimir {
	
	public static void main(String[] args) {
		// desafio imprimir int, double e text https://www.hackerrank.com/   JAVA 
					Scanner scan = new Scanner(System.in);
			                      
					System.out.print("Informe primeiro o numero: \n");
					int i = scan.nextInt();
					scan.nextLine();
					
					System.out.print("Informe o segundo double: \n");
					String segundo = scan.next().replace(",", ".");
					scan.nextLine();
					
					double d = Double.parseDouble(segundo);
					
					
					System.out.print("Informe o texto: \n");
					String s = scan.nextLine();
					
					System.out.print("");
					
			        

			        // Write your code here.

			        System.out.println("String: " + s);
			        System.out.println("Double: " + d);
			        System.out.println("Int: " + i);
			        
			        scan.close();
	
	}
	
}
