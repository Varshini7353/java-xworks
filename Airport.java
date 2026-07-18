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

airportName=aName;
location=loc;
terminals=terms;
airlineName=aLine;
flightNumber=fNumber;
ticketPrice=tPrice;
international=inational;
contactNumber=number;

isCreated=true;
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
}
}