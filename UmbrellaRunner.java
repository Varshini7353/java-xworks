class UmbrellaRunner {

    public static void main(String[] args) {

        Umbrella u1 = new Umbrella( "Wildcraft", "Black", "Nylon", "Rain Umbrella",
        "Large", "Curved Handle", 8, 450.0, 799, true);
        u1.getUmbrellaDetails();
        System.out.println("---------------------------");


        Umbrella u2 = new Umbrella("Puma", "Blue", "Polyester", "Folding Umbrella",
        "Medium", "Straight Handle", 6, 350.0, 599, true);
        u2.getUmbrellaDetails();
        System.out.println("---------------------------");


        Umbrella u3 = new Umbrella("Totes", "Red", "Polyester", "Automatic Umbrella",
        "Small", "Rubber Handle", 8, 400.0, 999, true);
        u3.getUmbrellaDetails();
    }
}