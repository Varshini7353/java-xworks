class Locket{
	
	Locket(String material,String color,String shape,String design,String brand,String size,
    double price,double weight, String occasion,boolean hasChain){
		
		this.material=material;
		this.color=color;
		this.shape=shape;
		this.design=design;
		this.brand=brand;
		this.size=size;
		this.price=price;
		this.weight=weight;
		this.occasion=occasion;
		this.hasChain=hasChain;
	}

	
	//instance variable
    String material;
    String color;
    String shape;
    String design;
    String brand;
    String size;
    double price;
    double weight;
    String occasion;
    boolean hasChain;



	public void getLocketDetails(){
		System.out.println("Material type:"+material);
		System.out.println("Color:"+color);
		System.out.println("shape:"+shape);
		System.out.println("design:"+design);
		System.out.println("brand:"+brand);
		System.out.println("size:"+size);
		System.out.println("price:"+price);
		System.out.println("weight:"+weight);
		System.out.println("occasion:"+occasion);
		System.out.println("hasChain:"+hasChain);
	}
}
		
		
	
	