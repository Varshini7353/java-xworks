class Seasons{
	
	int seasonYear;
	
	Match match[];
	
	public void getSeasonInfo(){
		
		System.out.println("Season year:"+seasonYear);
		
		if (seasonYear >= 2015) {
			System.out.println("Team       Played       Won     Lost      Points       NRR        Last 5 matches");
		}else {
			System.out.println("Team       Played       Won     Lost      Points       NRR");
		}
		
		
		for(Match matcharr:match){
		matcharr.getMatchInfo();
	}
	
	
	System.out.println("-------------------------------------------------------------------");
}
}