class RocketRunner {

    public static void main(String[] args) {

        Rocket r1 = new Rocket("ISRO", "Launch Vehicle", "White", "Aluminium Alloy","Liquid Fuel",
		"Satellite Launch", 3, 43.5, 200000, 500000000);
        r1.getRocketDetails();
        System.out.println("---------------------------");


        Rocket r2 = new Rocket("SpaceX", "Reusable Rocket", "White", "Carbon Fiber","Liquid Oxygen",
		"Space Mission", 2, 70.0, 549000, 670000000);
        r2.getRocketDetails();
        System.out.println("---------------------------");


        Rocket r3 = new Rocket("NASA", "Heavy Lift Rocket", "Orange", "Aluminium","Liquid Hydrogen",
		"Moon Mission", 3, 98.0, 2600000, 1000000000 );
        r3.getRocketDetails();
    }
}