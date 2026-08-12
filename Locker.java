class Locker{
	
	Locker(String brand,String material,String color, String type,String size, String lockType,
    int compartments,double height,double price,boolean fireResistant){
		
		this.brand=brand;
		this.material=material;
		this.color=color;
		this.type=type;
		this.size=size;
		this.lockType=lockType;
		this.compartments=compartments;
		this.price=price;
		this.fireResistant=fireResistant;
		
		
	}
	
	//instance variables

    String brand;
    String material;
    String color;
    String type;
    String size;
    String lockType;
    int compartments;
    double height;
    double price;
    boolean fireResistant;
	
	
	public void getLockerDetails(){
		System.out.println("brand:"+brand);
		System.out.println("material:"+material);
		System.out.println("color:"+color);
		System.out.println("type:"+type);
		System.out.println("size:"+size);
		System.out.println("lockType:"+lockType);
		System.out.println("compartments:"+compartments);
		System.out.println("height:"+height);
		System.out.println("price:"+price);
		System.out.println("fireResistant:"+fireResistant);
	}
}
		
	
	