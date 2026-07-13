class VtuColleges{
public static void main (String []args){
String vtuLocation="Belagavi";
int foundedYear=1994;
String vtuOwnedby="Government of Karnataka";

String [] vtuColleges={
"R. V. Institute of Technology and Management",
"Bangalore Institute of Technology",
"M. S. Ramaiah Institute of Technology",
"B. M. S. College of Engineering",
"Dayananda Sagar College of Engineering",
"New Horizon College of Engineering",
"Nitte Meenakshi Institute of Technology",
"Acharya Institute of Technology",
"CMR Institute of Technology",
"Atria Institute of Technology",
"APS College of Engineering",
"Cambridge Institute of Technology",
"City Engineering College",
"East West Institute of Technology",
"Brindavan College of Engineering",
"The National Institute of Engineering",
"KLE College of Engineering and Technology Chikodi",
"Hirasugar Institute of Technology",
"BLDEA's V. P. Dr. P. G. Halakatti College of Engineering and Technology",
"University BDT College of Engineering",
"Rao Bahadur Y. Mahabaleswarappa Engineering College",
"Proudhadevaraya Institute of Technology",
"KCT Engineering College",
"Shetty Institute of Technology",
"Guru Nanak Dev Engineering College"
};
System.out.println("The location of VTU:"+vtuLocation);
System.out.println("VTU founded in year:"+foundedYear);
System.out.println("vtu ownedby:"+vtuOwnedby);
System.out.println();
System.out.println("the list of vtu colleges are:");
//for-each
for(String college:vtuColleges){
System.out.println(college);
}
}
}