package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int notaIntroducida= 0;
		String calificacionFinal = "";
		System.out.print("Introduzca una nota: ");
		notaIntroducida = reader.nextInt();

		calificacionFinal = califica(notaIntroducida);

		System.out.println(calificacionFinal);
		reader.close();
	}

	/**
	 * @param notaIntroducida
	 * @return
	 * @deprecated Use {@link #califica(int)} instead
	 */
	public static String cali(int notaIntroducida) {
		return califica(notaIntroducida);
	}

	/**
	 * @param num_nota
	 * @return
	 */
	public static String califica(int num_nota) {
		String calificacionFinal;
		if (num_nota >= 0 && num_nota < 5)
			calificacionFinal = "Suspenso";
		else if (num_nota >= 5 && num_nota < 7)
			calificacionFinal = "Aprobado";
		else if (num_nota >= 7 && num_nota < 9)
			calificacionFinal = "Notable";
		else if (num_nota >= 9 && num_nota <= 10)
			calificacionFinal = "Sobresaliente";
		else
			calificacionFinal = "La nota introducida no es correcta";
		return calificacionFinal;
	}
}
