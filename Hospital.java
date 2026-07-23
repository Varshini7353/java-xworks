class Hospital{
static String hospitalName;
static String location;
static int numberofDoctors;
static String chiefDoctor;
static String department;
static double consultationFee;
static boolean hasEmergency;
static long contactNumber;

public static boolean createHospital(String hName,String loc,int noofDoctors,String chiefDoc,String dept,double consultFee,
boolean hasEmerg,long number){ 
boolean isCreated=false;

boolean ishospitalNameValid=false;
boolean islocationValid=false;
boolean isnumberofDoctorsValid=false;
boolean ischiefDoctorValid=false;
boolean isdepartmentValid=false;
boolean isconsultationFeeValid=false;
boolean ishasEmergencyValid=false;
boolean iscontactNumberValid=false;


if(hName!=null && !hName.isEmpty()){
	hospitalName=hName;
	ishospitalNameValid=true;
}else System.out.println("Invalid Hospital Name");

if(loc!=null && !loc.isEmpty()){
	location=loc;
	islocationValid=true;
}else System.out.println("Invalid location");

if(noofDoctors!=0){
	numberofDoctors=noofDoctors;
	isnumberofDoctorsValid=true;
}else System.out.println("Invalid  numberof Doctors");

if(chiefDoc!=null && !chiefDoc.isEmpty()){
	chiefDoctor=chiefDoc;
	ischiefDoctorValid=true;
}else System.out.println("Invalid chief Doctor");

if(dept!=null && !dept.isEmpty()){
	department=dept;
	isdepartmentValid=true;
}else System.out.println("Invalid department");

if(consultFee!=0.0){
	consultationFee=consultFee;
	isconsultationFeeValid=true;
}else System.out.println("Invalid consultationFee");

if(hasEmerg!=false){
	hasEmergency=hasEmerg;
	ishasEmergencyValid=true;
}else System.out.println("Invalid hasEmergency");

if(number!=0){
	contactNumber=number;
	iscontactNumberValid=true;
}else System.out.println("Invalid contact Number");


if(ishospitalNameValid && islocationValid && isnumberofDoctorsValid && ischiefDoctorValid && 
isdepartmentValid && isconsultationFeeValid && ishasEmergencyValid && iscontactNumberValid){
	
isCreated=true;
}

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



