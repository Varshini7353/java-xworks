class Zomato{
public static int search(String item){
int price=0;
if(item=="Margherita Pizza"){
    price=199;
}
else if(item=="Farmhouse Pizza"){
    price=279;
}
else if(item=="Veg Supreme Pizza"){
    price=299;
}
else if(item=="Cheese Burst Pizza"){
    price=349;
}
else if(item=="Garlic Bread"){
    price=149;
}
else if(item=="Pasta Alfredo"){
    price=239;
}
else if(item=="Pasta Arrabbiata"){
    price=249;
}
else if(item=="Lasagna"){
    price=289;
}
else if(item=="Mac and Cheese"){
    price=229;
}
else if(item=="French Fries"){
    price=129;
}
else if(item=="Peri Peri Fries"){
    price=159;
}
else if(item=="Onion Rings"){
    price=149;
}
else if(item=="Nachos"){
    price=189;
}
else if(item=="Tacos"){
    price=219;
}
else if(item=="Burrito"){
    price=259;
}
else if(item=="Quesadilla"){
    price=269;
}
else if(item=="Veg Momos"){
    price=169;
}
else if(item=="Spring Rolls"){
    price=179;
}
else if(item=="Cheese Balls"){
    price=199;
}
else if(item=="Stuffed Garlic Bread"){
    price=189;
}
else if(item=="Chocolate Lava Cake"){
    price=129;
}
else if(item=="Brownie"){
    price=99;
}
else if(item=="Blueberry Cheesecake"){
    price=249;
}
else if(item=="Red Velvet Cake"){
    price=279;
}
else if(item=="Donut"){
    price=79;
}
else if(item=="Croissant"){
    price=149;
}
else if(item=="Muffin"){
    price=89;
}
else if(item=="Waffles"){
    price=199;
}
else if(item=="Pancakes"){
    price=179;
}
else if(item=="Ice Cream Sundae"){
    price=159;
}
return price;
}
public static int search(String item,int quantity){
int price=0;
if(item=="Margherita Pizza"){
    price=199*quantity;
}
else if(item=="Farmhouse Pizza"){
    price=279*quantity;
}
else if(item=="Veg Supreme Pizza"){
    price=299*quantity;
}
else if(item=="Cheese Burst Pizza"){
    price=349*quantity;
}
else if(item=="Garlic Bread"){
    price=149*quantity;
}
else if(item=="Pasta Alfredo"){
    price=239*quantity;
}
else if(item=="Pasta Arrabbiata"){
    price=249*quantity;
}
else if(item=="Lasagna"){
    price=289*quantity;
}
else if(item=="Mac and Cheese"){
    price=229*quantity;
}
else if(item=="French Fries"){
    price=129*quantity;
}
else if(item=="Peri Peri Fries"){
    price=159*quantity;
}
else if(item=="Onion Rings"){
    price=149*quantity;
}
else if(item=="Nachos"){
    price=189*quantity;
}
else if(item=="Tacos"){
    price=219*quantity;
}
else if(item=="Burrito"){
    price=259*quantity;
}
else if(item=="Quesadilla"){
    price=269*quantity;
}
else if(item=="Veg Momos"){
    price=169*quantity;
}
else if(item=="Spring Rolls"){
    price=179*quantity;
}
else if(item=="Cheese Balls"){
    price=199*quantity;
}
else if(item=="Stuffed Garlic Bread"){
    price=189*quantity;
}
else if(item=="Chocolate Lava Cake"){
    price=129*quantity;
}
else if(item=="Brownie"){
    price=99*quantity;
}
else if(item=="Blueberry Cheesecake"){
    price=249*quantity;
}
else if(item=="Red Velvet Cake"){
    price=279*quantity;
}
else if(item=="Donut"){
    price=79*quantity;
}
else if(item=="Croissant"){
    price=149*quantity;
}
else if(item=="Muffin"){
    price=89*quantity;
}
else if(item=="Waffles"){
    price=199*quantity;
}
else if(item=="Pancakes"){
    price=179*quantity;
}
else if(item=="Ice Cream Sundae"){
    price=159*quantity;
}
return price;
}
public static void main(String []args){
String itemName="Pancakes";
int price=search(itemName);
System.out.println("The price of "+ itemName + " is " + price);
int priceWithquantity=search(itemName,3);
System.out.println("The price of"+" 3 "+ itemName +" is " + priceWithquantity);

}
}

