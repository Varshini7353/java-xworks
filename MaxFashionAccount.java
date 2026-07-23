class MaxFashionAccount{
static String firstName;
static String lastName;
static String dateofBirth;
static String email;
static String password;
static long mobileNumber;

public static boolean createAccount(String fName,String lName,String dob,String eId,
String pwd,long phone){
boolean isCreated=false;

boolean isFirstNameValid=false;
boolean isLastNameValid=false;
boolean isDateofBirthValid=false;
boolean isEmailValid=false;
boolean isPasswordValid=false;
boolean isMobileNumberValid=false;

if(fName!=null && !fName.isEmpty()){
	firstName=fName;
	isFirstNameValid=true;
}else System.out.println("Inavalid First name");

if(lName!=null && !lName.isEmpty()){
	lastName=lName;
	isLastNameValid=true;
}else System.out.println("Invalid last name");

if(dob!=null && !dob.isEmpty()){
	dateofBirth=dob;
	isDateofBirthValid=true;
}else System.out.println("Invalid Date of birth");

if(eId!=null && !eId.isEmpty()){
	email=eId;
	isEmailValid=true;
}else System.out.println("Invalid email");

if(pwd!=null && !pwd.isEmpty()){
	password=pwd;
	isPasswordValid=true;
}else System.out.println("Invalid Password");

if(phone!=0 && phone>0){
	mobileNumber=phone;
	isMobileNumberValid=true;
}else System.out.println("Invalid MobileNumber");


if(isFirstNameValid && isLastNameValid && isDateofBirthValid && isEmailValid && 
isPasswordValid && isMobileNumberValid){
	isCreated=true;
}
return isCreated;

}
	 
	 public static void getMaxFashionAccount() {
	 
	
	System.out.println("The First Name is " + firstName);
    System.out.println("The Last Name is " + lastName);
    System.out.println("Date of Birth is " + dateofBirth);
    System.out.println("Email is " + email);
    System.out.println("The Password is " + password);
	System.out.println("Phone Number is " + mobileNumber);
	 }
}