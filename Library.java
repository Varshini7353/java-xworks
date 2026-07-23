class Library{
static String libraryName;
static String location;
static int totalBooks;
static String librarianName;
static String category;
static double membershipFee;
static boolean hasDigitalLibrary;
static long contactNumber;

public static boolean createLibrary(String lName,String loc,int books,String librarian,String cat,double fee,
boolean digital,long mobile){
boolean isCreated = false;

boolean islibraryNameValid = false;
boolean islocationValid = false;
boolean istotalBooksValid = false;
boolean islibrarianNameValid = false;
boolean iscategoryValid = false;
boolean ismembershipFeeValid = false;
boolean ishasDigitalLibraryValid = false;
boolean iscontactNumberValid = false;


if(lName!=null && !lName.isEmpty()){
	libraryName=lName;
	islibraryNameValid=true;
}else System.out.println("Invalid library name");

if(loc!=null && !loc.isEmpty()){
	location=loc;
	islocationValid=true;
}else System.out.println("Invalid LOcation");

if(books!=0){
	totalBooks=books;
	istotalBooksValid=true;
}else System.out.println("Invalid total books");

if(librarian!=null && !librarian.isEmpty()){
	librarianName=librarian;
	islibrarianNameValid=true;
}else System.out.println("Invalid librarian Name");

if(cat!=null && !cat.isEmpty()){
	category=cat;
	iscategoryValid=true;
}else System.out.println("Invalid category");

if(fee!=0.0){
	membershipFee=fee;
	ismembershipFeeValid=true;
}else System.out.println("Invalid membershipFee");

if(digital!=false){
	hasDigitalLibrary=digital;
	ishasDigitalLibraryValid=true;
}else System.out.println("Invalid DigitalLibrary");

if(mobile!=0){
	contactNumber=mobile;
	iscontactNumberValid=true;
}else System.out.println("Invalid mobileNumber");


if(islibraryNameValid && islocationValid && istotalBooksValid &&  islibrarianNameValid && iscategoryValid==true 
&& ismembershipFeeValid && ishasDigitalLibraryValid  && iscontactNumberValid){
	
isCreated = true;
}

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