import casa.Casa;
import piscina.AreaPiscina;

/*
	Define uma residência no projeto, composta por casa e piscina.
*/
class Residencia {
	/* Casa da residência */
	Casa casa;
	/* Piscina da residência */
	AreaPiscina piscina;
	
	/*
		Construtor para Residencia
		
		Parâmetros:
			casa - a casa da residência
			piscina - piscina da residência
	*/
	Residencia(Casa casa,AreaPiscina piscina) {
		this.casa = casa;
		this.piscina = piscina;
	}
	
	/*
		Retorna a area dessa residência
	*/
	double area() {
		return(this.casa.area()+this.piscina.area());
	}
	
	/*
		Busca uma residência de uma determinada área em um arranjo
		ordenado de residências. Usa busca binária.
		
		Parâmetros:
			arr - o arranjo de residências
			area - a área da residência buscada
		
		Retorna:
			O índice de uma residência no arranjo com essa área, ou
			-1 se não encontrar.
	*/
	static int buscaBin(Residencia[] arr, double area) {
		int fim = arr.length-1;
		int ini = 0;
		while (ini <= fim) {
			int meio = (fim + ini)/2;
			if (arr[meio].area() < area)
				ini = meio + 1;
			else
				if (arr[meio].area() > area)
					fim = meio-1;
				else
					return(meio);
		}
		return(-1);
	}
	
	/*
		Compara esta residência a outra, pela área
		
		Parâmetro:
			outra - objeto correspondendo à outra residência
		
		Retorna:
			0 se ambas forem iguais
			>0 se esta for maior que a outra, ou a outra for null
			<0 se a outra for menor que esta
	*/
	double comparaRes(Residencia outra) {
		if (outra == null) return(1);
		return(this.area() - outra.area());
	}
	
	/*
		Ordena arranjo de residências, conforme o método da bolha.
		Modifica o arranjo original.
		
		Parâmetro:
			v - arranjo a ser ordenado.
	*/
	static void bolha(Residencia[] v) {
		for (int ult = v.length-1; ult>0; ult--)
			for (int i=0; i<ult; i++)
				if (v[i].comparaRes(v[i+1]) > 0) {
					Residencia aux = v[i];
					v[i] = v[i+1];
					v[i+1] = aux;
				}
	}
	
	/*
		Retorna a posição do menor elemento de um arranjo de residências,
		começando de uma posição específica. Usa o método comparaRes
		de cada residência. Usa busca sequencial.
		
		Parâmetros:
			v - arranjo de residências
			inicio - posição no arranjo de onde a busca começa
		
		Retorna:
			Posição do elemento no arranjo ou -1 se não encontrar
	*/
	static int posMenorEl(Residencia[] v, int inicio) {
		int posMenor = -1;
		if ((v!=null) && (inicio>=0) && (inicio < v.length)) {
			posMenor = inicio;
			for (int i=inicio+1; i<v.length; i++)
				if (v[i].comparaRes(v[posMenor]) < 0)
					posMenor = i;
		}
		return(posMenor);
	}
	
	/*
		Ordena arranjo de residências, conforme o método da seleção.
		Modifica o arranjo original.
		
		Parâmetro:
			v - arranjo a ser ordenado.
	*/
	static void selecao(Residencia[] v) {
		for (int i=0; i<v.length-1; i++) {
			int posMenor = posMenorEl(v,i);
			if (v[posMenor].comparaRes(v[i]) < 0) {
				Residencia aux = v[i];
				v[i] = v[posMenor];
				v[posMenor] = aux;
			}
		}
	}
	
	/*
		Ordena arranjo de residências, conforme o método da inserção.
		Modifica o arranjo original.
		
		Parâmetro:
			v - arranjo a ser ordenado.
	*/
	static void insercao(Residencia[] v) {
		for (int i=1; i<v.length; i++) {
			Residencia aux = v[i];
			int j = i;
			while ((j > 0) && (aux.comparaRes(v[j-1]) < 0)) {
				v[j] = v[j-1];
				j--;
			}
			v[j] = aux;
		}
	}
	
	public static void main(String[] args) {
	}
}
