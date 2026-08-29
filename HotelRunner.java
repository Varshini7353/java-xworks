class HotelRunner {

    public static void main(String[] args) {
		System.out.println("Main started");
		
		Hotel hotel = new Hotel();

        hotel.hotelId = 101;
        hotel.hotelName = "Taj Hotel";
        hotel.hotelAddress = "Bangalore";
        hotel.ownerName = "Rahul";
		

        Floor floor = new Floor();

        floor.floorId = 1;
        floor.floorName = "Ground Floor";
		
		
		Room room=new Room();
		
		room.roomId=1;
		room.roomNo=101;
		room.roomSize="20 msq";
		room.isAcAvailable=true;
		room.price=1000.00;
		
		
		
		floor.room=room;
		hotel.floor=floor;
		hotel.getHotelDetails();

		
		
    }
}