class AmusementPark{
static String parkName;
static String location;
static int totalRides;
static String managerName;
static String famousRide;
static double entryFee;
static boolean hasWaterPark;
static long contactNumber;

public static boolean createAmusementPark(String pName,String loc,int tRide,String mName,String fRide,
double entryFees,boolean WaterPark,long number){
boolean isCreated=false;

boolean isparkNameValid=false;
boolean islocationValid=false;
boolean istotalRidesValid=false;
boolean ismanagerNameValid=false;
boolean isfamousRideValid=false;
boolean isentryFeeValid=false;
boolean ishasWaterParkValid=false;
boolean iscontactNumberValid=false;


if(pName!=null){
	parkName=pName;
	isparkNameValid=true;
}else System.out.println("Invalid parkName");

if(loc!=null){
	location=loc;
	islocationValid=true;
}else System.out.println("Invalid location");

if(tRide!=0){
	totalRides=tRide;
	istotalRidesValid=true;
}else System.out.println("Invalid totalRides");

if(mName!=null){
	managerName=mName;
	ismanagerNameValid=true;
}else System.out.println("Invalid managerName");

if(fRide!=null){
	famousRide=fRide;
	isfamousRideValid=true;
}else System.out.println("Invalid famousRide");

if(entryFees!=0.0){
	entryFee=entryFees;
	isentryFeeValid=true;
}else System.out.println("Invalid entryFee");

if(WaterPark!=false){
	hasWaterPark=WaterPark;
	ishasWaterParkValid=true;
}else System.out.println("Invalid hasWaterPark");

if(number!=0){
	contactNumber=number;
	ishasWaterParkValid=true;
}else System.out.println("Invalid hasWaterPark");


if(isparkNameValid==true && islocationValid==true && istotalRidesValid==true && ismanagerNameValid==true && 
isfamousRideValid==true && isentryFeeValid==true && isentryFeeValid==true && ishasWaterParkValid==true &&
iscontactNumberValid==true){ 
		
isCreated=true;
}

return isCreated;
}
public static void getAmusementParkDetails(){
	
System.out.println("Park Name:"+parkName);
System.out.println("Location:"+location);
System.out.println("Total Rides:"+totalRides);
System.out.println("Manager Name:"+managerName);
System.out.println("Famous Ride:"+famousRide);
System.out.println("EntryFee:"+entryFee);
System.out.println("hasWaterPark:"+hasWaterPark);
System.out.println("Contact Number:"+contactNumber);
System.out.println("---------------------------------");
}
}