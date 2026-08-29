class Floor{
	
	int floorId;
	String floorName;
	
	Room room;
	
	public void getFloordetails(){
		
		System.out.println("Floor Details started");
        System.out.println("Floor Id: " + floorId);
        System.out.println("Floor Name: " + floorName);
		System.out.println("Floor Details ended");
		
		room.getRoomDetails();
}
}