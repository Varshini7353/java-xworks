class SoftDrink {

    // Constructor
    SoftDrink(String brand, String flavor, String color, String type,
              String size, String bottleType, int quantity,
              double volume, double price, boolean carbonated) {

        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.type = type;
        this.size = size;
        this.bottleType = bottleType;
        this.quantity = quantity;
        this.volume = volume;
        this.price = price;
        this.carbonated = carbonated;
    }

    // Instance variables
    String brand;
    String flavor;
    String color;
    String type;
    String size;
    String bottleType;
    int quantity;
    double volume;
    double price;
    boolean carbonated;

    // Method
    public void getSoftDrinkDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Bottle Type: " + bottleType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Volume: " + volume);
        System.out.println("Price: " + price);
        System.out.println("Carbonated: " + carbonated);
    }
}