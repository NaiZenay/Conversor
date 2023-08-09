import java.text.DecimalFormat;

public class Yen extends Moneda implements Convertible{
	public Yen() {
		super(0.12,false,"Yenes",'¥');
	}
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

	@Override
	public String resultado(String valorInicial, String valorFinal) {
		String resultado;
		if(moneda_A_Pesos==true) {
			 resultado = signo+valorInicial +" "+ nombreMoneda + " equivale a "+ valorFinal+" Pesos";				
		}else {
			 resultado = valorInicial +" Pesos equivale a "+signo+ valorFinal + " " + nombreMoneda;					
		}
		
		return resultado;
	}
}
