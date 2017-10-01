class Ex11_list1 {

	static int a,b,c;
	
	static void P(int x, int y) {
		a = x+y+a; // a está declarada de maneira global e por isso usasse seu valor inicial = 5 
		System.out.println(x+" "+y+" "+a);
	}
	public static void main(String[] args) {
		a = 5;
		b = 8;
		c = 3;
		P(a,b); 
		P(7,a+b+c);
		P(a*b,a%b);
	}
}



