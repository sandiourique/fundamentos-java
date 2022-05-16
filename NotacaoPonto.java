package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		String s = "Bom dia x";
		
		// substituir
		s = s.replace("x", "Sophia");
		s = s.toUpperCase();
		
		// concatenar
		
		s = s.concat("!!!");
		
		System.out.println(s);
		System.out.println("Eros".toUpperCase());
	}

}
