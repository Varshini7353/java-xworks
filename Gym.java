class Gym{
static String gymName;
static String location;
static int totalMembers;
static String trainerName;
static String membershipType;
static double monthlyFee;
static boolean hasPersonalTrainer;
static long contactNumber;

public static boolean createGym(String gName,String loc,int tmembers,String tName,String mType,double Fees,boolean PersonalTrainer,long number){
boolean isCreated=false;

gymName=gName;
location=loc;
totalMembers=tmembers;
trainerName=tName;
membershipType=mType;
monthlyFee=Fees;
hasPersonalTrainer=PersonalTrainer;
contactNumber=number;

isCreated=true;
return isCreated;
}
public static void getGymDetails(){
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

