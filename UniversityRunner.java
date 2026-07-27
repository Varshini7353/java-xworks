class UniversityRunner{

    public static void main(String[] args){
		System.out.println("Main Started");
      String []courses=  University.getCoursesByCollegeName("Channabasaveshwara Institute of Technology");
        
		//for-each
		for(String anything:courses){
			System.out.println(anything);
        
    }
	System.out.println("Main Ended");
}
}