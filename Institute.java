class Institute{
static String instituteName;
static String location;
static int totalStudents;
static String principalName;
static String courseOffered;
static double courseFee;
static boolean hasHostelFacility;
static long contactNumber;

public static boolean createInstitute(String iName,String loc,int tStudents,String pName,String coursesOffered,
double courseFees,boolean HostelFacility,long number){
boolean isCreated=false;

boolean isinstituteNameValid=false;
boolean islocationValid=false;
boolean istotalStudentsValid=false;
boolean isprincipalNameValid=false;
boolean iscourseOfferedValid=false;
boolean iscourseFeeValid=false;
boolean ishasHostelFacilityValid=false;
boolean iscontactNumberValid=false;

if(iName!=null){
	instituteName=iName;
	isinstituteNameValid=true;
}else System.out.println("Invalid instituteName");

if(loc!=null){
	location=loc;
	islocationValid=true;
}else System.out.println("Invalid location");

if(tStudents!=0){
	totalStudents=tStudents;
	istotalStudentsValid=true;
}else System.out.println("Invalid totalStudents");

if(pName!=null){
	principalName=pName;
	isprincipalNameValid=true;
}else System.out.println("Invalid principalName");

if(coursesOffered!=null){
	courseOffered=coursesOffered;
	iscourseOfferedValid=true;
}else System.out.println("Invalid courseOffered");

if(courseFees!=0.0){
	courseFee=courseFees;
	iscourseFeeValid=true;
}else System.out.println("Invalid courseFee");

if(HostelFacility!=false){
	hasHostelFacility=HostelFacility;
	ishasHostelFacilityValid=true;
}else System.out.println("Invalid hasHostelFacility");

if(number!=0){
	contactNumber=number;
	iscontactNumberValid=true;
}else System.out.println("Invalid contactNumber");


if(isinstituteNameValid==true && islocationValid==true && istotalStudentsValid==true && isprincipalNameValid==true 
&& iscourseOfferedValid==true && iscourseFeeValid==true && ishasHostelFacilityValid==true && iscontactNumberValid==true){
	
isCreated=true;
}

return isCreated;
}
public static void getInstituteDetails(){
	
System.out.println("Institute Name:"+instituteName);
System.out.println("Location:"+location);
System.out.println("Total Students:"+totalStudents);
System.out.println("Principal Name:"+principalName);
System.out.println("Course Offered:"+courseOffered);
System.out.println("CourseFee:"+courseFee);
System.out.println("hasHostel Facility:"+hasHostelFacility);
System.out.println("Contact Number:"+contactNumber);
System.out.println("-----------------------------");
}
}