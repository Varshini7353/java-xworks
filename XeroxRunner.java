class XeroxRunner {

    public static void main(String[] args) {

        Xerox x1 = new Xerox("Canon", "IR2006N", "White", "Multifunction","Laser", "A4", 250,
		20.5, 45000, true);
        x1.getXeroxDetails();
        System.out.println("---------------------------");


        Xerox x2 = new Xerox("HP", "LaserJet Pro", "Black", "Multifunction", "Laser", "A4", 300,
		25.0, 55000, true);
        x2.getXeroxDetails();
        System.out.println("---------------------------");


        Xerox x3 = new Xerox("Epson", "EcoTank", "White", "Printer","Inkjet", "A4", 150, 15.0, 
		30000, true);
        x3.getXeroxDetails();
    }
}