class MobileApp{
	
	public static void register(String patientName,String symptom,String Email,long Mobile){
		
		
		System.out.println("Register started");
		
		Reception.book(patientName,symptom,Email,Mobile);
		
		System.out.println("Register ended");
	}
}