package notas;

public class Califica {

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
