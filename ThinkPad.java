class ThinkPad {

    // Constructor
    ThinkPad(String brand, String model, String color, String processor,
             String operatingSystem, String displaySize, int ram,
             double storage, double price, boolean touchscreen) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.displaySize = displaySize;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.touchscreen = touchscreen;
    }

    // Instance variables
    String brand;
    String model;
    String color;
    String processor;
    String operatingSystem;
    String displaySize;
    int ram;
    double storage;
    double price;
    boolean touchscreen;

    // Method
    public void getThinkPadDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Processor: " + processor);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Display Size: " + displaySize);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Price: " + price);
        System.out.println("Touchscreen: " + touchscreen);
    }
}