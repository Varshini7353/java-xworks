class Tyre {

    // Constructor
    Tyre(String brand, String type, String material, String color,
         String size, String vehicleType, int width, double diameter,
         double price, boolean tubeless) {

        this.brand = brand;
        this.type = type;
        this.material = material;
        this.color = color;
        this.size = size;
        this.vehicleType = vehicleType;
        this.width = width;
        this.diameter = diameter;
        this.price = price;
        this.tubeless = tubeless;
    }

    // Instance variables
    String brand;
    String type;
    String material;
    String color;
    String size;
    String vehicleType;
    int width;
    double diameter;
    double price;
    boolean tubeless;

    // Method
    public void getTyreDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Width: " + width);
        System.out.println("Diameter: " + diameter);
        System.out.println("Price: " + price);
        System.out.println("Tubeless: " + tubeless);
    }
}