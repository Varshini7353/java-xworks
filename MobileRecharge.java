class MobileRecharge{
static String customerName;
static long mobileNumber;
static String operatorName;
static String rechargePlan;
static int validityDays;
static double rechargeAmount;
static boolean rechargeSuccessful;
static String paymentMode;

public static boolean createMobileRecharge(String cName,long number,String oName,String plan,int validDays,
double rAmount,boolean rSuccesful,String payMode){
boolean isCreated=false;

boolean iscustomerNameValid=false;
boolean ismobileNumberValid=false;
boolean isoperatorNameValid=false;
boolean isrechargePlanValid=false;
boolean isvalidityDaysValid=false;
boolean isrechargeAmountValid=false;
boolean isrechargeSuccessfulValid=false;
boolean ispaymentModeValid=false;


if(cName!=null){
	customerName=cName;
	iscustomerNameValid=true;
}else System.out.println("Invalid customer Name");

if(number!=0){
	mobileNumber=number;
	ismobileNumberValid=true;
}else System.out.println("Invalid contact Number");

if(oName!=null){
	operatorName=oName;
	isoperatorNameValid=true;
}else System.out.println("Invalid operatorName");

if(plan!=null){
	rechargePlan=plan;
	isrechargePlanValid=true;
}else System.out.println("Invalid rechargePlan");

if(validDays!=0){
	validityDays=validDays;
	isvalidityDaysValid=true;
}else System.out.println("Invalid validityDays");

if(rAmount!=0.0){
	rechargeAmount=rAmount;
	isrechargeAmountValid=true;
}else System.out.println("Invalid rechargeAmount");

if(rSuccesful!=false){
	rechargeSuccessful=rSuccesful;
	isrechargeSuccessfulValid=true;
}else System.out.println("Invalid rechargeSuccessful");

if(payMode!=null){
	paymentMode=payMode;
	ispaymentModeValid=true;
}else System.out.println("Invalid paymentMode");


if(iscustomerNameValid==true && ismobileNumberValid==true && isoperatorNameValid==true && isrechargePlanValid==true
&& 	isvalidityDaysValid==true && isrechargeAmountValid==true && isrechargeSuccessfulValid==true && ispaymentModeValid==true){
	

isCreated=true;
}
return isCreated;
}

public static void getMobileRechargeDetails(){
System.out.println("Customer Name:"+customerName);
System.out.println("Mobile Number:"+mobileNumber);
System.out.println("Operator Name:"+operatorName);
System.out.println("Recharge Plan:"+rechargePlan);
System.out.println("Validity Days:"+validityDays);
System.out.println("Recharge Amount:"+rechargeAmount);
System.out.println("Recharge Successful:"+rechargeSuccessful);
System.out.println("Payment Mode:"+paymentMode);
System.out.println("-------------------------------");
}
}
