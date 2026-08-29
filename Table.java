class Table{
	
	
	Season seasons[];
	
	public void getTableInfo(){
		
		for(Season season  : seasons){
			
			season.getSeasonInfo();
			
		}
	}
	
}