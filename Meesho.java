class Meesho{
public static void createAccount(String name,String email,long phone,
String deliveryadress,int otp,String password){
//logic
System.out.println("create account:");
System.out.println("Name:"+name);
System.out.println("Email Adress:"+email);
System.out.println("phone number:"+phone);
System.out.println("DeliveryAdress:"+deliveryadress);
System.out.println("password:"+password);
}

public static void main(String[] mma){
System.out.println("main started");
//invoking
createAccount("varshini","varsha@123",78964624765L,"madhugiri",87645,"vaehfh");
System.out.println("main ended");
}
}