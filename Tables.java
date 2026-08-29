class Tables{
	
	Seasons season[];
	
	public void getTableInfo(){
		
		for(Seasons seasonArr:season){
		seasonArr.getSeasonInfo();
		}
	}
}