class SmartWatch{
static boolean isConnected;
static int HeartRate;
static int maxRate=12;
static int minRate;

public static void OnorOff(){
//true==true
if(isConnected==false){
isConnected=true;
System.out.println("The watch is Connected:"+isConnected);
}else{
	isConnected=false;
System.out.println("The watch is Disconnected:"+isConnected);
}
}
public static void checkHeartRate(){
	if(HeartRate<maxRate){
		HeartRate=HeartRate+1;
		System.out.println("The HeartBeat is :"+HeartRate);
	}else{
		System.out.println("The HeartBeat Doesnt Match");
	}
}
}