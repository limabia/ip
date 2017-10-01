class Ex8{

	Float convert(String number){
		String number2 = number.replaceAll(",", ".");
		float a = Float.parseFloat(number2);
		return a;
	}

	public static void main (String[] args){
		Ex8 ant = new Ex8();
		System.out.println(ant.convert("123,98"));
	}
}