class Myntra{
public static void createAccount(String fullname,long phone,int otp,String email,
String password,String gender){
//logic
System.out.println("create account:");
System.out.println("Fullaname:"+fullname);
System.out.println("Phone Number:"+phone);
System.out.println("OTP:"+otp);
System.out.println("Email adress:"+email);
System.out.println("password:"+password);
System.out.println("Gender:"+gender);

}
public static void main(String []mm){
System.out.println("main started");
//invoking
createAccount("Varhini",123456789L,23456,"varshhhhhh","varsha@123","female");
System.out.println("main ended");
}
}
