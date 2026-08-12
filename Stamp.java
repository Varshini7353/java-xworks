class Stamp {

    // Constructor
    Stamp(String brand, String type, String color, String material,
          String shape, String size, int quantity, double weight,
          double price, boolean selfInking) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.material = material;
        this.shape = shape;
        this.size = size;
        this.quantity = quantity;
        this.weight = weight;
        this.price = price;
        this.selfInking = selfInking;
    }

    // Instance variables
    String brand;
    String type;
    String color;
    String material;
    String shape;
    String size;
    int quantity;
    double weight;
    double price;
    boolean selfInking;

    // Method
    public void getStampDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Shape: " + shape);
        System.out.println("Size: " + size);
        System.out.println("Quantity: " + quantity);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Self Inking: " + selfInking);
    }
}