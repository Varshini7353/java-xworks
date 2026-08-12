class Sandwich{
	
	Sandwich(int id,String name){
		this.id=id;
		this.name=name;
	}

	
	//instance variables
	int id;
	String name;
	
	public void printSandwichDetails(){
		System.out.println("Sandwich Details are:");
		System.out.println("The id is:"+id);
		System.out.println("The name of the Sandwich is:"+name);
	}
}