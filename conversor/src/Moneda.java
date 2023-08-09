
public abstract class Moneda {

	double valor;
	 boolean moneda_A_Pesos;
	String nombreMoneda;
	char signo;
	
	public Moneda(double valor,boolean moneda_A_Pesos,String nombreMoneda,char signo) {
		this.valor=valor;
		this.moneda_A_Pesos=moneda_A_Pesos;
		this.nombreMoneda=nombreMoneda;
		this.signo=signo;
	}
	
	

	
}
