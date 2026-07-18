class RTO{
static String applicantName;
static String licenseType;
static int applicantAge;
static String vehicleType;
static String testOfficer;
static double applicationFee;
static boolean isLicenseIssued;
static long mobileNumber;

public static boolean createLicense(String aName,String lType,int appliAge,String vType,String officer,double fee,boolean isLIssued,long mobile){
boolean isCreated=false;

applicantName=aName;
licenseType=lType;
applicantAge=appliAge;
vehicleType=vType;
testOfficer=officer;
applicationFee=fee;
isLicenseIssued=isLIssued;
mobileNumber=mobile;

isCreated=true;
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