class WireRunner{
	
	
	public static void main(String []args){
		//copy of wire design
		
		Wire wire=new Wire();
		wire. wireBrand="Havells";
		wire.price=4566.00;
		
		String  wireBrand= wire. wireBrand;
		double price=wire.price;
	
		System.out.println("The WireBarnd name is:"+ wireBrand);
		System.out.println("The price is:"+price);
		
		
		Wire wire1=new Wire();
		wire1.wireBrand="Gm";
		wire1.price=6000.00;
		
		String wireBrand1=wire1.wireBrand;
		double price1=wire1.price;
		
		System.out.println("The WireBrand name is:"+wireBrand1);
		System.out.println("the price is:"+price1);
		
		
		Wire wire2=new Wire();
		wire2.wireBrand="Finolex";
		wire2.price=4500.00;
		
		String wireBrand2=wire2.wireBrand;
		double price2=wire2.price;
		
		System.out.println("The WireBrand name is:"+wireBrand2);
		System.out.println("The price is:"+price2);
	}
}
		

