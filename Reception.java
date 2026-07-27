class Reception{
	
	public static void book(String patientName,String symptom, String Email,long Mobile){
		
		
		System.out.println("Book started");
		
		Hospital.bookAppointment(patientName, symptom);
		
		System.out.println("Book ended");
		
	}
}
