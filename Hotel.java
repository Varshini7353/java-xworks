class Hotel{
public static void main(String []args){

String breakfastDish = "Idli";
String popularDish = "Masala Dosa";
String signatureDish = "Chicken Biryani";

String[] hotelMenu = {
"idli","dosa","biryani","Vada","Pongal","Poori","Chapati",
"Parotta","Meals","Fried Rice","Noodles","Gobi Manchurian",
"Paneer Butter Masala","Butter Naan","Chicken Curry",
"Mutton Biryani","Fish Fry","Prawn Curry","Sambar Rice",
"Curd Rice","Lemon Rice","Puliyogare","Gulab Jamun",
"Ice Cream","Coffee"};

System.out.println("  breakfastDish :" +breakfastDish  );
 System.out.println(" popularDish:"+ popularDish);
 System.out.println(" signatureDish:"+signatureDish );
 System.out.println();
 
 //for-each
 
System.out.println("The Hotelmenu :");
for(String menu:hotelMenu){
System.out.println(menu);
}
}
}