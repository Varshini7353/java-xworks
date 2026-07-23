class Hotel{
static String hotelName;
static String location;
static int numberofRooms;
static String managerName;
static String roomType;
static double roomPrice;
static boolean hasRestuarant;
static long mobileNumber;

public static boolean createHotel(String hName,String loc,int noofRooms,String mName,
String rType,double rPrice,boolean hRestuarant,long mobile){
boolean isCreated=false;

boolean isHotelNameValid=false;
boolean isLocationValid=false;
boolean isNumberofRoomsValid=false;
boolean isManagerNameValid=false;
boolean isRoomTypeValid=false;
boolean isRoomPriceValid=false;
boolean ishasRestuarantValid=false;
boolean isMobileNumberValid=false;

if(hName!=null && !hName.isEmpty()){
	hotelName=hName;
	isHotelNameValid=true;
}else System.out.println("Invalid hotel name");

if(loc!=null && !loc.isEmpty()){
	location=loc;
	isLocationValid=true;
}else System.out.println("Invalid location");

if(noofRooms!=0){
	numberofRooms=noofRooms;
	isNumberofRoomsValid=true;
}else System.out.println("Invalid No of rooms");

if(mName!=null && !mName.isEmpty()){
	managerName=mName;
	isManagerNameValid=true;
}else System.out.println("Invalid manager name");

if(rType!=null && !rType.isEmpty()){
	roomType=rType;
	isRoomTypeValid=true;
}else System.out.println("Invalid room type");

if(rPrice!=0.0){
	roomPrice=rPrice;
	isRoomPriceValid=true;
}else System.out.println("Invalid room price");

if(hRestuarant!=false){
	hasRestuarant=hRestuarant;
	ishasRestuarantValid=true;
}else System.out.println("Invalid resturant ");

if(mobile!=0){
	mobileNumber=mobile;
	isMobileNumberValid=true;
}else System.out.println("Invalid mobile number");

if(isHotelNameValid && isLocationValid && isNumberofRoomsValid && isManagerNameValid &&
isRoomTypeValid && isRoomPriceValid && ishasRestuarantValid && isMobileNumberValid){
	
isCreated=true;
}
return isCreated;
}
public static void getHotelDetails(){
	
System.out.println("Hotel Name:"+hotelName);
System.out.println("Location:"+location);
System.out.println("Number of rooms:"+numberofRooms);
System.out.println("Manager name:"+managerName); 
System.out.println("Room type:"+roomType);
System.out.println("Room price:"+roomPrice);
System.out.println("hasRestuarant:"+hasRestuarant);
System.out.println("Mobile Number :"+mobileNumber);
System.out.println("------------------------------------");
}
}




