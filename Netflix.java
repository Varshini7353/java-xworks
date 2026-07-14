class Netflix{
public static void main(String[] pops){
String[] action = {
    "Extraction", "The Gray Man", "Red Notice", "Triple Frontier", "6 Underground",
    "The Old Guard", "Army of the Dead", "Kate", "Heart of Stone", "Polar",
    "Outside the Wire", "Project Power", "Bright", "Interceptor", "Sentinelle",
    "Close", "Wheelman", "Point Blank", "How It Ends", "Spectral",
    "Revenger", "Black Crab", "The Take", "Lost Bullet", "Furies"};

String[] comedy = {
    "Murder Mystery", "The Wrong Missy", "Senior Year", "Me Time", "You People",
    "The Do-Over", "Fatherhood", "Coffee and Kareem", "Home Team", "Players",
    "Love Hard", "The Sleepover", "Family Switch", "Back in Action", "Tall Girl",
    "Tall Girl 2", "Holidate", "Work It", "Good on Paper", "Wine Country",
    "Eurovision", "Always Be My Maybe", "Ibiza", "Set It Up", "Dog Gone Trouble"};

String[] thriller = {
    "Bird Box", "Leave the World Behind", "The Platform", "Fractured", "I Care a Lot",
    "The Weekend Away", "Hypnotic", "Intrusion", "The Strays", "Secret Obsession",
    "Clinical", "Cam", "Run Rabbit Run", "Gerald's Game", "Shimmer Lake",
    "Forgotten", "The Occupant", "Watcher", "The Chalk Line", "Brazen",
    "Dangerous Lies", "In the Shadow of the Moon", "Lou", "Hold the Dark",
	"Blood Red Sky"};

String[] drama = {
    "The Irishman", "Marriage Story", "Roma", "Mudbound", "The Trial of the Chicago 7",
    "Hillbilly Elegy", "The Dig", "Tick Tick Boom", "Passing", "Pieces of a Woman",
    "White Tiger", "Ma Rainey's Black Bottom", "The King", "Luckiest Girl Alive", 
	"Purple Hearts","All Quiet on the Western Front", "Athlete A", "Against the Ice", 
	"The Swimmers", "Nyad","Fair Play", "The Good Nurse", "The Unforgivable", 
	"Rebecca", "Worth"};

String[] webSeries = {"Stranger Things", "Wednesday", "Dark", "Money Heist", 
"Squid Game", "The Witcher", "Bridgerton", "Lupin", "All of Us Are Dead", 
"Alice in Borderland", "The Umbrella Academy", "Black Mirror", "Narcos",
 "Peaky Blinders", "Ozark", "You", "Lucifer", "The Crown", "Sacred Games", 
 "Mirzapur", "Panchayat", "Asur", "The Family Man", "Farzi", "Delhi Crime"};
 
System.out.println("Action Movies:\n");
for(String mov:action){
	System.out.println(mov);
}
System.out.println(); 

System.out.println("Comedy Movies:\n");
for(String com:comedy){
	System.out.println(com);
}
System.out.println(); 

System.out.println("Thriller Movies:\n");
for(String thrill:thriller){
	System.out.println(thrill);
}
System.out.println(); 

System.out.println("Drama Movies:\n");
for(String dra:drama){
	System.out.println(dra);
}
System.out.println(); 

System.out.println("Web Series:\n");
for(String web:webSeries){
	System.out.println(web);
}

}
}
