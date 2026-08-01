class penExecutor{
	
	public static void main(String []args){
		
		
		Pen pen=new Pen();
		pen.brand="Lamy";
		pen.price=230;
		pen.color="Blue";
		
		String brand=pen.brand;
		long price=pen.price;
		String color=pen.color;
		
		System.out.println("The Brand of the pen is:"+brand);
		System.out.println("Price of the pen is:"+price);
		System.out.println("Color of the pen is:"+color);
		
		
		Pen pen1=new Pen();
		pen1.brand="Bal";
		pen1.price=670;
		pen1.color="Black";
		
		String brand1=pen1.brand;
		long price1=pen1.price;
		String color1=pen1.color;
		
		System.out.println("The Brand of the pen is:"+brand1);
		System.out.println("Price of the pen is:"+price1);
		System.out.println("Color of the pen is:"+color1);
		
		
		
		Pen pen2=new Pen();
		pen2.brand="Dooms";
		pen2.price=900;
		pen2.color="Red";
		
		String brand2=pen2.brand;
		long price2=pen2.price;
		String color2=pen2.color;
		
		System.out.println("The Brand of the pen is:"+brand2);
		System.out.println("Price of the of the pen is:"+price2);
		System.out.println("Color of the pen is:"+color2);
		
	}
}