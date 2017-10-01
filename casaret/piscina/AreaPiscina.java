package piscina;
/*
	Programa para calcular a área de uma casa com piscina, conforme
	projeto específico.
*/
public class AreaPiscina {
	/* Materiais para a piscina */
	static final int ALVENARIA = 0;
	static final int VINIL = 1;
	static final int FIBRA = 2;
	static final int PLASTICO = 3;
	
	/*
		Valor do m2 para piscinas de diferentes materiais.
		O material deve ser usado como índice no arranjo
		para se obter o valor de seu m2
	*/
	double[] precos;
	
	/* nomes dos materiais */
	static String[] nomes = {"Alvenaria","Vinil","Fibra","Plástico"};

	/* raio da piscina */
	public double raio;

	/*
		Construtor para AreaPiscina
	*/
	public AreaPiscina() {
		double[] aux = {1500, 1100, 750,500};
		this.precos = aux;
		this.raio = 10;
	}
	
	/*
		Construtor para AreaPiscina
		
		Parâmetro:
			precos - preços dos diferentes materiais. Arranjo de
			valores com índices correspondendo aos códigos para cada material
	*/
	public AreaPiscina(double[] precos) {
		this.precos = precos;
		this.raio = 10;
	}
	
	/*
		Construtor para AreaPiscina
		
		Parâmetro:
			raio - raio da piscina
	*/
	public AreaPiscina(double raio) {
		this();
		this.raio = raio;
	}
	
	/*
		Construtor para AreaPiscina
		
		Parâmetros:
			precos - preços dos diferentes materiais. Arranjo de
			valores com índices correspondendo aos códigos para cada material
			raio - raio da piscina
	*/
	public AreaPiscina(double[] precos,double raio) {
		this.precos = precos;
		this.raio = raio;
	}
	
	/*
		Obtém o código do material, dado seu nome.
		
		Parâmetro:
			nome - o nome do material
		
		Retorna:
			O código do material ou -1 caso este não exista
	*/	
	public static int tipoMat(String nome) {
		for (int i=0; i<nomes.length; i++)
			if (nomes[i].equals(nome)) return(i);
		return(-1);
	}
	
	/*
		Método para calcular a área de uma piscina redonda.
		
		Retorna:
			A área da piscina, ou -1 se o raio for negativo
	*/
	public double area() {
		return((this.raio >= 0) ? Math.PI * Math.pow(this.raio,2) : -1);
	}


	/*
		Calcula o valor de uma piscina.
		
		Parâmetro:
			area: área da piscina
			material: material de que é feita
		
		Retorna:
			O valor (preço) da construção, ou -1 se a área for negativa
	*/
	public double valor(double area, int material) {
		if (material<ALVENARIA || material>PLASTICO || area<0) return(-1);
		return(area*precos[material]);
	}
	
	
	/*
		Carrega os valores das piscinas na matriz de área X material
		
		Parâmetro:
			m: matriz a ser carregada
	*/
	public void carregaVal(double[][] m) {
		for (int i=0; i<m.length; i++)
			for (int j=50; j<=200; j+=50)
				m[i][j / 50 - 1] = valor(j,i);
	}
	
	
	/*
		Aplica à tabela de valores de m2 uma tabela de descontos.
		
		Parâmetros:
			val: tabela de valores
			desc: tabela de descontos
		
		Retorna:
			tabela dos valores com descontos aplicados
	*/
	public double[][] calculaFinal(double[][] val, double[][] desc) {
		double[][] saida = new double[val.length][val[0].length];
		
		for (int i=0; i<saida.length; i++)
			for (int j=0; j<saida[0].length; j++)
				saida[i][j] = val[i][j]*(1-desc[i][j]);
		return(saida);
	}
	

	public static void main(String[] args) {
		
	}
}
