class Core2Web{
	public static void main(String[] args){
		int a=1;
		int b=6;
		int c=9;
		
		if((a*a == b*b+c*c) || (b*b == a*a+c*c) || (c*c == b*b+a*a))
			System.out.println("it is a Pythagorean triplet");
		
		else
			System.out.println("it is not a Pythagorean triplet");
	}
}