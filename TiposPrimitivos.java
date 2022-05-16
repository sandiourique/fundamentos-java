package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// informações do funcionario
		
		// tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		//posso usar o _ para separar os números
		long pontosAculumados = 3_134_845_223L;
		
		// tipo numérico real
		float salario = 11_445.44F;
		double vendasAculumadas = 2_991_797_103.01;
		
		// tipo booleano
		boolean estaDeFerias = false;
		
		// tipo caraceter
		
		char status = 'A'; //ativo
		
		// dias de empresa 
		
		System.out.println( "Anos de empresa: " + (anosDeEmpresa * 365));
		
		// Numero de viagens
		System.out.println("Número de voos " + (numeroDeVoos / 2));
		
		// Pontos por real
		System.out.println( "Pontos acumulados " + (pontosAculumados / vendasAculumadas));
		
		// char
		System.out.println( "ID " + id + " ganha o salário de " + salario +" R$");

		// status
		System.out.println("Está de férias: "+ status);
		
		
	}

}
