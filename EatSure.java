class EatSure{
public static int search(String item){
int price=0;
if(item=="Classic Veg Wrap"){
    price=149;
}
else if(item=="Paneer Tikka Wrap"){
    price=179;
}
else if(item=="Aloo Tikki Wrap"){
    price=139;
}
else if(item=="Veg Cheese Sandwich"){
    price=159;
}
else if(item=="Paneer Sandwich"){
    price=169;
}
else if(item=="Veg Club Sandwich"){
    price=189;
}
else if(item=="Veg Cheese Burger"){
    price=179;
}
else if(item=="Paneer Burger"){
    price=199;
}
else if(item=="Veg Delight Pizza"){
    price=249;
}
else if(item=="Paneer Supreme Pizza"){
    price=299;
}
else if(item=="Cheese Corn Pizza"){
    price=269;
}
else if(item=="White Sauce Pasta"){
    price=229;
}
else if(item=="Red Sauce Pasta"){
    price=219;
}
else if(item=="Veg Hakka Noodles"){
    price=189;
}
else if(item=="Schezwan Noodles"){
    price=209;
}
else if(item=="Veg Manchurian"){
    price=199;
}
else if(item=="Paneer Chilli"){
    price=229;
}
else if(item=="Veg Fried Momos"){
    price=169;
}
else if(item=="Paneer Momos"){
    price=189;
}
else if(item=="Cheese Garlic Bread"){
    price=159;
}
else if(item=="Cold Coffee"){
    price=129;
}
else if(item=="Oreo Milkshake"){
    price=179;
}
else if(item=="Chocolate Milkshake"){
    price=169;
}
else if(item=="Mango Smoothie"){
    price=159;
}
else if(item=="Strawberry Shake"){
    price=169;
}
else if(item=="Vanilla Ice Cream"){
    price=99;
}
else if(item=="Chocolate Ice Cream"){
    price=119;
}
else if(item=="Butterscotch Ice Cream"){
    price=119;
}
else if(item=="Fruit Salad"){
    price=149;
}
else if(item=="Chocolate Brownie"){
    price=129;
}
return price;
}
public static int search(String item,int quantity){
int price=0;
if(item=="Classic Veg Wrap"){
    price=149*quantity;
}
else if(item=="Paneer Tikka Wrap"){
    price=179*quantity;
}
else if(item=="Aloo Tikki Wrap"){
    price=139*quantity;
}
else if(item=="Veg Cheese Sandwich"){
    price=159*quantity;
}
else if(item=="Paneer Sandwich"){
    price=169*quantity;
}
else if(item=="Veg Club Sandwich"){
    price=189*quantity;
}
else if(item=="Veg Cheese Burger"){
    price=179*quantity;
}
else if(item=="Paneer Burger"){
    price=199*quantity;
}
else if(item=="Veg Delight Pizza"){
    price=249*quantity;
}
else if(item=="Paneer Supreme Pizza"){
    price=299*quantity;
}
else if(item=="Cheese Corn Pizza"){
    price=269*quantity;
}
else if(item=="White Sauce Pasta"){
    price=229*quantity;
}
else if(item=="Red Sauce Pasta"){
    price=219*quantity;
}
else if(item=="Veg Hakka Noodles"){
    price=189*quantity;
}
else if(item=="Schezwan Noodles"){
    price=209*quantity;
}
else if(item=="Veg Manchurian"){
    price=199*quantity;
}
else if(item=="Paneer Chilli"){
    price=229*quantity;
}
else if(item=="Veg Fried Momos"){
    price=169*quantity;
}
else if(item=="Paneer Momos"){
    price=189*quantity;
}
else if(item=="Cheese Garlic Bread"){
    price=159*quantity;
}
else if(item=="Cold Coffee"){
    price=129*quantity;
}
else if(item=="Oreo Milkshake"){
    price=179*quantity;
}
else if(item=="Chocolate Milkshake"){
    price=169*quantity;
}
else if(item=="Mango Smoothie"){
    price=159*quantity;
}
else if(item=="Strawberry Shake"){
    price=169*quantity;
}
else if(item=="Vanilla Ice Cream"){
    price=99*quantity;
}
else if(item=="Chocolate Ice Cream"){
    price=119*quantity;
}
else if(item=="Butterscotch Ice Cream"){
    price=119*quantity;
}
else if(item=="Fruit Salad"){
    price=149*quantity;
}
else if(item=="Chocolate Brownie"){
    price=129*quantity;
}
return price;
}
public static void main(String []args){
String itemName="Fruit Salad";
int price=search(itemName);
System.out.println("The price of "+ itemName + " is " + price);
int priceWithquantity=search(itemName,5);
System.out.println("The price of "+" 5 "+ itemName +" is " + priceWithquantity);

}
}

