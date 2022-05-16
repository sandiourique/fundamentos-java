package fundamentos;

public class DesafioOperadoresAritimeticos {
	
	public static void main(String[] args) {
		
		// Usar a fórmula
		//(((([6*(3+2)]2) / 3+2) - (1-5 * 2-7)2 / 2)3)/10 3
		// usar Math.pow(a, b)
		
		double primeira_parte = (Math.pow(6 * (3+2), 2)) / (3*2);
		System.out.println(primeira_parte);
		
		double segunda_parte = Math.pow(((1 - 5) * (2-7)) / 2, 2);
		System.out.println(segunda_parte);
		
		double calculo3 = primeira_parte - segunda_parte;
		double calculo4 = Math.pow(calculo3, 3) / Math.pow(10, 3);
		
		System.out.println("O resultado é: " + calculo4);
		
	}

}
