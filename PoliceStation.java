class PoliceStation {
static String stationName;
static String location;
static int totalPolice;
static String inspectorName;
static String caseType;
static double fineAmount;
static boolean complaintRegistered;
static long contactNumber;

public static boolean createPoliceStation(String sName,String loc,int police,String inspector,String cType,double fine,boolean complaint,long mobile){ 
boolean isCreated = false;

stationName = sName;
location = loc;
totalPolice = police;
inspectorName = inspector;
caseType = cType;
fineAmount = fine;
complaintRegistered = complaint;
contactNumber = mobile;

isCreated = true;
return isCreated;
}

public static void getPoliceStationDetails() {
System.out.println("Station Name : " + stationName);
System.out.println("Location : " + location);
System.out.println("Total Police : " + totalPolice);
System.out.println("Inspector Name : " + inspectorName);
System.out.println("Case Type : " + caseType);
System.out.println("Fine Amount : " + fineAmount);
System.out.println("Complaint Registered : " + complaintRegistered);
System.out.println("Contact Number : " + contactNumber);
System.out.println("------------------------------------");
    }
}