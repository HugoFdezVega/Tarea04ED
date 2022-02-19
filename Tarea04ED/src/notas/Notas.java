package notas;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int numeroIntroducido= 0;
		String calificacionFinal = "";
		System.out.print("Introduzca una nota: ");
		numeroIntroducido = reader.nextInt();

		if (numeroIntroducido >= 0 && numeroIntroducido < 5)
			calificacionFinal = "Suspenso";
		else if (numeroIntroducido >= 5 && numeroIntroducido < 7)
			calificacionFinal = "Aprobado";
		else if (numeroIntroducido >= 7 && numeroIntroducido < 9)
			calificacionFinal = "Notable";
		else if (numeroIntroducido >= 9 && numeroIntroducido <= 10)
			calificacionFinal = "Sobresaliente";
		else
			calificacionFinal = "La nota introducida no es correcta";

		System.out.println(calificacionFinal);
		reader.close();
	}
}
