class RTO{
static String applicantName;
static String licenseType;
static int applicantAge;
static String vehicleType;
static String testOfficer;
static double applicationFee;
static boolean isLicenseIssued;
static long mobileNumber;

public static boolean createLicense(String aName,String lType,int appliAge,String vType,String officer,double fee,
boolean isLIssued,long mobile){
boolean isCreated=false;

boolean isapplicantNameValid=false;
boolean islicenseTypeValid=false;
boolean isapplicantAgeValid=false;
boolean isvehicleTypeValid=false;
boolean istestOfficerValid=false;
boolean isapplicationFeeValid=false;
boolean isLicenseIssuedValid=false;
boolean ismobileNumberValid=false;


if(aName!=null && !aName.isEmpty()){
	applicantName=aName;
	isapplicantNameValid=true;
}else System.out.println("Invalid Applicant Name");

if(lType!=null && !lType.isEmpty()){
	licenseType=lType;
	islicenseTypeValid=true;
}else System.out.println("Invalid License type");

if(appliAge!=0){
	applicantAge=appliAge;
	isapplicantAgeValid=true;
}else System.out.println("Invalid Applicant age");

if(vType!=null && vType.isEmpty()){
	vehicleType=vType;
	isvehicleTypeValid=true;
}else System.out.println("Invalid vehicle type");

if(officer!=null && officer.isEmpty()){
	testOfficer=officer;
	istestOfficerValid=true;
}else System.out.println("Invalid test officer name");

if(fee!=0.0){
	applicationFee=fee;
	isapplicationFeeValid=true;
}else System.out.println("Invalid application fee");

if(isLIssued!=false){
	isLicenseIssued=isLIssued;
	isLicenseIssuedValid=true;
}else System.out.println("Invalid License");

if(mobile!=0){
	mobileNumber=mobile;
	ismobileNumberValid=true;
}else System.out.println("Invalid mobilenumber");


if(isapplicantNameValid && islicenseTypeValid && isapplicantAgeValid && isvehicleTypeValid && 
istestOfficerValid && isapplicationFeeValid && isLicenseIssuedValid && ismobileNumberValid){
	
isCreated=true;
}

return isCreated;
}

public static void getLicenseDetails(){
	
System.out.println("Applicant Name:"+applicantName);
System.out.println("License Type:"+licenseType);
System.out.println("Applicant age:"+applicantAge);
System.out.println("Vehicle Type:"+vehicleType);
System.out.println("testOfficer:"+testOfficer);
System.out.println("application Fee:"+applicationFee);
System.out.println("isLicenseIssued:"+isLicenseIssued);
System.out.println("mobileNumber:"+mobileNumber);
System.out.println("------------------------------------");
}
}