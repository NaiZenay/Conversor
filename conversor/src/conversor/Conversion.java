package conversor;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df=new DecimalFormat("#.00");

		String cantidad;
		String resultado;
		String[] conversiones = { "Pesos a Dolar", "Pesos a Euros", "Pesos a Libras", "Pesos a Yenes", "Pesos a Won" };

		//Validacion de registro de cantidad a convertir
		boolean repetir = true;
		do {
			 cantidad = JOptionPane
					.showInputDialog("Ingresa la cantidad a convertir\n(Este conversor utiliza pesos mexicanos)");
			if(contieneSoloNumerosRegex(cantidad)) {
				repetir = false;
			}
		} while (repetir);

		String tipoConversion = (String) JOptionPane.showInputDialog(null, "Selecciona la conversion", "Conversiones",
				JOptionPane.QUESTION_MESSAGE, null, conversiones, conversiones[0]);

		switch (tipoConversion) {
		case "Pesos a Dolar":
			Double cantidadConvetidaDolar = Double.valueOf(cantidad);
			df.format(cantidadConvetidaDolar/=16.87);
			resultado=cantidad + " equivale a " + cantidadConvetidaDolar +" Dolares";
			JOptionPane.showMessageDialog(null, resultado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case "Pesos a Euros":
			Double cantidadConvetidaEuro = Double.valueOf(cantidad);
			df.format(cantidadConvetidaEuro/=18.69);
			resultado=cantidad + " equivale a " + cantidadConvetidaEuro +" Euro";
			JOptionPane.showMessageDialog(null, resultado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
			break;

		default:
			break;
		}

	}

	public static boolean contieneSoloNumerosRegex(String cadena) {
		return cadena.matches("[0-9]+");
	}
}
