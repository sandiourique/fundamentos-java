package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args){
    	
    	Scanner entrada = new Scanner(System.in);

	    System.out.println("Essa é uma calculadora de operações simples");

	    System.out.print("Digite: \n Somar [+] \n subtrair [-] \n multiplicar [*] \n dividir [/]\n");
	    String operacao = entrada.nextLine();
	    
        System.out.print("Digite o primeiro número: \n");
        double num1 = entrada.nextDouble();
        
        System.out.print("Digite o segundo número: \n");
        double num2 = entrada.nextDouble();
        
        double resultado = "+".equals(operacao) ? num1 + num2: 0;
        resultado = "-".equals(operacao) ? num1 - num2: resultado;
        resultado = "*".equals(operacao) ? num1 * num2: resultado;
        resultado = "/".equals(operacao) ? num1 / num2: resultado;
        
        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
        entrada.close();
	    
	}

}
