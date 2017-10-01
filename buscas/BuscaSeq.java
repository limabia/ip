class BuscaSeq{	
	
	static double buscaSeq(double[] lista, double el) {
		for (int i=0; i<lista.length; i++) {
			if (lista[i] == el) { 
				return(i);
			}
			if (lista[i] > el) {
				break;
			}
		}
		return(-1);
	}
	
	public static void main(String[] args) {
		double[] v = {-78, -4, 0, 32, 52, 55, 63, 69 ,125, 200};
		System.out.println(buscaSeq(v, 23));
		System.out.println(buscaSeq(v, 8));
	}
}