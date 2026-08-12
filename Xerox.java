class Xerox {

    // Constructor
    Xerox(String brand, String model, String color, String type, String technology,
          String paperSize, int paperCapacity, double printSpeed,
          double price, boolean scanner) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
        this.technology = technology;
        this.paperSize = paperSize;
        this.paperCapacity = paperCapacity;
        this.printSpeed = printSpeed;
        this.price = price;
        this.scanner = scanner;
    }

    // Instance variables
    String brand;
    String model;
    String color;
    String type;
    String technology;
    String paperSize;
    int paperCapacity;
    double printSpeed;
    double price;
    boolean scanner;

    // Method
    public void getXeroxDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Technology: " + technology);
        System.out.println("Paper Size: " + paperSize);
        System.out.println("Paper Capacity: " + paperCapacity);
        System.out.println("Print Speed: " + printSpeed);
        System.out.println("Price: " + price);
        System.out.println("Scanner: " + scanner);
    }
}