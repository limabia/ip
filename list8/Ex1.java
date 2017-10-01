/*  Escreva uma classe que guarde o c´odigo de um produto e o c´odigo de seu fabricante. Em
seguida, escreva um m´etodo que ordene um arranjo de produtos (objetos dessa classe),
passado como parˆametro, de acordo com o c´odigo de fabricante e, caso os produtos sejam
de um mesmo fabricante, de acordo com o c´odigo do produto.*/

class Produto {
	double codProd;
	double codFabr;
}

class Ex1 {
	static void ordena (Produto [] codigos){
		Produto aux = null;
		for (int ult = codigos.length-1; ult>0; ult--){
			for (int i = 0; i<ult; i++) {
				if (codigos[i].codFabr > codigos[i+1].codFabr) {
					aux = codigos[i];
					codigos[i] = codigos[i+1];
					codigos[i+1] = aux;
				}
				else {
					if (codigos[i].codFabr == codigos[i+1].codFabr){
						if (codigos[i].codProd > codigos[i+1].codProd) {
							aux = codigos[i];
							codigos[i] = codigos[i+1];
							codigos[i+1] = aux;
						}
					}
				}
			}
		}
		for (int i = 0; i<codigos.length; i++){
			System.out.println ("fabr ordenado  " + codigos[i].codFabr);
			System.out.println ("prod ordenado  " + codigos[i].codProd);
		}
	}

	public static void main (String [] args) {
		Produto[] codigos = new Produto[5];
		
		for (int i = 0; i < codigos.length; i++) {
			Produto a = new Produto();
			codigos[i] = a;
			codigos[i].codProd = Math.random();
			codigos[i].codFabr = Math.random();
		}

		for (int i = 0; i<codigos.length; i++){
			System.out.println ("cod fabr " + codigos[i].codFabr);
			System.out.println ("cod prod " + codigos[i].codProd);
		}

		ordena(codigos);
	}
}