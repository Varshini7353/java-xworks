class ThinkPadRunner {

    public static void main(String[] args) {

        ThinkPad t1 = new ThinkPad("Lenovo", "ThinkPad E14", "Black", "Intel Core i5",
        "Windows 11", "14 inch", 16, 512, 65000, false);
        t1.getThinkPadDetails();
        System.out.println("---------------------------");


        ThinkPad t2 = new ThinkPad("Lenovo", "ThinkPad T14", "Black", "Intel Core i7",
        "Windows 11", "14 inch", 16, 1024, 95000, false);
        t2.getThinkPadDetails();
        System.out.println("---------------------------");


        ThinkPad t3 = new ThinkPad("Lenovo", "ThinkPad X1 Carbon", "Black", "Intel Core i7",
        "Windows 11", "14 inch", 32, 1024, 125000, false);
        t3.getThinkPadDetails();
    }
}