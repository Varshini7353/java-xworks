class Ingredients{
public static void main(String[] args){
String rice = "Rice";
String salt = "Salt";
String turmeric = "Turmeric";

String[] ingredients = {
"rice","salt","turmeric","Chilli Powder","Coriander Powder",
"Cumin Seeds","Mustard Seeds","Garam Masala","Black Pepper",
"Ginger","Garlic","Onion","Tomato","Green Chilli","Curry Leaves",
"Coriander Leaves","Cooking Oil","Ghee","Sugar","Jaggery","Lemon",
"Coconut","Cardamom","Cloves","Cinnamon"};

System.out.println("  Ingredient1:" +rice );
 System.out.println(" Ingredient2:"+ salt);
 System.out.println(" Ingredient3:"+turmeric );
 System.out.println();
 
 //for-each
 
System.out.println("The Ingredient items are:");
for(String items:ingredients){
System.out.println(items);
}
}
}