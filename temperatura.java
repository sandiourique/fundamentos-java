package fundamentos;

public class temperatura {
	
	public static void main(String[] args) {
		// (f - 32) x 5/9 = C
		
		final int AJUSTE = 32;
		final double FATOR = 5/9.0;
		int fahrenheit = 86;
		
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("A conversão de "+ fahrenheit  + " fahrenheit é  " + celsius + " celsius");
		
	}

}
