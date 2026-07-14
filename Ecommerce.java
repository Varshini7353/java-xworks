class Ecommerce{
public static void main(String []jam){
String electronicItem = "Laptop";
String mobileDevice = "Smartphone";
String audioDevice = "Headphones";

String[] products = {
"laptop","smartphone","headphones","Smart Watch","Bluetooth Speaker",
"Tablet","Keyboard","Mouse","Monitor","Printer","Power Bank",
"USB Flash Drive","External Hard Disk","Webcam","Microphone",
"Gaming Chair","Router","WiFi Extender","Digital Camera",
"Projector","Television","Air Conditioner","Refrigerator",
"Washing Machine","Microwave Oven"};

System.out.println(" the electronicItem:" +electronicItem );
 System.out.println(" themobileDevice:"+ mobileDevice);
 System.out.println("the audioDevice:"+audioDevice );
 System.out.println();
 
 //for-each
 
System.out.println("The ecommerce products are:");
for(String ecom:products){
System.out.println(ecom);
}
}
}