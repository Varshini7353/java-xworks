class AxisBankRunner {

    public static void main(String[] args) {

        AxisBank branch1 = new AxisBank();
		
		System.out.println(branch1);
		System.out.println("IFSC Code before intialization: " + branch1.ifscCode);
        System.out.println("MICR Code before intialization: " + branch1.micrCode);
        System.out.println("Bank Name before intialization : " + branch1.bankName);
		System.out.println("Address before intialization: " + branch1.address);
        System.out.println("District before intialization: " + branch1.district);
        System.out.println("State before intialization: " + branch1.state);
        System.out.println("Branch before intialization: " + branch1.branch);
        System.out.println("Phone Number before intialization: " + branch1.phoneNumber);
		
		branch1.bankId=1;
        branch1.ifscCode = "UTIB0003362";
        branch1.micrCode = "MICR not provided";
        branch1.bankName = "Axis Bank";
        branch1.address = "Site No 302, AECS Layout, Bangalore - 560037";
        branch1.district = "Bangalore";
        branch1.state = "Karnataka";
        branch1.branch = "AECS Layout";
        branch1.phoneNumber = 2847584;

		System.out.println("Bank Id:"+branch1.bankId);
        System.out.println("IFSC Code: " + branch1.ifscCode);
        System.out.println("MICR Code: " + branch1.micrCode);
        System.out.println("Bank Name: " + branch1.bankName);
        System.out.println("Address: " + branch1.address);
        System.out.println("District: " + branch1.district);
        System.out.println("State: " + branch1.state);
        System.out.println("Branch: " + branch1.branch);
        System.out.println("Phone Number: " + branch1.phoneNumber);
		System.out.println("----------------------------------");



        AxisBank branch2 = new AxisBank();
		
		System.out.println("IFSC Code before intialization: " + branch1.ifscCode);
        System.out.println("MICR Code before intialization: " + branch1.micrCode);
        System.out.println("Bank Name before intialization : " + branch1.bankName);
		System.out.println("Address before intialization: " + branch1.address);
        System.out.println("District before intialization: " + branch1.district);
        System.out.println("State before intialization: " + branch1.state);
        System.out.println("Branch before intialization: " + branch1.branch);
        System.out.println("Phone Number before intialization: " + branch1.phoneNumber);
		
		System.out.println(branch2);
		branch2.bankId=2;
        branch2.ifscCode = "UTIB0000009";
        branch2.micrCode = "560211002";
        branch2.bankName = "Axis Bank";
        branch2.address = "100 Feet Road, Indiranagar, Bangalore - 560038";
        branch2.district = "Bangalore";
        branch2.state = "Karnataka";
        branch2.branch = "Indiranagar";
        branch2.phoneNumber = 25200011;
		
		System.out.println("Bank Id:"+branch2.bankId);
        System.out.println("IFSC Code: " + branch2.ifscCode);
        System.out.println("MICR Code: " + branch2.micrCode);
        System.out.println("Bank Name: " + branch2.bankName);
        System.out.println("Address: " + branch2.address);
        System.out.println("District: " + branch2.district);
        System.out.println("State: " + branch2.state);
        System.out.println("Branch: " + branch2.branch);
        System.out.println("Phone Number: " + branch2.phoneNumber);
		System.out.println("------------------------------------");
       
	   
	   
        AxisBank branch3 = new AxisBank();
		
		System.out.println(branch3);
		branch3.bankId=3;
		branch3.ifscCode = "UTIB0000056";
		branch3.micrCode = "560211003";
		branch3.bankName = "Axis Bank";
		branch3.address = "Rajajinagar, Bangalore - 560010";
		branch3.district = "Bangalore";
		branch3.state = "Karnataka";
		branch3.branch = "Rajajinagar";
		branch3.phoneNumber = 23325511;
		
		System.out.println("Bank Id:"+branch3.bankId);
		System.out.println("IFSC Code: " + branch3.ifscCode);
		System.out.println("MICR Code: " + branch3.micrCode);
		System.out.println("Bank Name: " + branch3.bankName);
		System.out.println("Address: " + branch3.address);
		System.out.println("District: " + branch3.district);
		System.out.println("State: " + branch3.state);
		System.out.println("Branch: " + branch3.branch);
		System.out.println("Phone Number: " + branch3.phoneNumber);
		System.out.println("------------------------------------");
		


		AxisBank branch4 = new AxisBank();
		
		branch4.bankId=4;
		branch4.ifscCode = "UTIB0000148";
		branch4.micrCode = "560211004";
		branch4.bankName = "Axis Bank";
		branch4.address = "Jayanagar 4th Block, Bangalore - 560011";
		branch4.district = "Bangalore";
		branch4.state = "Karnataka";
		branch4.branch = "Jayanagar";
		branch4.phoneNumber = 26638811;
		
		System.out.println("Bank Id:"+branch4.bankId);
		System.out.println("IFSC Code: " + branch4.ifscCode);
		System.out.println("MICR Code: " + branch4.micrCode);
		System.out.println("Bank Name: " + branch4.bankName);
		System.out.println("Address: " + branch4.address);
		System.out.println("District: " + branch4.district);
		System.out.println("State: " + branch4.state);
		System.out.println("Branch: " + branch4.branch);
		System.out.println("Phone Number: " + branch4.phoneNumber);
		System.out.println("------------------------------------");
		

		AxisBank branch5 = new AxisBank();


		branch5.bankId=5;
		branch5.ifscCode = "UTIB0000468";
		branch5.micrCode = "560211005";
		branch5.bankName = "Axis Bank";
		branch5.address = "Nagarabhavi, Bangalore - 560072";
		branch5.district = "Bangalore";
		branch5.state = "Karnataka";
		branch5.branch = "Nagarabhavi";
		branch5.phoneNumber = 23212244;
		
		
		System.out.println("Bank Id:"+branch5.bankId);
		System.out.println("IFSC Code: " + branch5.ifscCode);
		System.out.println("MICR Code: " + branch5.micrCode);
		System.out.println("Bank Name: " + branch5.bankName);
		System.out.println("Address: " + branch5.address);
		System.out.println("District: " + branch5.district);
		System.out.println("State: " + branch5.state);
		System.out.println("Branch: " + branch5.branch);
		System.out.println("Phone Number: " + branch5.phoneNumber);
		System.out.println("------------------------------------");



		AxisBank branch6 = new AxisBank();
		
		branch6.bankId=6;
		branch6.ifscCode = "UTIB0000227";
		branch6.micrCode = "560211006";
		branch6.bankName = "Axis Bank";
		branch6.address = "Yeshwanthpur, Bangalore - 560022";
		branch6.district = "Bangalore";
		branch6.state = "Karnataka";
		branch6.branch = "Yeshwanthpur";
		branch6.phoneNumber = 23379955;


		System.out.println("Bank Id:"+branch6.bankId);
		System.out.println("IFSC Code: " + branch6.ifscCode);
		System.out.println("MICR Code: " + branch6.micrCode);
		System.out.println("Bank Name: " + branch6.bankName);
		System.out.println("Address: " + branch6.address);
		System.out.println("District: " + branch6.district);
		System.out.println("State: " + branch6.state);
		System.out.println("Branch: " + branch6.branch);
		System.out.println("Phone Number: " + branch6.phoneNumber);
		System.out.println("------------------------------------");
		
		
		
		AxisBank branch7 = new AxisBank();

		branch7.bankId=7;
		branch7.ifscCode = "UTIB0000182";
		branch7.micrCode = "560211007";
		branch7.bankName = "Axis Bank";
		branch7.address = "BTM Layout, Bangalore - 560076";
		branch7.district = "Bangalore";
		branch7.state = "Karnataka";
		branch7.branch = "BTM Layout";
		branch7.phoneNumber = 26684455;
		
		
		System.out.println("Bank Id:"+branch7.bankId);
		System.out.println("IFSC Code: " + branch7.ifscCode);
		System.out.println("MICR Code: " + branch7.micrCode);
		System.out.println("Bank Name: " + branch7.bankName);
		System.out.println("Address: " + branch7.address);
		System.out.println("District: " + branch7.district);
		System.out.println("State: " + branch7.state);
		System.out.println("Branch: " + branch7.branch);
		System.out.println("Phone Number: " + branch7.phoneNumber);
		System.out.println("------------------------------------");
		



		AxisBank branch8 = new AxisBank();
        
		branch8.bankId=8;
		branch8.ifscCode = "UTIB0000678";
		branch8.micrCode = "560211008";
		branch8.bankName = "Axis Bank";
		branch8.address = "Koramangala, Bangalore - 560034";
		branch8.district = "Bangalore";
		branch8.state = "Karnataka";
		branch8.branch = "Koramangala";
		branch8.phoneNumber = 25501122;
		
		System.out.println("Bank Id:"+branch8.bankId);
		System.out.println("IFSC Code: " + branch8.ifscCode);
		System.out.println("MICR Code: " + branch8.micrCode);
		System.out.println("Bank Name: " + branch8.bankName);
		System.out.println("Address: " + branch8.address);
		System.out.println("District: " + branch8.district);
		System.out.println("State: " + branch8.state);
		System.out.println("Branch: " + branch8.branch);
		System.out.println("Phone Number: " + branch8.phoneNumber);
		System.out.println("------------------------------------");
		



		AxisBank branch9 = new AxisBank();
		
		branch9.bankId=9;
		branch9.ifscCode = "UTIB0000912";
		branch9.micrCode = "560211009";
		branch9.bankName = "Axis Bank";
		branch9.address = "Whitefield, Bangalore - 560066";
		branch9.district = "Bangalore";
		branch9.state = "Karnataka";
		branch9.branch = "Whitefield";
		branch9.phoneNumber = 28411022;
		
		System.out.println("Bank Id:"+branch9.bankId);
		System.out.println("IFSC Code: " + branch9.ifscCode);
		System.out.println("MICR Code: " + branch9.micrCode);
		System.out.println("Bank Name: " + branch9.bankName);
		System.out.println("Address: " + branch9.address);
		System.out.println("District: " + branch9.district);
		System.out.println("State: " + branch9.state);
		System.out.println("Branch: " + branch9.branch);
		System.out.println("Phone Number: " + branch9.phoneNumber);
		System.out.println("------------------------------------");
		



		AxisBank branch10 = new AxisBank();
		
		branch10.bankId=10;
		branch10.ifscCode = "UTIB0001025";
		branch10.micrCode = "560211010";
		branch10.bankName = "Axis Bank";
		branch10.address = "Electronic City, Bangalore - 560100";
		branch10.district = "Bangalore";
		branch10.state = "Karnataka";
		branch10.branch = "Electronic City";
		branch10.phoneNumber = 28523344;


		System.out.println("Bank Id:"+branch10.bankId);
		System.out.println("IFSC Code: " + branch10.ifscCode);
		System.out.println("MICR Code: " + branch10.micrCode);
		System.out.println("Bank Name: " + branch10.bankName);
		System.out.println("Address: " + branch10.address);
		System.out.println("District: " + branch10.district);
		System.out.println("State: " + branch10.state);
		System.out.println("Branch: " + branch10.branch);
		System.out.println("Phone Number: " + branch10.phoneNumber);
	}
}
				
