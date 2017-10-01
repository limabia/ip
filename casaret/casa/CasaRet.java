package casa;
/*
	Programa para calcular a área de uma casa, conforme
	projeto específico.
*/
public class CasaRet extends Casa{
	/* Lateral da sala */
	double lateral = 10;
	
	/* Comprimento do quarto */
	double cquarto = 10;
	
	/*
		Construtor para CasaRet
	*/
	public CasaRet() {}
	
	/*
		Construtor para CasaRet
		
		Parâmetro:
			valorM2 - preço do metro quadrado
	*/
	public CasaRet(double valorM2) {
		super(valorM2);
	}
	
	/*
		Construtor para CasaRet
		
		Parâmetro:
			lateral - lateral da sala
			cquarto - comprimento do quarto
	*/
	public CasaRet(double lateral, double cquarto) {
		this.lateral = lateral;
		this.cquarto = cquarto;
	}
	
	/*
		Construtor para CasaRet
		
		Parâmetro:
			lateral - lateral da sala
			cquarto - comprimento do quarto
			valorM2 - preço do metro quadrado
	*/
	public CasaRet(double lateral, double cquarto, double valorM2) {
		super(valorM2);
		this.lateral = lateral;
		this.cquarto = cquarto;
	}

	/*
		Retorna a área da casa (e seus cômodos), ou -1 se
		lateral ou cquarto forem negativos.
	*/
	public double area() {
		double areat=-1;
		if (this.lateral>=0 && this.cquarto>=0) {
			areat = this.lateral*this.lateral;
			areat += this.cquarto*this.lateral;
		}
		return(areat);
	}
}
