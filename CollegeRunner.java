class CollegeRunner{
	
	public static void main(String []args){
		System.out.println("Main started");
		
		Rooms r1=new Rooms();

		r1.roomId=1;
		r1.roomName="CRC 201";
		
		College c1=new College();
		
		c1.collegeId=101;
		c1.collegeName="CIT";
		c1.address="Gubbi";
		c1.noOfStudents=800;
		
		c1.rooms=r1;
		c1.getCollegeDetails();
		System.out.println("Main ended");
		
		
	}
}
