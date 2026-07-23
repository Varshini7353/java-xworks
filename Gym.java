class Gym{
static String gymName;
static String location;
static int totalMembers;
static String trainerName;
static String membershipType;
static double monthlyFee;
static boolean hasPersonalTrainer;
static long contactNumber;

public static boolean createGym(String gName,String loc,int tmembers,String tName,
String mType,double Fees,boolean PersonalTrainer,long number){
boolean isCreated=false;

boolean isgymNameValid=false;
boolean islocationValid=false;
boolean istotalMembersValid=false;
boolean istrainerNameValid=false;
boolean ismembershipTypeValid=false;
boolean ismonthlyFeeValid=false;
boolean ishasPersonalTrainerValid=false;
boolean iscontactNumberValid=false;


if(gName!=null && !gName.isEmpty()){
	gymName=gName;
	isgymNameValid=true;
}else System.out.println("Invalid gymName");

if(loc!=null && !loc.isEmpty()){
	location=loc;
	islocationValid=true;
}else System.out.println("Invalid location");

if(tmembers!=0){
	totalMembers=tmembers;
	istotalMembersValid=true;
}else System.out.println("Invalid totalMembers");

if(tName!=null && !tName.isEmpty()){
	trainerName=tName;
	istrainerNameValid=true;
}else System.out.println("Invalid trainerName");

if(mType!=null && !mType.isEmpty()){
	membershipType=mType;
	ismembershipTypeValid=true;
}else System.out.println("Invalid membershipType");

if(Fees!=0.0){
	monthlyFee=Fees;
	ismonthlyFeeValid=true;
}else System.out.println("Invalid monthlyFee");

if(PersonalTrainer!=false){
	hasPersonalTrainer=PersonalTrainer;
	ishasPersonalTrainerValid=true;
}else System.out.println("Invalid hasPersonalTrainer");

if(number!=0){
	contactNumber=number;
	iscontactNumberValid=true;
}else System.out.println("Invalid contactNumber");


if(isgymNameValid && islocationValid && istotalMembersValid && istrainerNameValid 
&& ismembershipTypeValid && ismonthlyFeeValid && ishasPersonalTrainerValid &&
iscontactNumberValid){
	
isCreated=true;
}

return isCreated;
}
public static void getGymDetails()
{
System.out.println("gymName:"+gymName);
System.out.println("Location:"+location);
System.out.println("TotalMembers:"+totalMembers);
System.out.println("TrainerName:"+trainerName);
System.out.println("Membership Type:"+membershipType);
System.out.println("MonthlyFee:"+monthlyFee);
System.out.println("hasPersonalTrainer:"+hasPersonalTrainer);
System.out.println("Contact Number:"+contactNumber);
System.out.println("------------------------------");
}
}

