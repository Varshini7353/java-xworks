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
hotelName=hName;
location=loc;
numberofRooms=noofRooms;
managerName=mName;
roomType=rType;
roomPrice=rPrice;
hasRestuarant=hRestuarant;
mobileNumber=mobile;
isCreated=true;
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



