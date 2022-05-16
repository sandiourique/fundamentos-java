package fundamentos;

import java.util.Scanner;

public class desafioCalculadora {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Essa é uma calculadora de operações simples");

        System.out.print("Digite: \n Somar [+] \n subtrair [-] \n multiplicar [*] \n dividir [/]\n");
        int operacao = entrada.nextLine();

        System.out.print("Digite o primeiro número: \n");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: \n");
        double num2 = entrada.nextDouble();
        
        System.out.printf("%f %s %f = ?", num1, operacao, num2);

        entrada.close();


    }
    
}
