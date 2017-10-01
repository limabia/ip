/*Escreva um m´etodo que implemente o m´etodo equals da classe String.*/

class Ex1{

	public static void main(String[] args){
		String s = "Meu string";
		String s2 = "Meu string";
		System.out.println(s.equals(s2)); // compara a string s com a string s2 retornando true ou false
		System.out.println(s.length());
		System.out.println(s2.length());
		if(s.length() == s2.length()){
			System.out.println("tamanho das string igual");
		}
	}
}