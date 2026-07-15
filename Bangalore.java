class Bangalore{
public static void main (String[]args){
int rajajinagarPincode=5660002;
int vijaynagarPincode=566640;
int nagarbhaviPincode=560072;
    int bangalorePincodes[]={rajajinagarPincode,
	vijaynagarPincode,nagarbhaviPincode};
	int p1=bangalorePincodes[0];
	int p2=bangalorePincodes[1];
	int p3=bangalorePincodes[2];
	System.out.println(bangalorePincodes[0]+" "+bangalorePincodes[1]+" "+bangalorePincodes[2]);
	//for-each
	for(int bangalorePin:bangalorePincodes){
	System.out.println(bangalorePin);
	}
	}
}