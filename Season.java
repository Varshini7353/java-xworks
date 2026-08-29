class Season{
	
	int seasonYear;
	Teams teams[];

	
	public void getSeasonInfo(){
		
		System.out.println("seasonYear:"+seasonYear);
		System.out.println("Team    M    W    L    NRR       Pts    Last 5");
		
		for (Teams teamsarr : teams) {
            teamsarr.getTeamInfo();
		}
		
		 
	}
}