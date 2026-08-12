class Specs{
	
	Specs( String brand,String frameMaterial,String frameColor,String frameShape,String lensType,
	String lensColor,String size,double price,double weight,boolean antiGlare){
		
		
		this.brand=brand;
		this.frameMaterial=frameMaterial;
		this.frameColor=frameColor;
		this.frameShape=frameShape;
		this.lensType=lensType;
		this.lensColor=lensColor;
		this.size=size;
		this.price=price;
		this.weight=weight;
		this.antiGlare=antiGlare;
	}
		
	//instance variables 
	
	String brand;
    String frameMaterial;
    String frameColor;
    String frameShape;
    String lensType;
    String lensColor;
    String size;
    double price;
    double weight;
    boolean antiGlare;
	
	public void getSpecsDetails(){
		System.out.println("brand:"+brand);
		System.out.println("frameMaterial:"+frameMaterial);
		System.out.println("frameColor:"+frameColor);
		System.out.println("frameShape:"+frameShape);
		System.out.println("lensType:"+lensType);
		System.out.println("size:"+size);
		System.out.println("price:"+price);
		System.out.println("weight:"+weight);
		System.out.println("antiGlare:"+antiGlare);
	}
}
		