class Banks{
public static void main(String []args){
String mainBranch = "SBI Main Branch";
String cityBranch = "SBI Bangalore City";
String koramangalaBranch = "SBI Koramangala";

String[] sbiBanks = {
"mainBranch","cityBranch","koramangalaBranch","SBI Malleswaram",
"SBI Indiranagar","SBI Jayanagar","SBI Rajajinagar",
"SBI Basavanagudi","SBI Whitefield","SBI Electronic City",
"SBI Yelahanka","SBI HSR Layout","SBI Marathahalli",
"SBI Banashankari","SBI Vijayanagar","SBI BTM Layout",
"SBI JP Nagar","SBI Hebbal","SBI Bellandur","SBI Kengeri",
"SBI MG Road","SBI Church Street","SBI RT Nagar",
"SBI Bannerghatta Road","SBI Malleshwaram"};

System.out.println("  mainBranch :" +mainBranch  );
 System.out.println(" cityBranch :"+ cityBranch );
 System.out.println(" koramangalaBranch:"+koramangalaBranch );
 System.out.println();
 
 //for-each
 
System.out.println("The SBI banks in Bengaluru are :");
for(String bank:sbiBanks){
System.out.println(bank);
}
}
}