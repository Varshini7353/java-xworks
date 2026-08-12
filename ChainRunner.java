class ChainRunner{
	
	public static void main(String[] chai){
		
		
		Chain c1=new Chain("Gold", "Golden", "Tanishq", "Neck Chain", "Traditional", "20 inches",
		15.5, 45000, "Lobster Clasp", true);
		c1.getChainDetails();
		System.out.println("------------------------");
		
		
		Chain c2=new Chain("Silver", "Silver", "Malabar Gold", "Daily Wear", "Simple", "18 inches",
		10.2, 8500, "Spring Ring", true);
		c2.getChainDetails();
		System.out.println("------------------------");
		
		
		Chain c3=new Chain("Platinum", "White", "CaratLane", "Pendant Chain", "Minimalist", "22 inches", 
		12.8, 55000, "Lobster Clasp", false);
		c3.getChainDetails();
	}
}

		
		
		
		