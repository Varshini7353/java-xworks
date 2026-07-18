class MobileRecharge{
static String customerName;
static long mobileNumber;
static String operatorName;
static String rechargePlan;
static int validityDays;
static double rechargeAmount;
static boolean rechargeSuccessful;
static String paymentMode;

public static boolean createMobileRecharge(String cName,long number,String oName,String plan,int validDays,double rAmount,boolean rSuccesful,String payMode){
boolean isCreated=false;

customerName=cName;
mobileNumber=number;
operatorName=oName;
rechargePlan=plan;
validityDays=validDays;
rechargeAmount=rAmount;
rechargeSuccessful=rSuccesful;
paymentMode=payMode;

isCreated=true;
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
