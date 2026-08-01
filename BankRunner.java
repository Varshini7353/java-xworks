class BankRunner{
	
	public static void main(String []args){
		
		Bank bank=new Bank();
		
		String[] axisBankBranches={"Rajajinagar","Vijayanagar","Mejestic","NagarBhavi","Yashwanthpur"};
		
		String[] axisIfscCodes={"UTIB0001614","UTIB0000560", "UTIB0000065","UTIB0000468","UTIB0000227"};
		
	    bank.bankId=899;
		bank.bankName="Axis Bank";
		bank.branches=axisBankBranches;
		bank.ifscCode=axisIfscCodes;
		bank.location="Banglore";
		bank.address="Aditya Amogh Chambers, 10/116, 1st Block, Dr. Rajkumar Road, Rajajinagar, Bengaluru, Karnataka, 560010";
		

		System.out.println("bank Id:"+bank.bankId);
		System.out.println("bankName:"+bank.bankName);
		System.out.println("Axisbank Branches are:");
		for(String axisBranches:bank.branches){
		System.out.println(axisBranches);
		}
		System.out.println("IFSC codes are:");
		for(String axisIFSC:bank.ifscCode){
		System.out.println(axisIFSC);
		}
		System.out.println("location:"+bank.location);
		System.out.println("address:"+bank.address);
		System.out.println("\n");
		
		
	
		
		Bank bank1=new Bank();
		
		String[] sbiBankBranches={"Peenya","Nelmangala","BTM layout","HSR layout","Malleshwaram"};
		
		String[] sbiIfscCodes={"SBIN0003023", "SBIN0015174","SBIN0010499","SBIN0066550","SBIN9089860"};
		
		
		bank1.bankId=345;
		bank1.bankName="SBI Bank";
		bank1.branches=sbiBankBranches;
		bank1.ifscCode=sbiIfscCodes;
		bank1.location="Banglore";
		bank1.address="10th B Main, Rajajinagar 5th Block, Bengaluru - 560010 (Near Rama Mandir)";
		
		System.out.println("bank Id:"+bank1.bankId);
		System.out.println("bank Name:"+bank1.bankName);
		System.out.println("SBI bank branches:");
		for(String sbibranches:bank1.branches){
		System.out.println(sbibranches);
		}
		System.out.println("SBI Ifsc codes:");
		for(String sbiIFSC:bank1.ifscCode){
		System.out.println(sbiIFSC);
		}
		System.out.println("location:"+bank1.location);
		System.out.println("address:"+bank1.address);
		System.out.println("\n");
		
		


		Bank bank2=new Bank();
		
		String []canaraBankBranches={"Tumkur","Mysusru","Koppal","Kolar","Kodagu"};
		
		String[] canaraIfscCodes={"CNRB0987698","CNRB6637883","CNRB87657690","CNRB76576688","CNRB8986677"};
		
		bank2.bankId=945;
		bank2.bankName="Canara Bank";
		bank2.branches=canaraBankBranches;
		bank2.ifscCode=canaraIfscCodes;
		bank2.location="Karnataka";
		bank2.address="JC Road, Nagarathpet, Bangalore - 560002 (Opposite Putana Chetty Kala Mandir), 4th D Cross, 7th A Main, Kalyan Nagar";
	
		
		System.out.println("bankId:"+bank2.bankId);
		System.out.println("bankName:"+bank2.bankName);
		System.out.println("Canarabank Branches:");
		for(String canaraBranches:bank2.branches){
			System.out.println(canaraBranches);
		}
		System.out.println("IFSC Codes are:");
		for(String canaraIfsc:bank2.ifscCode){
			System.out.println(canaraIfsc);
		}
		System.out.println("location:"+bank2.location);
		System.out.println("address:"+bank2.address);
		
	}
}