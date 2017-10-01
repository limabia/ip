/*Escreva uma classe Ola com um ´unico m´etodo cumprimenta que,
a cada chamada,cumprimenta o usu´ario de uma entre 3 maneiras 
diferentes. Dica: use um atributo para,dependendo de seu valor,
escolher qual das maneiras ser´a usada; depois de imprimir a
mensagem, altere o valor do atributo*/

class Ex2 {

	void cumprimenta (int maneira) {
		if (maneira == 1) System.out.println ("Oi");
		if (maneira == 2) System.out.println ("Ola");
		if (maneira == 3) System.out.println ("Hi");
	}
	public static void main (String [] args) {
		Ex2_lista6 ola = new Ex2_lista6();
		ola.cumprimenta(3);
		ola.cumprimenta(2);
		ola.cumprimenta(1);
	}
}