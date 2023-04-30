class Core2Web{
	public static void main(String[] args){
		float temp=8.0f;
		if(temp<10.0f)
			System.out.println("Wear a winter jacket, gloves, and a hat.");
		else if(temp>=10.0f && temp<=20.0f)
			System.out.println("Wear a light jacket and jeans");
		else if(temp>=20.0f && temp<=30.0f)
			System.out.println("Wear shorts and a t-shirt");
		else
			System.out.println("Wear light clothes, like a summer dress or shorts and a tank top");
	}
}