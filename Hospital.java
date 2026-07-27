class Hospital{
	
	public static void bookAppointment(String patientName,String symptom){
		
		System.out.println("bookAppointment Started");
		
		Nurse.basicCheck(patientName, symptom,true,false);
		
	
		System.out.println("bookAppointment ended");
		
	}
}