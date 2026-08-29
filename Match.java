class Match{
	
	String teamName;
	int played;
	int won;
	int lost;
	int points;
	String nrr;
	int last5match[];
	
	public void getMatchInfo(){
		
		
		
		System.out.print(teamName+"         "+played +"           "+won+"        "+lost+"        "+points+"          "+nrr+"      ");
		
		 if (last5match != null) {
            for (int last5 : last5match) {
                System.out.print(last5 + " ");
            }
        }
		System.out.println();
   
    }
}