
public abstract class Moneda {

	double valor;
	boolean moneda_A_Pesos;
	String nombreMoneda;
	char signo;
	
	/**
	 * Constructor base de todas las monedas valores que cada moneda debe tener
	 * @param valor
	 * @param moneda_A_Pesos
	 * @param moneda
	 * @param signo
	 */

	public Moneda(double valor, boolean moneda_A_Pesos ,String moneda , char signo) {
		this.valor = valor;
		this.moneda_A_Pesos = moneda_A_Pesos;
		this.nombreMoneda = moneda;
		this.signo = signo;
	}

}
