/*******************************************************************/
/** ACH2001 - Introducao a Programacao                            **/
/** EACH-USP - Primeiro Semestre de 2015                          **/
/**                                                               **/
/** Segundo Exercicio-Programa                                    **/
/**                                                               **/
/** <Bianca Lima Santos> <10346811>                               **/
/**                                                               **/
/*******************************************************************/

class Integral {
	/**
		Retorna a área sob a curva definida pela função f, entre os pontos
		a e b, pela regra dos trapézios, aproximando a curva por n trapézios.
		
		O método retorna -1 caso n não seja maior ou igual a 1.
	*/

	/* metodo que realiza o calculo da area aproximada da integral conforme a regra do trapezio e retorna o resultado encontrado */
	static double resolve(Funcao f, double a, double b, int n) {
		if (n < 1){
			return -1;
		}
		else{
			double h = (b-a)/n; 
			double s = (h/2) * (f.valor(a) + f.valor(b) + (2* somatoria(f,a,b,h,n))); /* regra do trapezio */
			return s;
		}
	}
	 

	/* metodo que realiza o calculo de uma somatoria e retorna o resultado encontrado */ 
	static double somatoria(Funcao f,double a, double b, double h, int n) {
		double x = a + h; /* começa em x1 e de acordo com a quantidade de vezes que o desenho foi seccionado é incrementado */
		double somat = 0; /* guarda o valor da somatória começando com zero */
		/* laço para somatória do caso 1 até n.
		a cada passagem pelo laço somat é incrementada com o resultado da func no x selecionado, 
		resultando ao final, na somatoria de todas as passagens */
		for (int i = 1; i<n; i++) { 
			somat += f.valor(x); 
			x += h; /* incrementa ao x o valor de h para que vá a próxima seção do desenho */
		}
		return somat;
	}

}
