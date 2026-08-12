class InkpadRunner {

    public static void main(String[] args) {

        Inkpad i1 = new Inkpad("Camlin", "Black", "Foam", "Stamp Inkpad",
        "Medium", "Square", 1, 50.5, 80, true);
        i1.getInkpadDetails();
        System.out.println("---------------------------");



        Inkpad i2 = new Inkpad("Faber-Castell", "Blue", "Foam", "Stamp Inkpad",
        "Large", "Rectangle", 1, 75.0, 120, true );
       i2.getInkpadDetails();
        System.out.println("---------------------------");



        Inkpad i3 = new Inkpad( "Brustro", "Red", "Felt", "Craft Inkpad",
        "Small", "Round", 2, 40.0, 60, false );
        i3.getInkpadDetails();
    }
}