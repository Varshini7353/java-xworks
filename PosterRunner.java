class PosterRunner{
	
	public static void main(String []args){
		
		Poster poster =new Poster();
		poster.posterId=101;
		poster.sizeId="A4";
		poster.colorId="Blue";
		poster.contentId="Java Programming";
		
		int posterId=poster.posterId;
		String sizeId=poster.sizeId;
		String colorId=poster.colorId;
		String contentId=poster.contentId;
		
		System.out.println("PosterId for the first copy:"+posterId);
		System.out.println("SizeId for the first copy:"+sizeId);
		System.out.println("ColorId for the first copy:"+colorId);
		System.out.println("ContentId for the first copy:"+contentId);
		System.out.println("--------------------------------------");
		
		
		Poster poster1=new Poster();
		poster1.posterId=102;
		poster1.sizeId="A2";
		poster1.colorId="Red";
		poster1.contentId="AI Workshop";
		
		int posterId1=poster1.posterId;
		String sizeId1=poster1.sizeId;
		String colorId1=poster1.colorId;
		String contentId1=poster1.contentId;
		
		System.out.println("PosterId for the second copy:"+posterId1);
		System.out.println("SizeId for the second copy :"+sizeId1);
		System.out.println("ColorId for the second copy:"+colorId1);
		System.out.println("ContentId for the second copy:"+contentId1);
		System.out.println("-----------------------------------");
		
		
		Poster poster2=new Poster();
		poster2.posterId=104;
		poster2.sizeId="A3";
		poster2.colorId="Black";
		poster2.contentId="Motivational Quotes";
		
		int posterId2=poster2.posterId;
		String sizeId2=poster2.sizeId;
		String colorId2=poster2.colorId;
		String contentId2=poster2.contentId;
		
		System.out.println("PosterId for the third copy:"+posterId2);
		System.out.println("SizeId for the third copy:"+sizeId2);
		System.out.println("ColorId for the third copy:"+colorId2);
		System.out.println("Content for the third copy:"+contentId2);
	}
}