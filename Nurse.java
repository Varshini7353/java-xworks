class Nurse{
	
	
	public static void basicCheck(String patientName,String symptom,boolean isBp,boolean isSugar){
		
		
		System.out.println("basicCheck Started");
		
		Doctor.treat(patientName,symptom);
		
		System.out.println("basicCheck Ended");
	}
}
