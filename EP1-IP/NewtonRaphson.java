/*********************************************************************/
/**    <Bianca Lima Santos>                     <10346811>          **/
/**                                                                 **/
/**   <28/05/2017>                                                  **/
/*********************************************************************/
class NewtonRaphson{
	/* array para depósitos realizados e saldo final*/
	static double[] depositos = new double[11];
	/* array para datas de depósitos realizados e saldo final*/
	static int[] datas = new int[11];
	
	/* método para calculo da funcao, retornando o seu resultado */
	static double funcao(double j) {
		/* resultado é a soma de deposito multiplicado por (1+j), elevado a ultima data de deposito subtraida a data da posição atual, 
			isso em um for que incrementa o valor obtido na variavel resultado e assim é repetido até todo o array depositos ser percorrido
		 */
		double resultado = 0;
		for (int i=0; i<10; i++) {
			resultado += depositos[i] * Math.pow(1 + j, datas[10] - datas[i]);
		}
		double saldo_final = depositos[10];
		resultado -= saldo_final;

		return resultado;
	}
	
	/* método para calculo da função derivada, retornando o seu resultado */
	static double funcderiv(double j) {
		double resultado = 0;
		/* resultado nesse caso é a soma da operação: ultima data de deposito subtraindo a data da posição atual, multiplicada
		    pelo deposito e por (1+j) e elevado a ultima data de deposito subtraida a data da posição atual -1, 
		    (mesma operação realizada anteriormente com aplicação da regra do tombo usada para obter a derivada primeira de uma função)
		    isso em um for que incrementa o valor obtido na variavel resultado e assim é repetido até todo o array depositos ser percorrido
		 */
		for (int i=0; i<10; i++) {
			resultado += (datas[10] - datas[i]) * depositos[i] * Math.pow(1+j, (datas[10] - datas[i])-1);
		}
		double saldo_final = depositos[10];

		return resultado;
	}
	
	/* método calculo do juros segundo Newton-Raphson	*/
	static double newton(double epsilon) {
		/* tratamento de caso para quando epsilon for menor ou igual a zero ou maior ou igual a 1 */
		if(epsilon <= 0 || epsilon >= 1) {
			return -1;
		}
		/* valores de juros sendo, jk_antes o valor aproximado do juros na iteracao anterior e jk_pos a aproximacao atual que está sendo inicializada com 0.5 */
		double jk_antes = 0;
		double jk_pos = 0.5;

		/* laço que calculara o metodo Newton-Raphson */ 
		do {
			/* atribuição do valor de juros antes igual o valor de juros depois, guardando assim a iteracao anterior */ 
			jk_antes = jk_pos;
			/* juros apos será o valor do juros antes subtraindo o resultado da função, dividido pelo resultado da derivada primeira */ 
			jk_pos = jk_antes - funcao(jk_antes)/funcderiv(jk_antes);
		} 
		/* while será executado até que o valor absoluto do juros apos o calculo subtraindo o juros antes do calculo seja maior ou igual ao valor de epsilon passado como parametro */
		while (Math.abs(jk_pos - jk_antes) >= epsilon);		
		return jk_pos;
	}
	
	/* main, usado para testar a aplicação alimentando os arrays (depositos e datas) e chamando o método newton */
	public static void main(String[] args) {
		// depositos realizados
		depositos[0] = 1000;
		depositos[1] = 1200;
		depositos[2] = 100;
		depositos[3] = 1100;
		depositos[4] = 900;
		depositos[5] = 0;
		depositos[6] = 0;
		depositos[7] = 0;
		depositos[8] = 0;
		depositos[9] = 0;
		// saldo total
		depositos[10] = 5000;
		// datas dos depositos
		datas[0] = 3;
		datas[1] = 4;
		datas[2] = 5;
		datas[3] = 7;
		datas[4] = 9;
		// data do ultimo deposito realizado
		datas[10] = 12;
		// imprime o resultado final do programa
		System.out.println("Resultado: " + newton(0.001));
	}
}

