package fundamentos;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		//trabalho terça - quinta
		// 2 certos tv 50
		// 1 certo tv 32
		// 1 dele sorvete
		// 2 errados vai nada
		
		boolean trabalho1 = false;
		boolean trabalho2 = true;
		
		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		boolean sorvete = trabalho1 || trabalho2;
		boolean naoSorvete = !sorvete;
		
		System.out.println("Comprou tv 50 " + tv50);
		System.out.println("Comprou tv 32 " + tv32);
		System.out.println("Comprou sorvete " + sorvete);
		System.out.println("Nenhum trabalho deu certo" + naoSorvete);
		
	}

}
