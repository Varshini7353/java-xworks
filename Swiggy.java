class Swiggy {

    public static int search(String item) {

        int price = 0;

        if(item=="Pizza"){
            price=99;
        }
        else if(item=="Burger"){
            price=129;
        }
        else if(item=="Veg Biryani"){
            price=150;
        }
        else if(item=="Chicken Kabab"){
            price=250;
        }
        else if(item=="Masala Dosa"){
            price=80;
        }
        else if(item=="Idli"){
            price=40;
        }
        else if(item=="Vada"){
            price=35;
        }
        else if(item=="Pongal"){
            price=70;
        }
        else if(item=="Poori"){
            price=60;
        }
        else if(item=="Bisi Bele Bath"){
            price=90;
        }
        else if(item=="Ragi Mudde"){
            price=75;
        }
        else if(item=="Neer Dosa"){
            price=95;
        }
        else if(item=="Set Dosa"){
            price=85;
        }
        else if(item=="Khara Bath"){
            price=65;
        }
        else if(item=="Kesari Bath"){
            price=55;
        }
        else if(item=="Tomato Rice"){
            price=100;
        }
        else if(item=="Lemon Rice"){
            price=90;
        }
        else if(item=="Curd Rice"){
            price=80;
        }
        else if(item=="Puliyogare"){
            price=95;
        }
        else if(item=="Vegetable Upma"){
            price=70;
        }
        else if(item=="Paneer Butter Masala"){
            price=220;
        }
        else if(item=="Butter Naan"){
            price=45;
        }
        else if(item=="Palak Paneer"){
            price=210;
        }
        else if(item=="Jeera Rice"){
            price=130;
        }
        else if(item=="Veg Pulao"){
            price=150;
        }
        else if(item=="Veg Fried Rice"){
            price=170;
        }
        else if(item=="Gobi Manchurian"){
            price=180;
        }
        else if(item=="Mushroom Masala"){
            price=200;
        }
        else if(item=="Dal Fry"){
            price=140;
        }
        else if(item=="Chapati"){
            price=20;
        }

        return price;
    }
    public static int search(String item, int quantity) {

        int price = 0;

        if(item=="Pizza"){
            price=99*quantity;
        }
        else if(item=="Burger"){
            price=129*quantity;
        }
        else if(item=="Veg Biryani"){
            price=150*quantity;
        }
        else if(item=="Chicken Kabab"){
            price=250*quantity;
        }
        else if(item=="Masala Dosa"){
            price=80*quantity;
        }
        else if(item=="Idli"){
            price=40*quantity;
        }
        else if(item=="Vada"){
            price=35*quantity;
        }
        else if(item=="Pongal"){
            price=70*quantity;
        }
        else if(item=="Poori"){
            price=60*quantity;
        }
        else if(item=="Bisi Bele Bath"){
            price=90*quantity;
        }
        else if(item=="Ragi Mudde"){
            price=75*quantity;
        }
        else if(item=="Neer Dosa"){
            price=95*quantity;
        }
        else if(item=="Set Dosa"){
            price=85*quantity;
        }
        else if(item=="Khara Bath"){
            price=65*quantity;
        }
        else if(item=="Kesari Bath"){
            price=55*quantity;
        }
        else if(item=="Tomato Rice"){
            price=100*quantity;
        }
        else if(item=="Lemon Rice"){
            price=90*quantity;
        }
        else if(item=="Curd Rice"){
            price=80*quantity;
        }
        else if(item=="Puliyogare"){
            price=95*quantity;
        }
        else if(item=="Vegetable Upma"){
            price=70*quantity;
        }
        else if(item=="Paneer Butter Masala"){
            price=220*quantity;
        }
        else if(item=="Butter Naan"){
            price=45*quantity;
        }
        else if(item=="Palak Paneer"){
            price=210*quantity;
        }
        else if(item=="Jeera Rice"){
            price=130*quantity;
        }
        else if(item=="Veg Pulao"){
            price=150*quantity;
        }
        else if(item=="Veg Fried Rice"){
            price=170*quantity;
        }
        else if(item=="Gobi Manchurian"){
            price=180*quantity;
        }
        else if(item=="Mushroom Masala"){
            price=200*quantity;
        }
        else if(item=="Dal Fry"){
            price=140*quantity;
        }
        else if(item=="Chapati"){
            price=20*quantity;
        }

        return price;
    }
	
public static void main(String []args){
String itemName="Chicken Kabab";
int price=search(itemName);
System.out.println("The price of "+ itemName + " is " + price);
int priceWithquantity=search(itemName,4);
System.out.println("The price of "+" 4 "+ itemName +" is " + priceWithquantity);

}
}


