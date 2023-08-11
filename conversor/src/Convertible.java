
public interface Convertible {

	/**
	 * Metodo de conversion recibe la cantidad indicada y realiza la operacion devolviendola en fomra de cadena
	 * @param cantidad
	 * @return
	 */
	public String conversion(String cantidad);
	
	/**
	 * Metodo para sacar el resultado de la conversion tomando el valor a convertir y resutlado de la conversion
	 * @param valorInicial
	 * @param valorFinal
	 * @return
	 */

	public String resultado(String valorInicial, String valorFinal);
}
