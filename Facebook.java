class Facebook{
public static void createAccount(String firstname,String surname,String DOB,
String gender,String email,long mobile,String password){
System.out.println(" Account details are:");
System.out.println("Firstname:"+firstname);
System.out.println("Surname:"+surname);
System.out.println("Date of birth:"+DOB);
System.out.println("Gender:"+gender);
System.out.println("Email address:"+email);
System.out.println("Phone number:"+mobile);
System.out.println("Password:"+password);

}
public static void main(String []aaa){
System.out.println("main Started");
//invoking
createAccount("varshini","RS","16-03-2004","female","varsh@gmail.com",7353047998L,"varsha@123");
System.out.println("main ended");
}
}