class Dominos{
public static int search(String food){
	int price=0;
if(food=="Margherita Pizza"){
    price=199;
}
else if(food=="Farmhouse Pizza"){
    price=279;
}
else if(food=="Peppy Paneer Pizza"){
    price=299;
}
else if(food=="Veg Extravaganza Pizza"){
    price=349;
}
else if(food=="Deluxe Veggie Pizza"){
    price=329;
}
else if(food=="Mexican Green Wave Pizza"){
    price=319;
}
else if(food=="Cheese n Corn Pizza"){
    price=249;
}
else if(food=="Fresh Veggie Pizza"){
    price=269;
}
else if(food=="Paneer Makhani Pizza"){
    price=339;
}
else if(food=="Indi Tandoori Paneer Pizza"){
    price=359;
}
else if(food=="Chicken Dominator Pizza"){
    price=449;
}
else if(food=="Pepper Barbecue Chicken Pizza"){
    price=389;
}
else if(food=="Chicken Sausage Pizza"){
    price=349;
}
else if(food=="Chicken Golden Delight Pizza"){
    price=379;
}
else if(food=="Non Veg Supreme Pizza"){
    price=429;
}
else if(food=="Garlic Breadsticks"){
    price=149;
}
else if(food=="Stuffed Garlic Bread"){
    price=189;
}
else if(food=="Cheesy Dip"){
    price=35;
}
else if(food=="Tomato Ketchup"){
    price=10;
}
else if(food=="Taco Mexicana Veg"){
    price=169;
}
else if(food=="Taco Mexicana Chicken"){
    price=199;
}
else if(food=="Zingy Parcel Veg"){
    price=99;
}
else if(food=="Zingy Parcel Chicken"){
    price=119;
}
else if(food=="Choco Lava Cake"){
    price=129;
}
else if(food=="Butterscotch Mousse Cake"){
    price=149;
}
else if(food=="Coke"){
    price=60;
}
else if(food=="Sprite"){
    price=60;
}
else if(food=="Pepsi"){
    price=60;
}
else if(food=="7Up"){
    price=60;
}
else if(food=="Chocolate Brownie"){
    price=139;
}
return price;
}
public static int search(String food,int quantity){
int price=0;
if(food=="Margherita Pizza"){
    price=199*quantity;
}
else if(food=="Farmhouse Pizza"){
    price=279*quantity;
}
else if(food=="Peppy Paneer Pizza"){
    price=299*quantity;
}
else if(food=="Veg Extravaganza Pizza"){
    price=349*quantity;
}
else if(food=="Deluxe Veggie Pizza"){
    price=329*quantity;
}
else if(food=="Mexican Green Wave Pizza"){
    price=319*quantity;
}
else if(food=="Cheese n Corn Pizza"){
    price=249*quantity;
}
else if(food=="Fresh Veggie Pizza"){
    price=269*quantity;
}
else if(food=="Paneer Makhani Pizza"){
    price=339*quantity;
}
else if(food=="Indi Tandoori Paneer Pizza"){
    price=359*quantity;
}
else if(food=="Chicken Dominator Pizza"){
    price=449*quantity;
}
else if(food=="Pepper Barbecue Chicken Pizza"){
    price=389*quantity;
}
else if(food=="Chicken Sausage Pizza"){
    price=349*quantity;
}
else if(food=="Chicken Golden Delight Pizza"){
    price=379*quantity;
}
else if(food=="Non Veg Supreme Pizza"){
    price=429*quantity;
}
else if(food=="Garlic Breadsticks"){
    price=149*quantity;
}
else if(food=="Stuffed Garlic Bread"){
    price=189*quantity;
}
else if(food=="Cheesy Dip"){
    price=35*quantity;
}
else if(food=="Tomato Ketchup"){
    price=10*quantity;
}
else if(food=="Taco Mexicana Veg"){
    price=169*quantity;
}
else if(food=="Taco Mexicana Chicken"){
    price=199*quantity;
}
else if(food=="Zingy Parcel Veg"){
    price=99*quantity;
}
else if(food=="Zingy Parcel Chicken"){
    price=119*quantity;
}
else if(food=="Choco Lava Cake"){
    price=129*quantity;
}
else if(food=="Butterscotch Mousse Cake"){
    price=149*quantity;
}
else if(food=="Coke"){
    price=60*quantity;
}
else if(food=="Sprite"){
    price=60*quantity;
}
else if(food=="Pepsi"){
    price=60*quantity;
}
else if(food=="7Up"){
    price=60*quantity;
}
else if(food=="Chocolate Brownie"){
    price=139*quantity;
}
return price;
}
public static void main(String []args){
String food="Farmhouse Pizza";
int price=search(food);
System.out.println("The price of "+ food + " is " + price);
int priceWithquantity=search(food,2);
System.out.println("The price of "+" 2 "+ food +" is " + priceWithquantity);

}
}