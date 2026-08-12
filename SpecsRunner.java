class SpecsRunner{
	
	public static void main(String []args){
		
		Specs s1=new Specs("Ray-Ban", "Metal", "Black", "Round", "Blue Cut", "Transparent",
		"Medium", 3500, 25.5, true);
		s1.getSpecsDetails();
		System.out.println("-----------------------");
		
		Specs s2=new Specs("Titan Eyeplus", "Plastic", "Blue", "Rectangle", "Anti-Reflective", 
		"Transparent", "Large", 2800, 22.0, true);
		s2.getSpecsDetails();
		System.out.println("-----------------------");
		
		Specs s3=new Specs("Fastrack", "Acetate", "Brown", "Cat Eye", "UV Protection", 
		"Transparent", "Small", 2200, 20.5, false);
		s3.getSpecsDetails();
	}
}
		
		
		
