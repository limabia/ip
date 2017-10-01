/*. Escreva uma instru¸c˜ao IF que fa¸ca c receber 0 quando a for estritamente maior que 0 e
	estritamente menor que b. Se este n˜ao for o caso, n˜ao mude c. O modo matem´atico de
	escrever essa condi¸c˜ao ´e: 0 < a < b.*/
class Ex2_list2{
	public static void main(String[] args) {
		int c = 1;
		int b = 2;
		if (c>0 && c>b ){
			c = 0;
			System.out.println("mudou " + c);
		}
		else{
			System.out.println("manteve " + c);
		}
		
		int d = 9; 
		if (d < 4 || d > 10){
			System.out.println("fora");
		}
	}
}