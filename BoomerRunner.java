class BoomerRunner {

    public static void main(String[] args) {

        Boomer b1 = new Boomer("Boomer", "Strawberry", "Pink", "Chewing Gum", "Stick",
        "Packet", 10, 20.5, 20, false );
        b1.getBoomerDetails();
        System.out.println("---------------------------");



        Boomer b2 = new Boomer("Boomer", "Watermelon", "Green", "Chewing Gum", "Stick","Packet", 
		15, 30.0, 30, false);
        b2.getBoomerDetails();
        System.out.println("---------------------------");



        Boomer b3 = new Boomer("Boomer", "Mint", "Blue", "Chewing Gum", "Tablet","Box", 20, 40.0,
		50, true);
        b3.getBoomerDetails();
    }
}