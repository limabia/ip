/*
	Lista ligada de residências
*/
public class ListaSimples {
	/* cabeça da lista */
	No cabeca;
	
	/*
		Constrói uma lista sem elementos
	*/
	public ListaSimples() {
		this.cabeca = null;
	}
	
	/*
		Insere uma residência no início da lista
		
		Parâmetro:
			el - residência a ser inserida
	*/
	public void insere(Residencia el) {
		No aux = new No(el);
		aux.prox = this.cabeca;
		this.cabeca = aux;
	}
	
	/*
		Retorna o número de elementos da lista
	*/
	public int elementos() {
		int cont = 0;
		
		No p = this.cabeca;
		while (p != null) {
			p = p.prox;
			cont++;
		}
		return(cont);
	}
	
	/*
		Insere uma residência em uma posição da lista
		
		Parâmetro:
			el - residência a ser inserida
			pos - posição onde a residência deve ser inserida
			
		Retorna:
			true se conseguiu inserir, false se a posição for inválida
	*/
	public boolean insere(Residencia el, int pos) {
		if (pos < 0 || pos > this.elementos())
			return(false);
		
		No q = new No(el);
		if (pos == 0) {
			q.prox = this.cabeca;
			this.cabeca = q;
		}
		else {
			No p = this.cabeca;
			for (int i=0; i<pos-1; i++) p = p.prox;
			q.prox = p.prox;
			p.prox = q;
		}
		return(true);
	}
	
	/*
		Exclui um elemento da lista
		
		Parâmetro:
			i - posição da qual o elemento será excluído
		
		Retorna:
			true se conseguiu excluir, false se a posição for inválida ou a lista estiver vazia.
	*/
	public boolean exclui(int i) {
		if (i < 0 || i >= this.elementos() || this.cabeca == null)
			return(false);
		
		if (i == 0) this.cabeca = this.cabeca.prox;
		else {
			No p = this.cabeca;
			for (int j=0; j<(i-1); j++) {
				p = p.prox;
			}
			p.prox = p.prox.prox;
		}
		return(true);
	}
}
