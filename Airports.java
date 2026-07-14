class Airports{
public static void main(String []args){
String internationalAirport = "Kempegowda International Airport";
String coastalAirport = "Mangalore International Airport";
String northKarnatakaAirport = "Hubballi Airport";

String[] airports = {
"kempegowdaAirport","mangaloreAirport","hubballiAirport",
"Mysuru Airport","Belagavi Airport","Kalaburagi Airport",
"Ballari Airport","Shivamogga Airport","Bidar Airport",
"Vijayapura Airport","HAL Airport","Jindal Vijayanagar Airport",
"Koppal Airport","Raichur Airport","Hassan Airport","Karwar Airport",
"Dharwad Airport","Tumakuru Airport","Chitradurga Airport",
"Madikeri Airstrip","Kodagu Airstrip","Yelahanka Air Force Station",
"Bellary Airstrip","Mandya Airstrip","Davanagere Airstrip"};

System.out.println("  internationalAirport:" +internationalAirport );
 System.out.println(" coastalAirport:"+ coastalAirport);
 System.out.println(" northKarnatakaAirport:"+northKarnatakaAirport );
 System.out.println();
 
 //for-each
 
System.out.println("The Airports in karnataka are:");
for(String air:airports){
System.out.println(air);
}
}
}