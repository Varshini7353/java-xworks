class Twitter{
public static void createAccount(String name,String email,String DOB,long phone,
String username,String password){
System.out.println("Create Account:");
System.out.println("Name:"+name);
System.out.println("Email address:"+email);
System.out.println("Date of birth:"+DOB);
System.out.println("Phone number:"+phone);
System.out.println("Username:"+username);
System.out.println("Password:"+password);
}

public static void main(String []x){
System.out.println("Main started");
//invoking
createAccount("Varsha","varsha123","12-03-2004",34567892222L,"varshini","varshhh");
System.out.println("Main ended");
}
}
		   
		   
		   
		   
		   
		   