package conversor;

import javax.swing.JOptionPane;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cantidad;
		String resultado;
		double cantidadFinal;
		boolean repetirPrograma =true;
		String[] conversiones = { "Pesos a Dolar", "Pesos a Euros", "Pesos a Libras", "Pesos a Yenes", "Pesos a Won", "Dolar a Pesos","Euros a Pesos","Libras a Pesos","Yenes a Pesos","Won a Pesos" };


		do {
			
			//Validacion de registro de cantidad a convertir
			boolean repetirCantidad = true;
			do {
				 cantidad = JOptionPane
						.showInputDialog("Ingresa la cantidad a convertir");
				if(contieneSoloNumerosRegex(cantidad)) {
					repetirCantidad = false;
				}else {
					JOptionPane.showMessageDialog(null, "Solo debes ingresas valores numericos", "Alerta", JOptionPane.WARNING_MESSAGE);
				}
			} while (repetirCantidad);

			
			String tipoConversion = (String) JOptionPane.showInputDialog(null, "Selecciona la conversion", "Conversiones",
					JOptionPane.QUESTION_MESSAGE, null, conversiones, conversiones[0]);

			switch (tipoConversion) {
			case "Pesos a Dolar":
				Double cantidadConvetidaDolar = Double.valueOf(cantidad);
				cantidadFinal=Math.round(cantidadConvetidaDolar/=16.87);
				resultado=cantidad + "Pesos equivale a $" + cantidadFinal +" Dolares";
				JOptionPane.showMessageDialog(null, resultado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case "Pesos a Euros":
				Double cantidadConvetidaEuro = Double.valueOf(cantidad);
				cantidadFinal=Math.round(cantidadConvetidaEuro/=18.69);
				resultado=cantidad + "Pesos equivale a €" + cantidadFinal +" Euros";
				JOptionPane.showMessageDialog(null, resultado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case "Pesos a Libras":
				Double cantidadConvetidaLibras = Double.valueOf(cantidad);
				cantidadFinal=Math.round(cantidadConvetidaLibras/=21.46);
				resultado=cantidad + "Pesos equivale a £" + cantidadFinal +" Libras";
				JOptionPane.showMessageDialog(null, resultado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case "Pesos a Yenes":
				Double cantidadConvetidaYen = Double.valueOf(cantidad);
				cantidadFinal=Math.round(cantidadConvetidaYen/=0.12);
				resultado=cantidad + "Pesos equivale a ¥" + cantidadFinal +" Yenes";
				JOptionPane.showMessageDialog(null, resultado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case "Pesos a Won":
				Double cantidadConvetidaWon = Double.valueOf(cantidad);
				cantidadFinal=Math.round(cantidadConvetidaWon/=0.013);
				resultado=cantidad + "Pesos equivale a ₩" + cantidadFinal +" Wones";
				JOptionPane.showMessageDialog(null, resultado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
				break;
				
				
			case "Dolar a Pesos":
				Double cantidadConvetidaDolar_Pesos = Double.valueOf(cantidad);
				cantidadFinal=Math.round(cantidadConvetidaDolar_Pesos*=16.87);
				resultado=cantidad + "Dolares equivale a $" + cantidadFinal +" Pesos";
				JOptionPane.showMessageDialog(null, resultado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
				break;
			
			case "Euros a Pesos":
				Double cantidadConvetidaEuros_Pesos = Double.valueOf(cantidad);
				cantidadFinal=Math.round(cantidadConvetidaEuros_Pesos*=18.69);
				resultado=cantidad + "Euros equivale a $" + cantidadFinal +" Pesos";
				JOptionPane.showMessageDialog(null, resultado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case "Libras a Pesos":
				Double cantidadConvetidaLibras_Pesos = Double.valueOf(cantidad);
				cantidadFinal=Math.round(cantidadConvetidaLibras_Pesos*=21.46);
				resultado=cantidad + "Libras equivale a $" + cantidadFinal +" Pesos";
				JOptionPane.showMessageDialog(null, resultado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
				break;
			
			case "Yenes a Pesos":
				Double cantidadConvetidaYenes_Pesos = Double.valueOf(cantidad);
				cantidadFinal=Math.round(cantidadConvetidaYenes_Pesos*=0.12);
				resultado=cantidad + "Yenes equivale a $" + cantidadFinal +" Pesos";
				JOptionPane.showMessageDialog(null, resultado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case "Won a Pesos":
				Double cantidadConvetidaWon_Pesos = Double.valueOf(cantidad);
				cantidadFinal=Math.round(cantidadConvetidaWon_Pesos*=0.013);
				resultado=cantidad + "Won equivale a $" + cantidadFinal +" Pesos";
				JOptionPane.showMessageDialog(null, resultado, "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
				break;
				
				
			default:
				break;
			}
			
			int continuar=JOptionPane.showConfirmDialog(null,"¿Desea Continuar?","Continuar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			if(continuar==0) {
				repetirPrograma=false;
			}else {
				JOptionPane.showMessageDialog(null, "Programa Finalizado", "FIN", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
		}while(repetirPrograma=true);
		
	}

	public static boolean contieneSoloNumerosRegex(String cadena) {
		return cadena.matches("[0-9]+");
	}
}
