class HeadSet{
static boolean isConnected;
static int maxVolume=7;
static int minVolume;
static int currentVolume;

public static void OnorOff(){
//false==false

if(isConnected==false){
	  isConnected=true;
System.out.println("The Headset is Connected..."+ isConnected);
}
else{
isConnected=false;
System.out.println("The Headset is Disconnected..."+isConnected);
}
return;
}

public static void increaseVolume(){
if(isConnected==true){
	if(currentVolume<maxVolume){
		currentVolume=currentVolume+1;
		System.out.println("The Current volume:"+currentVolume);
	}else{
		System.out.println("Maximum volume reached");
	}
}else{
		System.out.println("Gubeee....turn on the music");
	}
}
public static void decreaseVolume(){
	if(isConnected==true){
		if(currentVolume>minVolume){
			currentVolume=currentVolume-1;
			System.out.println("the current Volume:"+currentVolume);
		}else{
			System.out.println("Minimum Volume reached");
		}
	}else{
		System.out.println("Gubeee....Turn on the TV");
	}
}
}