class PoliceStation {
static String stationName;
static String location;
static int totalPolice;
static String inspectorName;
static String caseType;
static double fineAmount;
static boolean complaintRegistered;
static long contactNumber;

public static boolean createPoliceStation(String sName,String loc,int police,String inspector,String cType,double fine,
boolean complaint,long mobile){ 
boolean isCreated = false;

boolean isstationNameValid = false;
boolean islocationValid = false;
boolean istotalPoliceValid = false;
boolean isinspectorNameValid = false;
boolean iscaseTypeValid = false;
boolean isfineAmountValid = false;
boolean iscomplaintRegisteredValid = false;
boolean iscontactNumberValid = false;


if(sName!=null && !sName.isEmpty()){
	stationName=sName;
	isstationNameValid=true;
}else System.out.println("Invalid station Name");

if(loc!=null && !loc.isEmpty()){
	location=loc;
	islocationValid=true;
}else System.out.println("Invalid location");

if (police!=0){
	totalPolice=police;
	istotalPoliceValid=true;
}else System.out.println("Invalid totalPolice");

if(inspector!=null && !inspector.isEmpty()){
	inspectorName=inspector;
	isinspectorNameValid=true;
}else System.out.println("Invalid inspectorName");

if(cType!=null && !cType.isEmpty()){
	caseType=cType;
	iscaseTypeValid=true;
}else System.out.println("Invalid caseType");

if(fine!=0.0){
	fineAmount=fine;
	isfineAmountValid=true;
}else System.out.println("Invalid fine Amount");

if(complaint!=false){
	complaintRegistered=complaint;
	iscomplaintRegisteredValid=true;
}else System.out.println(" complaint Registered Failed");

if(mobile!=0){
	contactNumber=mobile;
	iscontactNumberValid=true;
}else System.out.println("Invalid contactNumber");


if(isstationNameValid==true && islocationValid==true &&  istotalPoliceValid==true && isinspectorNameValid==true && 
	iscaseTypeValid==true && isfineAmountValid==true && iscomplaintRegisteredValid==true && iscontactNumberValid==true){
		
isCreated = true;
}
	
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