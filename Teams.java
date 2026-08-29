class Teams{
	
	String name;
	int noOfMatches;
	int won;
	int lost;
	String nrr;
	int points;
	int lastFiveMatches[];
	
	public void getTeamInfo(){
		

    System.out.print(name + "    "+noOfMatches + "    "+won + "    "+lost + "    "+nrr + "    "+points + "    ");
    
    for (int result : lastFiveMatches) {
        System.out.print(result + " ");
		
		
    }
	 System.out.println();

	}
}
