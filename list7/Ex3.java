/*
*/
class Ex3{
	static int imprime(String palavra) {
		char [] tamanho = palavra.toCharArray();
		for (int i = 0; i<tamanho.length; i++) {
			if (tamanho [i] == ' ') return i;
		}
		return -1;
	}
	public static void main (String [] args) {
		String palavra = new String();
		palavra = "Minha String e assim!";
		System.out.println(imprime (palavra));
	}
}