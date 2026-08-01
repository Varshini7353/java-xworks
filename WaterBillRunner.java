class WaterBillRunner{
	
	public static void main(String []args){
		
		WaterBill bill=new WaterBill();
		bill.subDivisionName="N-4";
		bill.consumerId=27440;
		bill.consumerType="Domestic";
		bill.date="12-05-2026";
		bill.consumerName="Vishwanath";
		bill.adress="Rajajinagar";
		bill.billNumber="N-424971050";
		bill.rrNo=24971;
		bill.presentReading=701000;
		bill.previousreading=696000;
		bill.consumptionLts=5000;
		bill.waterCharges=48.00;
		bill.meterCharges=20.00;
		bill.sanitaryCharges=15.00;
		bill.scforBorewell=0.00;
		bill.otherCharges=0.00;
		bill.arrears=0.00;
	    bill.totalAmount=83.00;
		
		
	    String subDivisionName=bill.subDivisionName;
		int consumerId=bill.consumerId;
		String consumerType=bill.consumerType;
		String date=bill.date;
		String consumerName=bill.consumerName;
		String adress=bill.adress;
		String billNumber=bill.billNumber;
		int rrNo=bill.rrNo;
		int presentReading=bill.presentReading;
		int previousreading=bill.previousreading;
		int consumptionLts=bill.consumptionLts;
		double waterCharges=bill.waterCharges;
		double meterCharges=bill.meterCharges;
		double sanitaryCharges=bill.sanitaryCharges;
		double scforBorewell=bill.scforBorewell;
		double otherCharges=bill.otherCharges;
		double arrears=bill.arrears;
		double totalAmount=bill.totalAmount;
		
		
		System.out.println("Sub Division Name:"+subDivisionName);
		System.out.println("Consumer Id:"+consumerId);
		System.out.println("Consumer Type:"+consumerType);
		System.out.println("Date:"+date);
		System.out.println("Consumer Name:"+consumerName);
		System.out.println("Adress:"+adress);
		System.out.println("Bill Number:"+billNumber);
		System.out.println("R.R No:"+rrNo);
		System.out.println("--------------------------------");
		System.out.println("Present Reading:"+presentReading);
		System.out.println("Previous Reading:"+previousreading);
		System.out.println("Consumption Lts:"+consumptionLts);
		System.out.println("-------------------------------");
		System.out.println("Water Charges:"+waterCharges);
		System.out.println("Meter Charges:"+meterCharges);
		System.out.println("Sanitary Charges:"+sanitaryCharges);
		System.out.println("S C for Borewell:"+scforBorewell);
		System.out.println("Other Charges:"+otherCharges);
		System.out.println("Arrears:"+arrears);
		System.out.println("Total Amount:"+totalAmount);
		
		
	}
}

		
		
	