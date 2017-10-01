package casa;
/*
	Programa para calcular a área de uma casa quadrada.
*/
public class CasaQuad extends Casa {
	/* Lateral da casa */
	double lateral = 10;

	/*
		Construtor para CasaQuad
	*/	
	public CasaQuad() {}
	
	/*
		Construtor para CasaQuad
		
		Parâmetro:
			valorM2 - valor do m2 da construção
	*/
	public CasaQuad(double valorM2) {
		super(valorM2);
	}
	
	/*
		Construtor para AreaCasa
		
		Parâmetro:
			lateral - lateral da casa
			valorM2 - valor do m2 da construção
	*/
	public CasaQuad(double lateral, double valorM2) {
		this(valorM2);
		this.lateral = lateral;
	}
	
	/*
		Retorna a area dessa casa, ou -1 se lateral for negativa
	*/
	public double area() {
		return(this.lateral>=0 ? this.lateral*this.lateral : -1);
	}
}
