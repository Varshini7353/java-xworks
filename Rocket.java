class Rocket {

    // Constructor
    Rocket(String brand, String type, String color, String material, String fuelType,
           String purpose, int stages, double height, double weight, double price) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.material = material;
        this.fuelType = fuelType;
        this.purpose = purpose;
        this.stages = stages;
        this.height = height;
        this.weight = weight;
        this.price = price;
    }

    // Instance variables
    String brand;
    String type;
    String color;
    String material;
    String fuelType;
    String purpose;
    int stages;
    double height;
    double weight;
    double price;

    // Method
    public void getRocketDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Purpose: " + purpose);
        System.out.println("Stages: " + stages);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
    }
}