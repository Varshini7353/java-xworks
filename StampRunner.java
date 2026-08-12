class StampRunner {

    public static void main(String[] args) {

        Stamp s1 = new Stamp( "Trodat", "Office Stamp", "Black", "Plastic",
        "Rectangle", "Medium", 1, 80.5, 350, true);
        s1.getStampDetails();
        System.out.println("---------------------------");


        Stamp s2 = new Stamp("Colop", "Address Stamp", "Blue", "Rubber",
        "Square", "Large", 1, 100.0, 450, true);
        s2.getStampDetails();
        System.out.println("---------------------------");


        Stamp s3 = new Stamp("Shiny", "Date Stamp", "Red", "Wood",
        "Round", "Small", 2, 60.0, 250, false);
        s3.getStampDetails();
    }
}