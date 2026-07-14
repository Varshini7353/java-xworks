class Instagram{
  public static void createAccount(String email,long mobile,String password,
  String DOB,String name,String username){
  System.out.println("Account Details are:");
  System.out.println(" Email is:"+email);
  System.out.println(" Mobile number is:"+mobile);
  System.out.println(" Password:"+password);
  System.out.println("Date of birth:"+DOB);
  System.out.println(" Name :"+name);
  System.out.println(" Username:"+username);
  

  }
  public static void main(String []args){
  System.out.println("main started");
  //invoking
  createAccount("varshinirs@gmail.com",2345667788L,"varsha@123","12-01-2003",
  "varshini","varsha");
  System.out.println("main ended");
  }
  }
  
  
  