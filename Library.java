class Library{
static String libraryName;
static String location;
static int totalBooks;
static String librarianName;
static String category;
static double membershipFee;
static boolean hasDigitalLibrary;
static long contactNumber;

public static boolean createLibrary(String lName,String loc,int books,String librarian,String cat,double fee,boolean digital,long mobile){
boolean isCreated = false;

libraryName = lName;
location = loc;
totalBooks = books;
librarianName = librarian;
category = cat;
membershipFee = fee;
hasDigitalLibrary = digital;
contactNumber = mobile;

isCreated = true;
return isCreated;
}

public static void getLibraryDetails(){
System.out.println("Library Name : " + libraryName);
System.out.println("Location : " + location);
System.out.println("Total Books : " + totalBooks);
System.out.println("Librarian Name : " + librarianName);
System.out.println("Category : " + category);
System.out.println("Membership Fee : " + membershipFee);
System.out.println("Has Digital Library : " + hasDigitalLibrary);
System.out.println("Contact Number : " + contactNumber);
System.out.println("------------------------------------");
}
}