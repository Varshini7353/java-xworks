class WindShield {

    // Constructor
    WindShield(String brand, String material, String color, String type,
               String size, String vehicleType, double thickness,
               double height, double price, boolean uvProtection) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.type = type;
        this.size = size;
        this.vehicleType = vehicleType;
        this.thickness = thickness;
        this.height = height;
        this.price = price;
        this.uvProtection = uvProtection;
    }

    // Instance variables
    String brand;
    String material;
    String color;
    String type;
    String size;
    String vehicleType;
    double thickness;
    double height;
    double price;
    boolean uvProtection;

    // Method
    public void getWindShieldDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Thickness: " + thickness);
        System.out.println("Height: " + height);
        System.out.println("Price: " + price);
        System.out.println("UV Protection: " + uvProtection);
    }
}