class Agriculture{
public static void main(String[]aaa){
String primaryMachine = "Tractor";
String soilTool = "Plough";
String harvestingMachine = "Harvester";

String[] farmingTools = {
"tractor","plough",
"harvester","Cultivator","Seed Drill","Rotavator","Sprayer",
"Hoe","Sickle","Shovel","Spade","Rake","Wheelbarrow","Water Pump",
"Irrigation Pipe","Lawn Mower","Weeder","Threshing Machine",
"Power Tiller","Seed Spreader","Pruning Shears","Garden Fork",
"Hand Trowel","Pickaxe","Axe"};

System.out.println("  primaryMachine:" +primaryMachine );
 System.out.println(" soilTool:"+ soilTool);
 System.out.println(" harvestingMachine:"+harvestingMachine );
 System.out.println();
 
 //for-each
 
System.out.println("The farmingTools are:");
for(String agri:farmingTools){
System.out.println(agri);
}
}
}