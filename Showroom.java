class Showroom{
static String showroomName;
static String location;
static int totalVehicles;
static String managerName;
static String vehicleBrand;
static double vehiclePrice;
static boolean hasFinanceFacility;
static long contactNumber;

public static boolean createShowroom(String sroomName,String loc,int vehicles,String mName,String vBrand,
double vPrice,boolean hasfFacility,long number){
boolean isCreated=false;

boolean isshowroomNameValid=false;
boolean islocationValid=false;
boolean istotalVehiclesValid=false;
boolean ismanagerNameValid=false;
boolean isvehicleBrandValid=false;
boolean isvehiclePriceValid=false;
boolean ishasFinanceFacilityValid=false;
boolean iscontactNumberValid=false;


if(sroomName!=null && !sroomName.isEmpty()){
	showroomName=sroomName;
	isshowroomNameValid=true;
}else System.out.println("Invalid showroom Name");

if(loc!=null && !loc.isEmpty()){
	location=loc;
	islocationValid=true;
}else System.out.println("Invalid location");

if(vehicles!=0){
	totalVehicles=vehicles;
	istotalVehiclesValid=true;
}else System.out.println("Invalid total Vehicles");

if(mName!=null && !mName.isEmpty()){
	managerName=mName;
	ismanagerNameValid=true;
}else System.out.println("Invalid manager Name");

if(vBrand!=null && !vBrand.isEmpty()){
	vehicleBrand=vBrand;
	isvehicleBrandValid=true;
}else System.out.println("Invalid Brang name");

if(vPrice!=0.0){
	vehiclePrice=vPrice;
	isvehiclePriceValid=true;
}else System.out.println("Invalid Vehicle price");

if(hasfFacility!=false){
	hasFinanceFacility=hasfFacility;
	ishasFinanceFacilityValid=true;
}else System.out.println("Invalid hasFinanceFacility");

if(number!=0){
	contactNumber=number;
	iscontactNumberValid=true;
}else System.out.println("Invalid contactNumber");


if(isshowroomNameValid && islocationValid && istotalVehiclesValid && ismanagerNameValid &&
isvehicleBrandValid && isvehiclePriceValid && ishasFinanceFacilityValid && iscontactNumberValid){
	
isCreated=true;
}

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