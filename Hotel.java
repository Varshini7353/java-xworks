class Hotel{
	
	//instance variables
	int hotelId;
	String hotelName;
	String hotelAddress;
	String ownerName;
	
	Floor floor;
	
	public void getHotelDetails(){
		
		System.out.println("Hotel details started");
		System.out.println("Hotel Id: " + hotelId);
        System.out.println("Hotel Name: " + hotelName);
        System.out.println("Hotel Address: " + hotelAddress);
        System.out.println("Owner Name: " + ownerName);
		System.out.println("Hotel details ended");
		
		floor.getFloordetails();

        
}
}