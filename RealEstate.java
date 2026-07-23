class RealEstate{
static String propertyName;
static String location;
static int propertyArea;
static String ownerName;
static String propertyType;
static double propertyPrice;
static boolean isAvailable;
static long contactNumber;

public static boolean createRealEstate(String pName,String loc,int pArea,String ownername,String pType,
double pPrice,boolean isavailable,long number){
boolean isCreated=false;

boolean ispropertyNameValid=false;
boolean islocationValid=false;
boolean ispropertyAreaValid=false;
boolean isownerNameValid=false;
boolean ispropertyTypeValid=false;
boolean ispropertyPriceValid=false;
boolean isisAvailableValid=false;
boolean iscontactNumberValid=false;


if(pName!=null){
	propertyName=pName;
	ispropertyNameValid=true;
}else System.out.println("Invalid propertyName");

if(loc!=null){
	location=loc;
	islocationValid=true;
}else System.out.println("Invalid location");

if(pArea!=0){
	propertyArea=pArea;
	ispropertyAreaValid=true;
}else System.out.println("Invalid propertyArea");

if(ownername!=null){
	ownerName=ownername;
	isownerNameValid=true;
}else System.out.println("Invalid ownerName");

if(pType!=null){
	propertyType=pType;
	ispropertyTypeValid=true;
}else System.out.println("Invalid propertyType");

if(pPrice!=0.0){
	propertyPrice=pPrice;
	ispropertyPriceValid=true;
}else System.out.println("Invalid propertyPrice");

if(isavailable!=false){
	isAvailable=isavailable;
	isisAvailableValid=true;
}else System.out.println("Invalid isAvailable");

if(number!=0){
	contactNumber=number;
	iscontactNumberValid=true;
}else System.out.println("Invalid contactNumber");


if(ispropertyNameValid==true && islocationValid==true && ispropertyAreaValid==true && isownerNameValid==true &&
ispropertyTypeValid==true && ispropertyPriceValid==true && isisAvailableValid==true && iscontactNumberValid==true){
	
	
isCreated=true;
}

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
