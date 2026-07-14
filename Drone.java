class Drone{
static boolean isConnected;
static int currentPhotos;
static int maxPhotos=8;

public static void OnorOff(){
//true==true
if(isConnected==false){
isConnected=true;
System.out.println("The Drone is Connected:"+isConnected);
}else{
isConnected=false;
System.out.println("The Drone is DisConnected:"+isConnected);
}
}
public static void capturePhoto(){
	if(isConnected==true){
		if(currentPhotos<maxPhotos){
			currentPhotos=currentPhotos+1;
		System.out.println("Photo captured SuccessFully:"+currentPhotos);
	}else{
		System.out.println("Memory Full");
	}
	}else{
		System.out.println("Turn on the Drone");
	}
	}
		
public static void main(String []aaa){
	System.out.println(isConnected);
	OnorOff();
	OnorOff();
    capturePhoto();
	capturePhoto();
	capturePhoto();
	
}
}
