/*  Um string ´e pal´ındromo se ele ´e igual tanto lido da esquerda para a direita, quanto
da direita para a esquerda. Por exemplo, ”ovo”e ”osso”s˜ao pal´ındromos. Escreva um
m´etodo que determine se um string ´e pal´ındromo ou n˜ao. */

class Ex4{

	static boolean palindromo(String str){

		String inverso = inverte(str);
		if (inverso.equals(str)){
			return true;
		}
		return false;
	}

	static String inverte (String palavra) {
		char [] inverte = palavra.toCharArray();
		int j = inverte.length - 1; 
		for (int i = 0; i<inverte.length /2; i++) {
			char aux;
			aux = inverte[i];
			inverte[i] = inverte[j];
			inverte[j] = aux;
			j--;
		}
		palavra = String.valueOf(inverte);
		return palavra;
	}

	public static void main (String[] args) {
		String verifica = new String();
		verifica = "arvore";
		System.out.println(palindromo(verifica));
		verifica = "arara";
		System.out.println(palindromo(verifica));
	}
}