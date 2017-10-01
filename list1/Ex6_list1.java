/*Escreva um programa que converta um valor em real
	 em uma vari´avel), para d´olar. A
	taxa de convers˜ao real para d´olar tamb´em ´e um dado do programa*/

class Ex4_list1{
	static double conversao(double taxa_diferenca, double valor_real){
		double valor_dolar = taxa_diferenca * valor_real;
		return valor_dolar ;
	}
	public static void main(String[] args){
		double valor_real = 2;
		System.out.println(valor_real + " convertido em dolar equivale a: " + conversao(2.5, valor_real));
	}
} 