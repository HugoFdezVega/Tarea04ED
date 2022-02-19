package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int notaIntroducida= 0;
		String calificacionFinal = "";
		System.out.print("Introduzca una nota: ");
		notaIntroducida = reader.nextInt();

		calificacionFinal = notas.Califica.califica(notaIntroducida);

		System.out.println(calificacionFinal);
		reader.close();
	}

	/**
	 * @param notaIntroducida
	 * @return
	 * @deprecated Use {@link notas.Califica#califica(int)} instead
	 */
	public static String cali(int notaIntroducida) {
		return notas.Califica.califica(notaIntroducida);
	}

	/**
	 * @param num_nota
	 * @return
	 * @deprecated Use {@link Califica#califica(int)} instead
	 */
	public static String califica(int num_nota) {
		return Califica.califica(num_nota);
	}
}
