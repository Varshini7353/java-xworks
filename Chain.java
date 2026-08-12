class Chain{
	
	Chain(String material,String color,String brand,String type,String design,String length,
    double weight,double price,String claspType,boolean waterproof){
		
		
		this.material=material;
		this.color=color;
		this.brand=brand;
		this.type=type;
		this.design=design;
		this.length=length;
		this.weight=weight;
		this.price=price;
		this.claspType=claspType;
		this.waterproof=waterproof;
	}
	//instance variables
	

    String material;
    String color;
    String brand;
    String type;
    String design;
    String length;
    double weight;
    double price;
    String claspType;
    boolean waterproof;
	
	public void getChainDetails(){
		
		System.out.println("material:"+material);
		System.out.println("color:"+color);
		System.out.println("brand:"+brand);
		System.out.println("type:"+type);
		System.out.println("design:"+design);
		System.out.println("length:"+length);
		System.out.println("weight:"+weight);
		System.out.println("price:"+price);
		System.out.println("claspType:"+claspType);
		System.out.println("waterproof:"+waterproof);
		
	}
}
		
		