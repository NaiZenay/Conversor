package conversor;

import javax.swing.JOptionPane;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] conversiones= {"Pesos a Dolar","Pesos a Euros","Pesos a Libras","Pesos a Yenes", "Pesos a Won"};
		String cantidad = JOptionPane.showInputDialog("Ingresa la cantidad a convertir\n(Este conversor utiliza pesos mexicanos)");
		String tipoConversion = (String) JOptionPane.showInputDialog(null, "Selecciona la conversion","Conversiones",JOptionPane.QUESTION_MESSAGE, null, conversiones, conversiones[0]);
		  }
	}


