class TyreRunner {

    public static void main(String[] args) {

        Tyre t1 = new Tyre("MRF", "Radial", "Rubber", "Black",
        "175/65 R15", "Car", 175, 15.0, 4500, true);
        t1.getTyreDetails();
        System.out.println("---------------------------");


        Tyre t2 = new Tyre("CEAT", "Tubeless", "Rubber", "Black",
        "90/90-18", "Bike", 90, 18.0, 2200, true);
        t2.getTyreDetails();
        System.out.println("---------------------------");


        Tyre t3 = new Tyre("Apollo", "Radial", "Rubber", "Black",
        "205/55 R16", "Car", 205, 16.0, 5500, true);
        t3.getTyreDetails();
    }
}