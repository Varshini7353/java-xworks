class BankAccount{
long AccNo;
String Name;
int Balance;
String Branch;
String Adress;
long IFSC;
public static void main(String [] args){
BankAccount Account=new BankAccount();

Account.AccNo=123456789L;
Account.Name="Varshini";
Account.Branch="HDFC";
Account.Adress="Tumkur";
Account.IFSC=3456789990997L;
System.out.println("The account detalis are:");
System.out.println("Account number:"+Account.AccNo);
System.out.println("Name:"+Account.Name);
System.out.println("Branch:"+Account.Branch);
System.out.println("Adress:"+Account.Adress);
System.out.println("IFSC:"+Account.IFSC);
}
}

