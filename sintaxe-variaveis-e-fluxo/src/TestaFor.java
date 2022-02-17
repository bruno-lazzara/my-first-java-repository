
public class TestaFor {

	public static void main(String[] args) {
		for (int contador = 0; contador <= 10 ; contador++) {
			System.out.println(contador);
		}
		// System.out.println(contador);
		// Não imprime. No caso do for, a variável inicializada somente existe dentro do escopo do for.
	}
}
