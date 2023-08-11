import java.text.DecimalFormat;

public class Libras  extends Moneda implements Convertible{
	public Libras() {
		super(21.46,false,"Libras",'£');
	}
	/**
	 * Convierte la cantidad recibida en decimal con un formato para entragar solo 2
	 * decimales y una condicon para saber si la moneda se esta convirtiendo a pesos
	 * o de pesos a la moneda
	 */
	@Override
	public String conversion(String cantidad) {
		String resultadoConversion;
		Double cantidadConvertida_Numero=Double.valueOf(cantidad);
		DecimalFormat formato= new DecimalFormat("#.00");
		if(moneda_A_Pesos==false) {
			resultadoConversion=formato.format(cantidadConvertida_Numero/=valor);
		}else{
			 resultadoConversion=formato.format(cantidadConvertida_Numero*=valor);
		}
		return resultadoConversion;
	}
	
	/**
	 * Imprime 2 variantes del resultado de la conversion segun si la moneda fue
	 * convertida a pesos o de pesos a la moneda tomando de parametro la cantidad a
	 * convertir y la conversion ya realizada
	 */

	@Override
	public String resultado(String valorInicial, String valorFinal) {
		String resultado;
		if(moneda_A_Pesos==true) {
			 resultado = signo+valorInicial +" "+ nombreMoneda + " equivale a "+ valorFinal+" Pesos";				
		}else {
			 resultado = valorInicial +" Pesos equivale a "+ signo+valorFinal + " " + nombreMoneda;					
		}
		
		return resultado;
	}
}
