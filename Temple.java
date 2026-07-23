class Temple{
static String templeName;
static String templeLocation;
static int priestsCount;
static String chiefPriest;
static String deityName;
static double donationAmount;
static boolean hasAnnadanam;
static long contactNumber;

public static boolean createTemple(String name,String loc,int pCount,String cPriest,String dName,
double dAmount,boolean annadanam,long number){
boolean isCreated=false;

boolean istempleNameValid=false;
boolean istempleLocationValid=false;
boolean ispriestsCountValid=false;
boolean ischiefPriestValid=false;
boolean isdeityNameValid=false;
boolean isdonationAmountValid=false;
boolean ishasAnnadanamValid=false;
boolean iscontactNumberValid=false;


if(name!=null && !name.isEmpty()){
	templeName=name;
	istempleNameValid=true;
}else System.out.println("Invalid Temple name");

if(loc!=null && !loc.isEmpty()){
	templeLocation=loc;
	istempleLocationValid=true;
}else System.out.println("Invalid templeLocation");

if(pCount!=0){
	priestsCount=pCount;
	ispriestsCountValid=true;
}else System.out.println("Invalid priests Count");

if(cPriest!=null && !cPriest.isEmpty()){
	chiefPriest=cPriest;
	ischiefPriestValid=true;
}else System.out.println("Invalid chief Priest");

if(dName!=null && !dName.isEmpty()){
	deityName=dName;
	isdeityNameValid=true;
}else System.out.println("Invalid deity Name");

if(dAmount!=0.0){
	donationAmount=dAmount;
	isdonationAmountValid=true;
}else System.out.println("Invalid donationAmount");

if(annadanam!=false){
	hasAnnadanam=annadanam;
	ishasAnnadanamValid=true;
}else System.out.println("hasAnnadanam not found");

if(number!=0){
	contactNumber=number;
	iscontactNumberValid=true;
}else System.out.println("Invalid contactNumber");


if(istempleNameValid && istempleLocationValid && ispriestsCountValid && ischiefPriestValid 
&& isdeityNameValid && isdonationAmountValid && ishasAnnadanamValid && iscontactNumberValid){	

isCreated=true;
}

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