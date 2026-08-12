class V{
	
	
	V(){
		System.out.println("consrtuctor invokes");
	}
		
	
	public static void main(String[] oooo){
		System.out.println("Main started");
		//object creation
		V v=new V();
		v.m1();
		System.out.println("Main ended");	
	}
	
	void m1(){
		//stack overflow
		System.out.println("m1 started");
		System.out.println("m1 ended");
		}
	}
	
