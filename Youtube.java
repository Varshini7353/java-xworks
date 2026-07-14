class Youtube{
public static void createAccount(String firstname,String Lastname,String email,
String DOB,long phone,String password){
System.out.println("create account:");
System.out.println("Firstname:"+firstname);
System.out.println("Lastname:"+Lastname);
System.out.println("Email Adress:"+email);
System.out.println("Date of birth:"+DOB);
System.out.println("Phone Number:"+phone);
System.out.println("Password:"+password);
}

public static void main(String []g){
System.out.println("main Started");
//invoking
createAccount("Naveena","B N","naveena@gmail.com","02-09-24",7259490740L,"navee@123");
System.out.println("main ended");
}
}
				  