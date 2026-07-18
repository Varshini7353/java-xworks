class Hospital{
static String hospitalName;
static String location;
static int numberofDoctors;
static String chiefDoctor;
static String department;
static double consultationFee;
static boolean hasEmergency;
static long contactNumber;

public static boolean createHospital(String hName,String loc,int noofDoctors,String chiefDoc,String dept,double consultFee,boolean hasEmerg,long number){ 

boolean isCreated=false;
hospitalName=hName;
location=loc;
numberofDoctors=noofDoctors;
chiefDoctor=chiefDoc;
department=dept;
consultationFee=consultFee;
hasEmergency=hasEmerg;
contactNumber=number;

isCreated=true;
return isCreated;
}
public static void getHospitalDetails(){
System.out.println("Hospital Name:"+hospitalName);
System.out.println("Location:"+location);
System.out.println("Number of Doctors:"+numberofDoctors);
System.out.println("chief doctor:"+chiefDoctor);
System.out.println("Department:"+department);
System.out.println("consltation Fees:"+consultationFee);
System.out.println("ha Emergency:"+hasEmergency);
System.out.println("contact Number:"+contactNumber);
System.out.println("------------------------------------");
}
}



