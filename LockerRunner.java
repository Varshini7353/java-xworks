class LockerRunner{
	
	public static void main(String []args){
		
		Locker l1=new Locker("Godrej", "Steel", "Grey", "Home Locker", "Large", "Digital Lock", 
		6, 60.5, 25000, true);
		l1.getLockerDetails();
		System.out.println("---------------------------");
		
		
		Locker l2=new Locker("Yale", "Steel", "Black", "Office Locker", "Medium", "Electronic Lock",
		4, 45.0, 18000, true);
		l2.getLockerDetails();
		System.out.println("--------------------------");
		
		Locker l3=new Locker("Ozone", "Metal", "White", "Personal Locker", "Small", "Key Lock", 
		3, 30.5, 8500, false);
		l3.getLockerDetails();
	}
}
		
		
		