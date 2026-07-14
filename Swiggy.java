class Swiggy{
  public static void  createAccount(String email,String name,long mobile){
  //logic
  System.out.println("The account details are:");
  System.out.println("Email:"+email);
  System.out.println("name:"+name);
  System.out.println("phone number:"+mobile);
 
}
public static void main(String []args){
	System.out.println("main started");
//invoking method
createAccount("varshinirs@gmail.com","varshini",7259490740L);
System.out.println("main ended");
}
}