class Airport{
	
	//instance variables
	int airportId;
	String airportName;
	String cityName;
	String location;
	
	//custom variables
	Terminal terminal;
	
	
	public void getAirportDetails(){
		
		System.out.println("Airport id:"+airportId);
		System.out.println("Airport Name:"+airportName);
		System.out.println("City name:"+cityName);
		System.out.println("Location:"+location);
		
		terminal.getTerminalDetails();
		
		
	}
}
