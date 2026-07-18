class AmusementPark{
static String parkName;
static String location;
static int totalRides;
static String managerName;
static String famousRide;
static double entryFee;
static boolean hasWaterPark;
static long contactNumber;

public static boolean createAmusementPark(String pName,String loc,int tRide,String mName,String fRide,double entryFees,boolean WaterPark,long number){
boolean isCreated=false;

parkName=pName;
location=loc;
totalRides=tRide;
managerName=mName;
famousRide=fRide;
entryFee=entryFees;
hasWaterPark=WaterPark;
contactNumber=number;

isCreated=true;
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