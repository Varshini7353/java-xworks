class WPL{
public static void main(String[] args){
String womensteams[]= {"Australia", "England", "India", "South Africa",
 "New Zealand", "West Indies", "Sri Lanka", "Pakistan", "Bangladesh",
 "Ireland"};
 
 String[] batters = {"Smriti Mandhana", "Nat Sciver-Brunt",
 "Laura Wolvaardt","Beth Mooney", "Chamari Athapaththu", "Hayley Matthews", 
	"Ellyse Perry", "Alyssa Healy", "Harmanpreet Kaur", "Sophie Devine"};
	
String[] bowlers = {"Sophie Ecclestone", "Ashleigh Gardner", 
"Deepti Sharma","Jess Jonassen", "Megan Schutt", "Shabnim Ismail",
 "Marizanne Kapp", "Amelia Kerr", "Rajeshwari Gayakwad", "Renuka Singh"};
 
 
 System.out.println("Top 10 womens cricket teams are:");
for(String teams:womensteams){
	System.out.println(teams);
}
System.out.println();

System.out.println(" women batters in cricket are:");
 for(String bat:batters){
	 System.out.println(bat);
 }
 System.out.println();
 
 System.out.println("women bowlers in cricket are:");
 for(String boe:bowlers){
	 System.out.println(boe);
 }
}
}
