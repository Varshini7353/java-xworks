class MaxFashionAccountRunner{
	
public static void main(String []args){
	
	
	
 boolean isCreated=MaxFashionAccount.createAccount("varsha","RS","16-03-26","varshini@gmail.com","varsha123",663876987729L);
System.out.println("is account created :"+isCreated);
MaxFashionAccount.getAccountDetails();

}
}