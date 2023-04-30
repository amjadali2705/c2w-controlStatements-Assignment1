class Core2Web{
	public static void main(String[] args){
		int sellingPrice=1200;
		int costPrice=1000;
		int profit=sellingPrice-costPrice;
		int loss=costPrice-sellingPrice;
		if(sellingPrice>costPrice)
			System.out.println("profit of "+profit);
		else if(sellingPrice<costPrice)
			System.out.println("loss of "+loss);
		else
			System.out.println("No profit no loss");
	}
}