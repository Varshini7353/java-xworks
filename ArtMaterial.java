class ArtMaterial {

    // Constructor
    ArtMaterial(String brand, String type, String color, String material,
                String size, String usage, int quantity, double weight,
                double price, boolean washable) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.material = material;
        this.size = size;
        this.usage = usage;
        this.quantity = quantity;
        this.weight = weight;
        this.price = price;
        this.washable = washable;
    }

    // Instance variables
    String brand;
    String type;
    String color;
    String material;
    String size;
    String usage;
    int quantity;
    double weight;
    double price;
    boolean washable;

    // Method
    public void getArtMaterialDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Usage: " + usage);
        System.out.println("Quantity: " + quantity);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Washable: " + washable);
    }
}