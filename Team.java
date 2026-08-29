class Team {
	
	
	int teamId;
	String teamName;
    Calendar calendar;
	
	public void getTeaminfo(){
		
		System.out.println("Team info started");
		System.out.println("TeamId:"+teamId);
		System.out.println("TeamName:"+teamName);
		
		calendar.getCalendarInfo();
	}
	
	
}