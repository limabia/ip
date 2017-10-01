class BuscaBin{
	
	static int procura(double[] array, double valorProc) {
		int fim = array.length-1;
		int ini = 0;

		while (ini <= fim) {
			int meio = (fim + ini)/2;
			//System.out.println(meio);
			if (array[meio] < valorProc)
				ini = meio + 1;
			else
				if (array[meio] > valorProc)
					fim = meio-1;

			else 
				return(meio);
		}

		return(-1);
	}

	public static void main(String[] args){
		double valor = 4;
		double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
		System.out.println("O elemento procurado está na posição " + procura(array, valor) + " do array.");
		System.out.println("O elemento procurado é " + array[procura(array, valor)]);
	}
}