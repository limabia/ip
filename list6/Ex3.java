class Ex3 {
	// recebe um arranjo do tipo int vazio e preenche o vetor
	int inicializaArray(int[] a, int v) {
		if (a == null){
			for(int i=0; i < a.length; ++i){
				a[i] = v;
				v++;
			}
		}
		return(a.length);
	}
	// printa os valores do array
	void imprimeArray(int[] a) {
		for(int i=0; i<a.length; ++i) {
			System.out.println("O valor " + i + " do array é " + a[i]);
		}
	}
	// veridica se o elemento v está nesse array
	boolean estaNoArray ( int[] a , int v ){
		for(int i=0; i<a.length; ++i) {
			if(a[i] == v){
				return(true);
			}
		}
		return(false);
	}

	public static void main(String [] args) {
		Ex3 lista = new Ex3();
		int[] valores = {1,5,10,6};
		System.out.println("O tamanho do array 1 recebido é: " + lista.inicializaArray(valores, 2));
		lista.imprimeArray(valores);
		System.out.println("valor está no array? " + lista.estaNoArray(valores, 1));
	}
}