package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int notaIntroducida= 0;
		String calificacionFinal = "";
		System.out.print("Introduzca una nota: ");
		notaIntroducida = reader.nextInt();

		calificacionFinal = cali(notaIntroducida);

		System.out.println(calificacionFinal);
		reader.close();
	}

	/**
	 * @param notaIntroducida
	 * @return
	 */
	public static String cali(int notaIntroducida) {
		String calificacionFinal;
		if (notaIntroducida >= 0 && notaIntroducida < 5)
			calificacionFinal = "Suspenso";
		else if (notaIntroducida >= 5 && notaIntroducida < 7)
			calificacionFinal = "Aprobado";
		else if (notaIntroducida >= 7 && notaIntroducida < 9)
			calificacionFinal = "Notable";
		else if (notaIntroducida >= 9 && notaIntroducida <= 10)
			calificacionFinal = "Sobresaliente";
		else
			calificacionFinal = "La nota introducida no es correcta";
		return calificacionFinal;
	}
}
