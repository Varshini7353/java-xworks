class Institute{
static String instituteName;
static String location;
static int totalStudents;
static String principalName;
static String courseOffered;
static double courseFee;
static boolean hasHostelFacility;
static long contactNumber;

public static boolean createInstitute(String iName,String loc,int tStudents,String pName,String coursesOffered,double courseFees,boolean HostelFacility,long number){
boolean isCreated=false;

instituteName=iName;
location=loc;
totalStudents=tStudents;
principalName=pName;
courseOffered=coursesOffered;
courseFee=courseFees;
hasHostelFacility=HostelFacility;
contactNumber=number;
 
isCreated=false;
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