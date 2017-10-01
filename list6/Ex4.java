/*Construa a classe Inteiro que representa um n´umero inteiro. Essa classe deve ter os
seguintes atributos e m´etodos:
• Atributos:
– int valor – Valor do inteiro representado.
• M´etodos para intera¸c˜ao com o usu´ario da classe:
– void carregaValor(int v) – Muda o valor representado por este objeto. O novo
valor deve ser v.
– int devolveValor() – Devolve o valor representado por este objeto.
– int devolveValorAbsoluto() – Devolve o valor absoluto do valor representado
por este objeto.
– void imprime() – Imprime algo que representa este objeto. Sugest˜ao: imprima
o seu valor.
– int soma(int v) – Soma v ao valor deste objeto (valor + v). Este objeto passa
a representar o novo valor, que tamb´em deve ser devolvido pelo m´etodo.
– int subtrai(int v) – Subtrai v do valor deste objeto (valor - v). Este objeto
passa a representar o novo valor, que tamb´em deve ser devolvido pelo m´etodo.
– int multiplicaPor(int v) – Multiplica o valor deste objeto por v (valor * v).
Este objeto passa a representar o novo valor, que tamb´em deve ser devolvido
pelo m´etodo.
– int dividePor(int divisor) – Verifica se divisor ´e diferente de zero. Se n˜ao,
imprime uma mensagem de erro e n˜ao faz nada (devolve o valor inalterado).
Se for, divide o valor deste objeto por v (valor / divisor, divis˜ao inteira). Este
objeto passa a representar o novo valor, que tamb´em deve ser devolvido pelo
m´etodo.
*/
class Ex4{
	int valor;

	void carregaValor(int v) {
		valor = v;
	}

	int devolveValor() {
		return valor;
	}

	int devolveValorAbsoluto() {
		return Math.abs(valor);
	}

	void imprime() {
		System.out.println(valor);
	}

	int soma(int v) {
		valor =+ v;
		return valor;
	}

	int subtrai(int v) {
		valor -= v;
		return valor;
	}

	int multiplicaPor(int v) {
		valor *= v; 
		return valor;
	}

	double dividePor(int divisor) {
		System.out.println(valor);

		if (divisor == 0){
			System.out.println("O divisor não pode ser zero");
			return valor;
		}	
		else{
			valor = valor / divisor;
			return valor;
		}
	}

	public static void main(String[] args){
		
		Ex4 objeto = new Ex4();
		objeto.valor = 5;

		System.out.println(objeto.devolveValor());
		objeto.imprime();
		System.out.println(objeto.soma(2));
		System.out.println(objeto.subtrai(4));
		System.out.println(objeto.multiplicaPor(4));
		System.out.println(objeto.dividePor(2));
	}
}