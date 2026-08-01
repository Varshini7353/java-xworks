class CarRunner{
	
	public static void main(String []args){
		
		Car car=new Car();
		car.brand="Benz";
		car.model="x5";
		car.price=450000.00;
		car.color="Black";
		
		String brand=car.brand;
		String model=car.model;
		double price=car.price;
		String color=car.color;
		
		System.out.println("Car brand is:"+brand);
		System.out.println("Model of the car is:"+model);
		System.out.println("Price of the car :"+price);
		System.out.println("Color of the car is:"+color);
		
		
		Car car1=new Car();
		car1.brand="BMW";
		car1.model="S5";
		car1.price=1400000.00;
		car1.color="Silver";
		
		String brand1=car1.brand;
		String model1=car1.model;
		double price1=car1.price;
		String color1=car1.color;
		
		System.out.println("Car brand is:"+brand1);
		System.out.println("Model of the car is:"+model1);
		System.out.println("Price of the car is:"+price1);
		System.out.println("Color of the car is:"+color1);
		
		
		Car car2=new Car();
		car2.brand="Kea";
		car2.model="S2";
		car2.price=6700000.00;
		car2.color="White";
		
		String brand2=car2.brand;
		String model2=car2.model;
		double price2=car2.price;
		String color2=car2.color;
		
		System.out.println("Car Brand is:"+brand2);
		System.out.println("Model od the car is:"+model2);
		System.out.println("Price of the car is :"+price2);
		System.out.println("Color of the car is:"+color2);
	}
}
		
		