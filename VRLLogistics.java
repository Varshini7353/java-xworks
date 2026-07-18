class VRLLogistics{
static String branchName;
static String location;
static int totalVehicles;
static String managerName;
static String serviceType;
static double deliveryCharge;
static boolean isParcelDelivered;
static long contactNumber;

public static boolean createVRLLogistics(String bName,String loc,int vehicles,String mName,String serType,double dCharge,boolean parcelDelivered,long number){
boolean isCreated=false;

branchName=bName;
location=loc;
totalVehicles=vehicles;
managerName=mName;
serviceType=serType;
deliveryCharge=dCharge;
isParcelDelivered=parcelDelivered;
contactNumber=number;

isCreated=true;
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