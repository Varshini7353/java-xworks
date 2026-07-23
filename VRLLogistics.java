class VRLLogistics{
static String branchName;
static String location;
static int totalVehicles;
static String managerName;
static String serviceType;
static double deliveryCharge;
static boolean isParcelDelivered;
static long contactNumber;

public static boolean createVRLLogistics(String bName,String loc,int vehicles,String mName,String serType,
double dCharge,boolean parcelDelivered,long number){
boolean isCreated=false;

boolean isbranchNameValid=false;
boolean islocationvalid=false;
boolean istotalVehiclesValid=false;
boolean ismanagerNameValid=false;
boolean isserviceTypeValid=false;
boolean isdeliveryChargeValid=false;
boolean isisParcelDeliveredValid=false;
boolean iscontactNumberValid=false;


if(bName!=null && !bName.isEmpty()){
	branchName=bName;
	isbranchNameValid=true;
}else System.out.println("Invalid Branch Name");

if(loc!=null && !loc.isEmpty()){
	location=loc;
	islocationvalid=true;
}else System.out.println("Invalid location");

if(vehicles!=0){
	totalVehicles=vehicles;
	istotalVehiclesValid=true;
}else System.out.println("Invalid total Vehicles");

if(mName!=null && !mName.isEmpty()){
	managerName=mName;
	ismanagerNameValid=true;
}else System.out.println("Invalid managerName");

if(serType!=null && !serType.isEmpty()){
	serviceType=serType;
	isserviceTypeValid=true;
}else System.out.println("Invalid serviceType");

if(dCharge!=0.0){
	deliveryCharge=dCharge;
	isdeliveryChargeValid=true;
}else System.out.println("Invalid deliveryCharge");

if(parcelDelivered !=false){
	isParcelDelivered=parcelDelivered;
	isisParcelDeliveredValid=true;
}else System.out.println("Invalid isParcel Delivered");

if(number!=0){
	contactNumber=number;
	iscontactNumberValid=true;
}else System.out.println("Inavild contactNumber");


if(	isbranchNameValid && islocationvalid && istotalVehiclesValid && ismanagerNameValid 
&& isserviceTypeValid && isdeliveryChargeValid && isisParcelDeliveredValid && iscontactNumberValid){

isCreated=true;
}

return isCreated;
}
public static void getVRLLogisticsDetails(){
	
System.out.println("Branch Name:"+branchName);
System.out.println("location:"+location);
System.out.println("Total vehicles:"+totalVehicles);
System.out.println("manager Name:"+managerName);
System.out.println("Service Type:"+serviceType);
System.out.println("Delivery Charge:"+deliveryCharge);
System.out.println("Parcel Delivered:"+isParcelDelivered);
System.out.println("conatact Number:"+contactNumber);
System.out.println("------------------------------------");
}
}