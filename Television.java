class Television{
static boolean isConnected;
static int currentVolume;
static int maxVolume=5;
static int minVolume;

public static void OnorOff(){
//true==true
if(isConnected==false){
isConnected=true;
System.out.println("The Tv gets Turnon:"+isConnected);
}
else{
isConnected=false;
System.out.println("The Tv gets Turnoff:"+isConnected);
}
}
public static void increaseVolume(){
	if (isConnected==true){
		if(currentVolume<maxVolume){
			currentVolume=currentVolume+1;
			System.out.println("The current Volume:"+currentVolume);
		}else{
			System.out.println("Maximum Volume reached");
		}
	}else{
			System.out.println("Turn of the Television.....");
		}
	}
public static void decreaseVolume(){
	if (isConnected==true){
		if(currentVolume>minVolume){
			currentVolume=currentVolume-1;
			System.out.println("The current Volume:"+currentVolume);
		}else{
			System.out.println("Minimum Volume reached");
		}
	}else{
			System.out.println("Turn of the Television.....");
		}
	}
public static void main(String []args){
	System.out.println(isConnected);
OnorOff();
increaseVolume();
increaseVolume();
increaseVolume();
decreaseVolume();
decreaseVolume();
}
}