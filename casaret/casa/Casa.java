package casa;
/*
	Casa genérica.
*/
public class Casa {
	/* Valor do metro quadrado para a construção */
	private double valorM2 = 1500;
	
	/*
		Construtor para a classe
	*/
	public Casa(){}
	
	/*
		Construtor para a classe
		
		Parâmetro:
			valorM2 - valor do m2 da construção.
	*/
	public Casa(double valorM2) {
		this.valorM2 = valorM2;
	}
	
	/*
		Calcula o valor da casa.
		
		Parâmetro:
			area - área construída da casa
		
		Retorna:
			Valor da casa, ou -1 se sua área for negativa
	*/
	public double valor(double area) {
		if (area >= 0) return(this.valorM2*area);
		return(-1);
	}
	
	/*
		Método dummie para cálculo da área de uma casa.
	*/
	public double area() {
		return(-1);
	}
}
