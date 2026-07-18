class RealEstate{
static String propertyName;
static String location;
static int propertyArea;
static String ownerName;
static String propertyType;
static double propertyPrice;
static boolean isAvailable;
static long contactNumber;

public static boolean createRealEstate(String pName,String loc,int pArea,String ownername,String pType,double pPrice,boolean isavailable,long number){
boolean isCreated=false;

propertyName=pName;
location=loc;
propertyArea=pArea;
ownerName=ownername;
propertyType=pType;
propertyPrice=pPrice;
isAvailable=isavailable;
contactNumber=number;

isCreated=true;
return isCreated;
}
public static void getRealEstateDetails(){
System.out.println("Property Name:"+propertyName);
System.out.println("Location:"+location);
System.out.println("Property Area:"+propertyArea);
System.out.println("Owner Name:"+ownerName);
System.out.println("Property Type:"+propertyType);
System.out.println("isAvailable:"+isAvailable);
System.out.println("Contact Number:"+contactNumber);
System.out.println("---------------------------------");
}
}
