/* Escreva um m´etodo que, dado um string e um caracter passados como parˆametros,
retorne a posi¸c˜ao da primeira ocorrˆencia do caracter no string, ou -1 caso ele n˜ao esteja
l´a. N˜ao use indexOf da classe String. */
class Ex2{

	static int achaCaracter(String str, String caract) {
		
		if (str.length() > caract.length()){
			for (int i= 0; i < str.length(); i++){
				if (str.charAt(i) == caract.charAt(0)){
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args){
		String a = new String();
		a = "olara";
		String proc = new String();
		proc = "a";
		if (achaCaracter(a, proc) != -1){
			System.out.println("o elemento " + proc + " está na string na posição " + (achaCaracter(a, proc)));
		}
		else System.out.println("não há esse elemento na string");
	}
}