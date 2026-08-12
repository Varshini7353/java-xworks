class WindShieldRunner {

    public static void main(String[] args) {

        WindShield w1 = new WindShield("Saint-Gobain", "Laminated Glass", "Clear", "Front Windshield",
        "Large", "Car", 5.5, 70.0, 8500, true);
        w1.getWindShieldDetails();
        System.out.println("---------------------------");


        WindShield w2 = new WindShield("AIS", "Tempered Glass", "Green", "Rear Windshield",
        "Medium", "Car", 4.5, 60.0, 6500, true);
        w2.getWindShieldDetails();
        System.out.println("---------------------------");

        WindShield w3 = new WindShield("Pilkington", "Laminated Glass", "Blue", "Front Windshield",
        "Large", "Truck", 6.0, 85.0, 12000, true );
        w3.getWindShieldDetails();
    }
}