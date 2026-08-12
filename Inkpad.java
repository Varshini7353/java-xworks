class Inkpad {

    // Constructor
    Inkpad(String brand, String color, String material, String type,
           String size, String shape, int quantity, double weight,
           double price, boolean refillable) {

        this.brand = brand;
        this.color = color;
        this.material = material;
        this.type = type;
        this.size = size;
        this.shape = shape;
        this.quantity = quantity;
        this.weight = weight;
        this.price = price;
        this.refillable = refillable;
    }

    // Instance variables
    String brand;
    String color;
    String material;
    String type;
    String size;
    String shape;
    int quantity;
    double weight;
    double price;
    boolean refillable;

    // Method
    public void getInkpadDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Shape: " + shape);
        System.out.println("Quantity: " + quantity);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Refillable: " + refillable);
    }
}