class Matriz{

	static int subtracao(){
		return(1);
	}

	static int [][] soma(int [][] matriz1, int [][] matriz2){
		int [][] resultado = new int [4][4];
		for(int i=0; i<4; ++i){
			for(int j=0; j<4; ++j){
				resultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		return(resultado);
	}

	static int multiplicacao(){
		int [][] resultado = new int [4][4];
		for(int i=0; i<4; ++i){
			for(int j=0; j<4; ++j){
				resultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		return(resultado);
	}

	static int divisao(){
		int [][] resultado = new int [4][4];
		for(int i=0; i<4; ++i){
			for(int j=0; j<4; ++j){
				resultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		return(resultado);
	}

	public static void main(String[] arg){
		int [][] matriz1 = {{2, 5, 9, 4},
						   {3, 8, 1, 5},
						   {4, 0, 7, 1},
						   {3, 4, 1, 2}};
		int [][] matriz2 = {{2, 5, 9, 4},
						   {3, 8, 1, 5},
						   {4, 0, 7, 1},
						   {3, 4, 1, 2}};
		soma(matriz1, matriz2);
	}
}