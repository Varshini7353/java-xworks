class Temples{
public static void main(String []args){
String famousTemple = "Meenakshi Amman Temple";
String heritageTemple = "Brihadeeswarar Temple";
String pilgrimageTemple = "Ramanathaswamy Temple";

String[] temples = {
"meenakshiTemple","brihadeeswararTemple","ramanathaswamyTemple",
"Kapaleeshwarar Temple","Arunachaleswarar Temple","Nataraja Temple",
"Ekambareswarar Temple","Kanchi Kailasanathar Temple",
"Sri Ranganathaswamy Temple","Marudamalai Temple",
"Palani Murugan Temple","Thiruchendur Murugan Temple",
"Swamimalai Murugan Temple","Pazhamudircholai Temple",
"Thirupparamkunram Temple","Vadapalani Murugan Temple",
"Parthasarathy Temple","Ashtalakshmi Temple",
"Rockfort Ucchi Pillayar Temple","Samayapuram Mariamman Temple",
"Kumari Amman Temple","Thanumalayan Temple","Sankaranarayanar Temple",
"Koodal Azhagar Temple","Azhagar Kovil"};

System.out.println("  famousTemple:" +famousTemple );
 System.out.println(" heritageTemple:"+ heritageTemple);
 System.out.println(" pilgrimageTemple:"+pilgrimageTemple );
 System.out.println();
 
 //for-each
 
System.out.println("The farming Temples in Tamilnadu are:");
for(String tamil:temples){
System.out.println(tamil);
}
}
}