class PizzaHut{
public static int search(String food){
int price=0;
if(food=="Veggie Lover Pizza"){
    price=259;
}
else if(food=="Cheese Max Pizza"){
    price=329;
}
else if(food=="Tandoori Paneer Pizza"){
    price=349;
}
else if(food=="Spicy Corn Pizza"){
    price=239;
}
else if(food=="Veggie Supreme Pizza"){
    price=319;
}
else if(food=="Mushroom Delight Pizza"){
    price=299;
}
else if(food=="Double Cheese Pizza"){
    price=339;
}
else if(food=="Paneer Supreme Pizza"){
    price=359;
}
else if(food=="Chicken Supreme Pizza"){
    price=399;
}
else if(food=="Smoky Chicken Pizza"){
    price=419;
}
else if(food=="BBQ Chicken Pizza"){
    price=429;
}
else if(food=="Chicken Pepperoni Pizza"){
    price=449;
}
else if(food=="Italian Chicken Pizza"){
    price=439;
}
else if(food=="Classic Veg Pasta"){
    price=219;
}
else if(food=="Creamy Chicken Pasta"){
    price=259;
}
else if(food=="Cheesy Garlic Toast"){
    price=169;
}
else if(food=="Garlic Bread Supreme"){
    price=179;
}
else if(food=="Veggie Pocket"){
    price=149;
}
else if(food=="Chicken Pocket"){
    price=169;
}
else if(food=="French Fries Large"){
    price=149;
}
else if(food=="Potato Wedges"){
    price=159;
}
else if(food=="Chicken Wings"){
    price=299;
}
else if(food=="Chicken Popcorn"){
    price=249;
}
else if(food=="Chocolate Donut"){
    price=129;
}
else if(food=="Chocolate Truffle Cake"){
    price=169;
}
else if(food=="Virgin Mojito"){
    price=119;
}
else if(food=="Lemon Iced Tea"){
    price=99;
}
else if(food=="Orange Juice"){
    price=89;
}
else if(food=="Cold Coffee Classic"){
    price=149;
}
else if(food=="Vanilla Sundae"){
    price=129;
}
return price;
}
public static int search(String food,int quantity){
int price=0;
if(food=="Veggie Lover Pizza"){
    price=259*quantity;
}
else if(food=="Cheese Max Pizza"){
    price=329*quantity;
}
else if(food=="Tandoori Paneer Pizza"){
    price=349*quantity;
}
else if(food=="Spicy Corn Pizza"){
    price=239*quantity;
}
else if(food=="Veggie Supreme Pizza"){
    price=319*quantity;
}
else if(food=="Mushroom Delight Pizza"){
    price=299*quantity;
}
else if(food=="Double Cheese Pizza"){
    price=339*quantity;
}
else if(food=="Paneer Supreme Pizza"){
    price=359*quantity;
}
else if(food=="Chicken Supreme Pizza"){
    price=399*quantity;
}
else if(food=="Smoky Chicken Pizza"){
    price=419*quantity;
}
else if(food=="BBQ Chicken Pizza"){
    price=429*quantity;
}
else if(food=="Chicken Pepperoni Pizza"){
    price=449*quantity;
}
else if(food=="Italian Chicken Pizza"){
    price=439*quantity;
}
else if(food=="Classic Veg Pasta"){
    price=219*quantity;
}
else if(food=="Creamy Chicken Pasta"){
    price=259*quantity;
}
else if(food=="Cheesy Garlic Toast"){
    price=169*quantity;
}
else if(food=="Garlic Bread Supreme"){
    price=179*quantity;
}
else if(food=="Veggie Pocket"){
    price=149*quantity;
}
else if(food=="Chicken Pocket"){
    price=169*quantity;
}
else if(food=="French Fries Large"){
    price=149*quantity;
}
else if(food=="Potato Wedges"){
    price=159*quantity;
}
else if(food=="Chicken Wings"){
    price=299*quantity;
}
else if(food=="Chicken Popcorn"){
    price=249*quantity;
}
else if(food=="Chocolate Donut"){
    price=129*quantity;
}
else if(food=="Chocolate Truffle Cake"){
    price=169*quantity;
}
else if(food=="Virgin Mojito"){
    price=119*quantity;
}
else if(food=="Lemon Iced Tea"){
    price=99*quantity;
}
else if(food=="Orange Juice"){
    price=89*quantity;
}
else if(food=="Cold Coffee Classic"){
    price=149*quantity;
}
else if(food=="Vanilla Sundae"){
    price=129*quantity;
}
return price;
}
public static void main(String []args){
String food="Tandoori Paneer Pizza";
int price=search(food);
System.out.println("The price of "+ food + " is " + price);
int priceWithquantity=search(food,6);
System.out.println("The price of "+" 6 "+food +" is " + priceWithquantity);

}
}