package notas;

public class Califica {

	/**
	 * * @author Hugo Fdez-Vega Álvarez
	 * @version 1.0, 19/02/2022
	 * @param num_nota
	 * @return
	 * Método que recibe un int como parámetro y entra en diversos if, comparando dicho int
	 * para entrar en alguno (o en el else) y así devolver un mensaje tipo String con la
	 * calificación asociada a dicha nota.
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
