class Room{
	
	int roomId;
	int roomNo;
	String roomSize;
	boolean isAcAvailable;
	double price;
	
	
	public void getRoomDetails(){
		
		System.out.println("Room details started");
		System.out.println("Room id:"+roomId);
		System.out.println("Room no:"+roomNo);
		System.out.println("Room size:"+roomSize);
		System.out.println("isAcAvailable:"+isAcAvailable);
		System.out.println("price:"+price);
	}
}