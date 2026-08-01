class GarlicRunner{
	
	public static void main(String []args){
		
		Garlic garlic=new Garlic();
		garlic.nameId="Organic Garlic";
		garlic.priceId=120;
		garlic.weightId="500 grams";
		garlic.colorId="White";
		garlic.originId="Karnataka";
		
		String nameId=garlic.nameId;
		int priceId=garlic.priceId;
		String weightId=garlic.weightId;
		String colorId=garlic.colorId;
		String originId=garlic.originId;
		
		System.out.println("Name :"+nameId);
		System.out.println("Price:"+priceId);
		System.out.println("Weight:"+weightId);
		System.out.println("Color:"+colorId);
		System.out.println("Origin:"+originId);
		System.out.println("\n");
		
		
		
		Garlic garlic1=new Garlic();
		garlic1.nameId="Aged Garlic";
		garlic1.priceId=180;
		garlic1.weightId="1000 grams";
		garlic1.colorId="Off white";
		garlic1.originId="Madhya Pradesh";
		
		String nameId1=garlic1.nameId;
		int priceId1=garlic1.priceId;
		String weightId1=garlic1.weightId;
		String colorId1=garlic1.colorId;
		String originId1=garlic1.originId;
		
		System.out.println("Name:"+nameId1);
		System.out.println("Price:"+priceId1);
		System.out.println("Weight:"+weightId1);
		System.out.println("Color:"+colorId1);
		System.out.println("Origin:"+originId1);
		System.out.println("\n");
		
		Garlic garlic2=new Garlic();
		garlic2.nameId="Premium Garlic";
		garlic2.priceId=220;
		garlic2.weightId="750 grams";
		garlic2.colorId="White";
		garlic2.originId="Maharastra";
		
		String nameId2=garlic2.nameId;
		int priceId2=garlic2.priceId;
		String weightId2=garlic2.weightId;
		String colorId2=garlic2.colorId;
		String originId2=garlic2.originId;
		
		System.out.println("Name:"+nameId2);
		System.out.println("Price:"+priceId2);
		System.out.println("Weight:"+weightId2);
		System.out.println("Color:"+colorId2);
		System.out.println("Origin:"+originId2);
	}
}
		