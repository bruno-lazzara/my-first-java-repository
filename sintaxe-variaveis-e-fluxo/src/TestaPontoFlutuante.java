
public class TestaPontoFlutuante {
	public static void main(String[] args) {
		
		double salario;
		salario = 1250.70;
		System.out.println("meu salario é " + salario);
		
		double idade = 27; // Um int encaixa num double, mas não o contrário.
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao); // Resultado truncado 2, pois 2.5 não cabe num int.
		
		double novaTentativa = 5 / 2; // O Java lê a linha da direita para a esquerda, 5 e 2 são int, então o resultado é 2.0
		System.out.println(novaTentativa);
		
		double novaTentativa1 = 5.0 / 2; // double dividido por int, resultado 2.5
		System.out.println(novaTentativa1);
	}
}
