class Temple{
static String templeName;
static String templeLocation;
static int priestsCount;
static String chiefPriest;
static String deityName;
static double donationAmount;
static boolean hasAnnadanam;
static long contactNumber;

public static boolean createTemple(String name,String loc,int pCount,String cPriest,String dName,double dAmount,boolean annadanam,long number){
boolean isCreated=false;

templeName=name;
templeLocation=loc;
priestsCount=pCount;
chiefPriest=cPriest;
deityName=dName;
donationAmount=dAmount;
hasAnnadanam=annadanam;
contactNumber=number;

isCreated=false;
return isCreated;
}
public static void getTempleDetails(){
System.out.println("Temple Name:"+templeName);
System.out.println("Temple Location:"+templeLocation);
System.out.println("Priest Count:"+priestsCount);
System.out.println("Chief Priest:"+chiefPriest);
System.out.println("Deity Name:"+deityName);
System.out.println("Donation Amount:"+donationAmount);
System.out.println("hasAnnadanam:"+hasAnnadanam);
System.out.println("Contact Number:"+contactNumber);
System.out.println("------------------------------------");
}
}