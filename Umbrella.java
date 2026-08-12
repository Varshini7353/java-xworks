class Umbrella {

    // Constructor
    Umbrella(String brand, String color, String material, String type,
             String size, String handleType, int ribs, double weight,
             double price, boolean waterproof) {

        this.brand = brand;
        this.color = color;
        this.material = material;
        this.type = type;
        this.size = size;
        this.handleType = handleType;
        this.ribs = ribs;
        this.weight = weight;
        this.price = price;
        this.waterproof = waterproof;
    }

    // Instance variables
    String brand;
    String color;
    String material;
    String type;
    String size;
    String handleType;
    int ribs;
    double weight;
    double price;
    boolean waterproof;

    // Method
    public void getUmbrellaDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Handle Type: " + handleType);
        System.out.println("Ribs: " + ribs);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Waterproof: " + waterproof);
    }
}