class LinkedIn{
public static void  createAccount(String firstname,String lastname,String email,
String location,String password){
System.out.println("Create Account:");
System.out.println("Firstname:"+firstname);
System.out.println("Lastname:"+lastname);
System.out.println("Email address:"+email);
System.out.println("Location:"+location);
System.out.println("Password:"+password);

}
public static void main(String[] args){
System.out.println("Main started");
createAccount("Varshini","RS","varshini@gmail.com","Madhugiri","varsha@123");
System.out.println("Main ended");
}
}
		