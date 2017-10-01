class Ex1{

	double a(int meses, double taxa) {
		return Math.pow((taxa + 100) / 100, meses) -1; // (taxa + 100) / 100 elevado a meses
	}

	public static void main(String[] args){
		Ex1 objeto = new Ex1();
		System.out.println(objeto.a(2,2.0));
	}
}