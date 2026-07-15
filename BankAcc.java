class BankAcc{
//instance variables
String accountHolder;
double Balance;
//constructor
BankAcc(String accountholder,double balance){
accountHolder=accountholder;
Balance=balance;
}
public static void main(String []args){
//object creation
BankAcc bankaccount=new BankAcc("Varshini R S",9000000.0);
System.out.println("The details of the bank account holder:");
System.out.println("AccountHolder name:"+bankaccount.accountHolder);
System.out.println("Balance:"+bankaccount.Balance);
}
}
