
import javax.swing.JOptionPane;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cantidad recibida
		String cantidad;
		// Boolean para repetir el programa en caso de querer continuar
		boolean repetirPrograma = true;
		// Opciones de conversion
		String[] conversiones = { "Pesos a Dolar", "Pesos a Euros", "Pesos a Libras", "Pesos a Yenes", "Pesos a Won",
				"Dolar a Pesos", "Euros a Pesos", "Libras a Pesos", "Yenes a Pesos", "Won a Pesos" };
		/**
		 * Instancias de las monedas
		 */
		Dolar dolar = new Dolar();
		Euro euro = new Euro();
		Libras libra = new Libras();
		Yen yen = new Yen();
		Won won = new Won();

		/**
		 * Ciclo para validar la entrada de solo numeros para realizar la conversion y
		 * repetir en caso de error
		 */
		do {

			// Validacion de registro de cantidad a convertir
			boolean repetirCantidad = true;
			do {
				cantidad = JOptionPane.showInputDialog("Ingresa la cantidad a convertir");
				if (contieneSoloNumerosRegex(cantidad)) {
					repetirCantidad = false;
				} else {

					JOptionPane.showMessageDialog(null, "Solo debes ingresas valores numericos", "Alerta",
							JOptionPane.WARNING_MESSAGE);
				}
			} while (repetirCantidad);

			/**
			 * Seleccion de conversion, recibe el arreglo con las opciones
			 */
			String tipoConversion = (String) JOptionPane.showInputDialog(null, "Selecciona la conversion",
					"Conversiones", JOptionPane.QUESTION_MESSAGE, null, conversiones, conversiones[0]);

			/**
			 * Evalua la seleccion de conversion y actua según esta
			 */

			switch (tipoConversion) {
			case "Pesos a Dolar":
				JOptionPane.showMessageDialog(null, dolar.resultado(cantidad, dolar.conversion(cantidad)), "RESULTADO",
						JOptionPane.INFORMATION_MESSAGE);
				break;

			case "Pesos a Euros":
				JOptionPane.showMessageDialog(null, euro.resultado(cantidad, euro.conversion(cantidad)), "RESULTADO",
						JOptionPane.INFORMATION_MESSAGE);

				break;

			case "Pesos a Libras":
				JOptionPane.showMessageDialog(null, libra.resultado(cantidad, libra.conversion(cantidad)), "RESULTADO",
						JOptionPane.INFORMATION_MESSAGE);
				break;

			case "Pesos a Yenes":
				JOptionPane.showMessageDialog(null, yen.resultado(cantidad, yen.conversion(cantidad)), "RESULTADO",
						JOptionPane.INFORMATION_MESSAGE);
				break;

			case "Pesos a Won":
				JOptionPane.showMessageDialog(null, won.resultado(cantidad, won.conversion(cantidad)), "RESULTADO",
						JOptionPane.INFORMATION_MESSAGE);
				break;

			case "Dolar a Pesos":
				dolar.moneda_A_Pesos = true;
				JOptionPane.showMessageDialog(null, dolar.resultado(cantidad, dolar.conversion(cantidad)), "RESULTADO",
						JOptionPane.INFORMATION_MESSAGE);
				break;

			case "Euros a Pesos":
				euro.moneda_A_Pesos = true;
				JOptionPane.showMessageDialog(null, euro.resultado(cantidad, euro.conversion(cantidad)), "RESULTADO",
						JOptionPane.INFORMATION_MESSAGE);
				break;

			case "Libras a Pesos":
				libra.moneda_A_Pesos = true;
				JOptionPane.showMessageDialog(null, libra.resultado(cantidad, libra.conversion(cantidad)), "RESULTADO",
						JOptionPane.INFORMATION_MESSAGE);
				break;

			case "Yenes a Pesos":
				yen.moneda_A_Pesos = true;
				JOptionPane.showMessageDialog(null, yen.resultado(cantidad, yen.conversion(cantidad)), "RESULTADO",
						JOptionPane.INFORMATION_MESSAGE);
				break;

			case "Won a Pesos":
				won.moneda_A_Pesos = true;
				JOptionPane.showMessageDialog(null, won.resultado(cantidad, won.conversion(cantidad)), "RESULTADO",
						JOptionPane.INFORMATION_MESSAGE);
				break;

			default:
				break;
			}

			/**
			 * Mesaje para realizar otra operacion o repetirla
			 */
			int continuar = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?", "Continuar",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (continuar == 0) {
				repetirPrograma = false;
			} else {
				JOptionPane.showMessageDialog(null, "Programa Finalizado", "FIN", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		} while (repetirPrograma = true);

	}

	/**
	 * Validacion de entrada de solo numeros con una regex recibe los datos del
	 * primer input
	 * 
	 * @param cadena
	 * @return
	 */
	public static boolean contieneSoloNumerosRegex(String cadena) {
		return cadena.matches("[0-9]+");
	}

}
