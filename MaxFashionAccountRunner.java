class MaxFashionAccountRunner{
	
public static void main(String []args){

boolean isCreated=MaxFashionAccount.createAccount("null","RS","16-03-26",
"varshini@gmail.com","varsha123",663876987729L);
System.out.println("is account created :"+isCreated);
if (isCreated==true){
MaxFashionAccount.getMaxFashionAccount();
}else System.out.println("No Account details found");
}
}
