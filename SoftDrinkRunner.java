class SoftDrinkRunner {

    public static void main(String[] args) {

        SoftDrink s1 = new SoftDrink( "Coca-Cola", "Cola", "Black", "Carbonated", "Large", 
		"Plastic Bottle", 1, 750.0, 45, true);
        s1.getSoftDrinkDetails();
        System.out.println("---------------------------");


        SoftDrink s2 = new SoftDrink("Pepsi", "Cola", "Black", "Carbonated","Medium", 
		"Plastic Bottle", 1, 500.0, 35, true);
        s2.getSoftDrinkDetails();
        System.out.println("---------------------------");


        SoftDrink s3 = new SoftDrink(  "Sprite", "Lemon Lime", "Transparent", "Carbonated",
        "Small", "Glass Bottle", 1, 250.0, 25, true);
        s3.getSoftDrinkDetails();
    }
}