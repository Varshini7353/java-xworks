class Airport{
static String airportName;
static String location;
static int terminals;
static String airlineName;
static String flightNumber;
static double ticketPrice;
static boolean international;
static long contactNumber;

public static boolean createAirport(String aName,String loc,int terms,String aLine,String fNumber,double tPrice,boolean inational,long number){
boolean isCreated=false;

boolean isAirportNameVaild=false;
boolean islocationValid=false;
boolean isTerminalsValid=false;
boolean isAirlineNameValid=false;
boolean isflightNumberValid=false;
boolean isticketPriceValid=false;
boolean isinternationalValid=false;
boolean iscontactNumberValid=false;

if(aName!=null && !aName.isEmpty()){
	airportName=aName;
	isAirportNameVaild=true;
}else System.out.println("Invalid Airport name");

if(loc!=null && !loc.isEmpty()){
	location=loc;
	islocationValid=true;
}else System.out.println("Invalid location");

if(terms!=0 ){
	terminals=terms;
	isTerminalsValid=true;
}else System.out.println("Invalid Terminals");

if(aLine!=null && !aLine.isEmpty()){
	airlineName=aLine;
	isAirlineNameValid=true;
}else System.out.println("Invalid Airlinesnames");

if(fNumber!=null){
	flightNumber=fNumber;
	isflightNumberValid=true;
}else System.out.println("Invalid Flight number");

if(tPrice!=0.0){
	ticketPrice=tPrice;
	isticketPriceValid=true;
}else System.out.println("Invalid Ticket price");

if(inational!=false){
	international=inational;
	isinternationalValid=true;
}else System.out.println("Invalid international name");

if(number!=0){
	contactNumber=number;
	iscontactNumberValid=true;
}else System.out.println("Invalid contact number");

if(isAirportNameVaild && islocationValid && isTerminalsValid && isAirlineNameValid && 
isflightNumberValid && isticketPriceValid && isinternationalValid && iscontactNumberValid){
		
isCreated=true;
}
return isCreated;
}

public static void getAirportDetails(){
	
System.out.println("Airport name:"+airportName);
System.out.println("Location:"+location);
System.out.println("Airline name:"+airlineName);
System.out.println("Flight number:"+flightNumber);
System.out.println("Ticket Price:"+ticketPrice);
System.out.println("International:"+international);
System.out.println("Contact Number:"+contactNumber);
System.out.println("------------------------------------");
}
}