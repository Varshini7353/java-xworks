class IPL{
public static void main(String[] args){
String mensTeams[]={"India", "Australia", "England", 
"New Zealand", "South Africa", "Pakistan", "Sri Lanka",
 "Afghanistan", "West Indies", "Bangladesh"};
 
 String batsmens[]={"Shubman Gill", "Babar Azam", "Virat Kohli", 
"Rohit Sharma","Travis Head", "Joe Root", "Kane Williamson", 
"Steve Smith","Rassie van der Dussen", "Daryl Mitchell"};

String[] bowlers = {
    "Jasprit Bumrah", "Rashid Khan", "Shaheen Afridi", "Josh Hazlewood",
    "Pat Cummins", "Kuldeep Yadav", "Trent Boult", "Kagiso Rabada",
    "Adam Zampa", "Mitchell Starc"};
	
 System.out.println("Top 10 mens cricket teams are:");
 for(String mens:mensTeams){
	 System.out.println(mens);
 }
 System.out.println();
 
 System.out.println(" men batsman in cricket are:");
 for(String bat:batsmens){
	 System.out.println(bat);
 }
 System.out.println();
 
 System.out.println("men bowlers in cricket are:");
 for(String bow:bowlers){
	 System.out.println(bow);
 }	 
 
 }
 }
 
 
