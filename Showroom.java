class Showroom{
static String showroomName;
static String location;
static int totalVehicles;
static String managerName;
static String vehicleBrand;
static double vehiclePrice;
static boolean hasFinanceFacility;
static long contactNumber;

public static boolean createShowroom(String sroomName,String loc,int vehicles,String mName,String vBrand,double vPrice,boolean hasfFacility,long number){
boolean isCreated=false;

showroomName=sroomName;
location=loc;
totalVehicles=vehicles;
managerName=mName;
vehicleBrand=vBrand;
vehiclePrice=vPrice;
hasFinanceFacility=hasfFacility;
contactNumber=number;

isCreated=true;
return isCreated;
}
public static void getShowroomDetails(){
System.out.println("Showroom Name:"+showroomName);
System.out.println("Location:"+location);
System.out.println("Total Vehicles:"+totalVehicles);
System.out.println("Manager Name:"+managerName);
System.out.println("Vehicle Brand:"+vehicleBrand);
System.out.println("Vehicle Price:"+vehiclePrice);
System.out.println("hasFinance Facility:"+hasFinanceFacility);
System.out.println("Contact Number:"+contactNumber);
System.out.println("-----------------------------");
}
}