class Camera1{
static boolean isConnected;
static int currentBrightness;
static int maxBrightness=15;
static int minBrightness;

public static void OnorOff(){
	//true==true
if(isConnected==false){
isConnected=true;
System.out.println("The Camera is on:"+isConnected);
}
else{
	isConnected=false;
System.out.println("the Camera is off:"+isConnected);
}
return;
}
public static  void increaseBrightness(){
	if(isConnected==true){
		if(currentBrightness<maxBrightness){
			currentBrightness=currentBrightness+1;
			System.out.println("Current Brightness:"+currentBrightness);
		}else{
			System.out.println("Maximum Brightness reached");
		}
		}else{
			System.out.println("turn on the camera");
		}
	}
	public static void decreaseBrightness(){
		if(isConnected==true){
			if(currentBrightness>minBrightness){
				currentBrightness=currentBrightness-1;
				System.out.println("Current Brightness:"+currentBrightness);
			}else{
				System.out.println("Minimum Brightness reached");
			}
		}else{
				System.out.println("Turn on the Camera");
			}
		}
public static void main(String []args){
OnorOff();
OnorOff();
OnorOff();
increaseBrightness();
increaseBrightness();
increaseBrightness();
increaseBrightness();
decreaseBrightness();
increaseBrightness();
decreaseBrightness();
decreaseBrightness();
decreaseBrightness();
}
}
