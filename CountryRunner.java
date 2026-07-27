class CountryRunner {

    public static void main(String[] args) {

        System.out.println("Main Started");

        String []states=Country.getStates("Philippines");
		
		//for-each
		for(String statesnames:states){
			System.out.println(statesnames);
		}

        System.out.println("Main Ended");
    }
}