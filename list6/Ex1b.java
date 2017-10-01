class Ex1b{
	
	double juros(int meses, double taxa) {
		return Math.pow((taxa + 100) / 100, meses) -1; // (taxa + 100) / 100 elevado a meses
	}


	static void b(double valorEmprestado, int meses) {
		final double TAXA = 1.2;
		Ex1b a = new Ex1b();
		double valorDaDivida = valorEmprestado + (a.juros(meses, TAXA) * valorEmprestado);
		System.out.println("Divida de "+valorDaDivida+" real(is)," + "calculada com taxa de "+TAXA+"% ao mes.");
	}
	public static void main(String[] args){
		b(10, 2);
	}
}