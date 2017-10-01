/*Escreva um m´etodo que receba um inteiro de 3 digitos como parametro, retornando seu inverso. Por exemplo, inv(332) = 233}*/
class Ex10_list1{
	static String inverso(Integer numero){
		String num_str = numero.toString();
		String num_inv = "";
		for (int i=num_str.length(); i > 0; i--) {
			num_inv += num_str.substring(i - 1, i);
		}
		return num_inv;
	}
	public static void main(String[] args) {
		Integer numero = new Integer(12345);
		System.out.println("O valor recebido é: "+ numero +" e invertido é: " + inverso(numero));
	}

}