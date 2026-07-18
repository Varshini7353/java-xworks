class MaxFashionAccount{
static String firstName;
static String lastName;
static String dateofBirth;
static String email;
static String password;
static long mobileNumber;

public static boolean createAccount(String firstName,String lName,String dob,String eId,
String pwd,long phone){
boolean isCreated=false;

firstName=firstName;
lastName=lName;
dateofBirth=dob;
email=eId;
password=pwd;
mobileNumber=phone;

isCreated=true;
return isCreated;

}
public static void getAccountDetails(){
System.out.println("First name is:"+firstName);
System.out.println("Last name is:"+lastName);
System.out.println("date of birth:"+dateofBirth);
System.out.println("email :"+email);
System.out.println("password:"+password);
System.out.println("Phone number:"+mobileNumber);
}
}
