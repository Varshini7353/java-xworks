class College{
	
	//instance variables
	int collegeId;
	String collegeName;
	String address;
	int noOfStudents;
	
	//has a relationship
	Rooms rooms;
	
	//method
	public void getCollegeDetails(){
		
		System.out.println("College details started");
		System.out.println("College id:"+collegeId);
		System.out.println("College name:"+collegeName);
		System.out.println("College Adress:"+address);
		System.out.println("No of students:"+noOfStudents);
		System.out.println("College details ended");
		
		System.out.println("Room details started");
		System.out.println("Room id:"+rooms.roomId);
		System.out.println("Room name:"+rooms.roomName);
		System.out.println("Room details ended");
	}
	
}