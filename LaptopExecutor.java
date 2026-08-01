class LaptopExecutor{
	
	public static void main(String []args){
		
		
		Laptop laptop=new Laptop();
		laptop.brand="HP";
		laptop.processor="Intel I5";
		laptop.ram=16;
		laptop.price=65000.00;
		
		String brand=laptop.brand;
		String processor=laptop.processor;
		int ram=laptop.ram;
		double price=laptop.price;
		
		System.out.println("Laptop brand is:"+brand);
		System.out.println("Processor:"+processor);
		System.out.println("Ram of the laptop :"+ram);
		System.out.println("Price:"+price);
		
		
		Laptop laptop1=new Laptop();
		laptop1.brand="Dell";
		laptop1.processor="Intel I7";
		laptop1.ram=28;
		laptop1.price=80000.00;
		
		String brand1=laptop1.brand;
		String processor1=laptop1.processor;
		int ram1=laptop1.ram;
		double price1=laptop1.price;
		
		System.out.println("Laptop brand is:"+brand1);
		System.out.println("Processor:"+processor1);
		System.out.println("Ram of the laptop :"+ram1);
		System.out.println("Price:"+price1);
		
		
		Laptop laptop2=new Laptop();
		laptop2.brand="Lenova";
		laptop2.processor="Amd Ryzen";
		laptop2.ram=32;
		laptop2.price=78000.00;
		
		String brand2=laptop2.brand;
		String processor2=laptop2.processor;
		int ram2=laptop2.ram;
		double price2=laptop2.price;
		
		System.out.println("Laptop brand is:"+brand2);
		System.out.println("Processor:"+processor2);
		System.out.println("Ram of the laptop :"+ram2);
		System.out.println("Price:"+price2);
		
		
		
	}
}