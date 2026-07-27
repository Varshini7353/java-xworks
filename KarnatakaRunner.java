class KarnatakaRunner{

    public static void main(String[] args){

        int []pinCodes=Karnataka.getPinCodesByCity("Madhugiri");
        System.out.println("Main Started");
		
		//for-each
		for(int pinCodeNames:pinCodes){
			System.out.println(pinCodeNames);
		}
		System.out.println("Main Ended");

    }
}