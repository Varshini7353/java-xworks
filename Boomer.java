class Boomer {

    // Constructor
    Boomer(String brand, String flavor, String color, String type, String shape,
           String packType, int quantity, double weight, double price,
           boolean sugarFree) {

        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.type = type;
        this.shape = shape;
        this.packType = packType;
        this.quantity = quantity;
        this.weight = weight;
        this.price = price;
        this.sugarFree = sugarFree;
    }

    // Instance variables
    String brand;
    String flavor;
    String color;
    String type;
    String shape;
    String packType;
    int quantity;
    double weight;
    double price;
    boolean sugarFree;

    // Method
    public void getBoomerDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Shape: " + shape);
        System.out.println("Pack Type: " + packType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Sugar Free: " + sugarFree);
    }
}