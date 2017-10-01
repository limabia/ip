/*Calcule o valor a ser pago por um aluno de uma academia de gin´astica, sabendo-se que
	ele ter´a desconto de 7% se pagar antecipado. O m´etodo deve receber como entrada qual
	op¸c˜ao pretendida (pagamento normal ou antecipado), o n´umero de horas/aula e o valor
	da hora/aula, retornando ent˜ao o c´alculo.*/

class Ex4_list2{
	static double calculo(boolean antecipado, double valor_hr,int num_aula){
		double valor = 0;
		if(antecipado == true){
			valor = (valor_hr * num_aula) - (0.07 * valor_hr * num_aula);
		}
		else{
			valor = (valor_hr * num_aula);
		}
		return valor;
	}
	public static void main(String[] args){
		System.out.println("O valor a ser pago é de: " + calculo(true, 10.0, 10));
	}
}