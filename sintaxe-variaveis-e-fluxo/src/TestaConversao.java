
public class TestaConversao {
	
	public static void main(String[] args) {
		
		// double salario = 1270.50;
		// int valor = salario;
		// Não compila. O compilador diz que você irá perder informação.
		// Essa operação precisa ser forçada.
		
		double salario = 1270.50;
		int valor = (int)salario;
		System.out.println(valor);
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
		
		long numeroGrande = 541684534684L;
		System.out.println(numeroGrande);
		
		short valorPequeno = 2131;
		System.out.println(valorPequeno);
		
		byte b = 127;
		System.out.println(b);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		System.out.println(valor1 + valor2);
	}
}
