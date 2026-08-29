class IplRunner{
	
	public static void main(String []args){
		
		Ipl ipl=new Ipl();
		
		Table table=new Table();
		
		Season season1=new Season();
		
		season1.seasonYear=2026;
		
		Season season2=new Season();
		season2.seasonYear=2025;
		
		Season season3=new Season();
		season3.seasonYear=2024;
		
		
		
		Teams teams=new Teams();
		teams.name="RCB";
		teams.noOfMatches=14;
		teams.won=9;
		teams.lost=5;
		teams.nrr="+0.783";
		teams.points=18;
		int lastFivercb[]={0,1,1,1,0};
	    teams.lastFiveMatches=lastFivercb;
		
		
		Teams teams1=new Teams();
		teams1.name="GT";
		teams1.noOfMatches=14;
		teams1.won=9;
		teams1.lost=5;
		teams1.nrr="+0.695";
		teams1.points=18;
		int last5forgt[]={1,1,1,0,1};
	    teams1.lastFiveMatches=last5forgt;
		
		
		Teams teams2=new Teams();
		teams2.name="SRH";
		teams2.noOfMatches=14;
		teams2.won=9;
		teams2.lost=5;
		teams2.nrr="+0.524";
		teams2.points=18;
		int last5forsrh[]={0,1,0,1,1};
	    teams2.lastFiveMatches=last5forsrh;
		
		
		Teams teams3=new Teams();
		teams3.name="RR";
		teams3.noOfMatches=14;
		teams3.won=8;
		teams3.lost=6;
		teams3.nrr="+0.189";
		teams3.points=16;
		int last5forsrr[]={0,0,0,1,1};
	    teams3.lastFiveMatches=last5forsrr;
		
		
		Teams teams4=new Teams();
		teams4.name="PBKS";
		teams4.noOfMatches=14;
		teams4.won=7;
		teams4.lost=6;
		teams4.nrr="+0.309";
		teams4.points=16;
		int last5forpbks[]={0,0,0,0,1};
	    teams4.lastFiveMatches=last5forpbks;
		
		Teams arrayOfTeamsForSeason1[] = {teams , teams1 , teams2 , teams3 , teams4 };
		
		
		
		season1.teams=arrayOfTeamsForSeason1;
		
		Teams t1=new Teams();
		t1.name="PBKS";
		t1.noOfMatches=14;
		t1.won=9;
		t1.lost=4;
		t1.nrr="+0.372";
		t1.points=19;
		int lastFivercb1[]={1,1,1,0,0};
	    t1.lastFiveMatches=lastFivercb1;
		
		
		Teams t2=new Teams();
		t2.name="RCB";
		t2.noOfMatches=14;
		t2.won=9;
		t2.lost=4;
		t2.nrr="+0.301";
		t2.points=19;
		int last5forgt2[]={1,1,0,0,1};
	    t2.lastFiveMatches=last5forgt2;
		
		
		Teams t3=new Teams();
		t3.name="GT";
		t3.noOfMatches=14;
		t3.won=9;
		t3.lost=5;
		t3.nrr="+0.254";
		t3.points=18;
		int last5forsrh3[]={1,1,1,0,0};
	    t3.lastFiveMatches=last5forsrh3;
		
		
		Teams t4=new Teams();
		t4.name="MI";
		t4.noOfMatches=14;
		t4.won=8;
		t4.lost=6;
		t4.nrr="+1.142";
		t4.points=16;
		int last5forsrh4[]={1,1,0,1,0};
	    t4.lastFiveMatches=last5forsrh4;
		
		
		Teams t5=new Teams();
		t5.name="DC";
		t5.noOfMatches=14;
		t5.won=7;
		t5.lost=6;
		t5.nrr="+0.011";
		t5.points=15;
		int last5forsrh5[]={0,0,0,0,1};
	    t5.lastFiveMatches=last5forsrh5;
		
		
		Teams arrayOfTeamsForSeason2[] = {t1,t2,t3,t4,t5};
		
		season2.teams = arrayOfTeamsForSeason2;
		
		
		Teams kkr =new Teams();
		kkr.name="KKR";
		kkr.noOfMatches=14;
		kkr.won=9;
		kkr.lost=3;
		kkr.nrr="+0.1428";
		kkr.points=20;
		int lastFivekkr[]={1,1,1,0,0};
	    kkr.lastFiveMatches=lastFivekkr;
		
		Teams srh=new Teams();
		srh.name="SRH";
		srh.noOfMatches=14;
		srh.won=8;
		srh.lost=5;
		srh.nrr="+0.414";
		srh.points=17;
		int lastFivesrh[]={1,0,1,0,1};
	    srh.lastFiveMatches=lastFivesrh;
		
		Teams rr=new Teams();
		rr.name="RR";
		rr.noOfMatches=14;
		rr.won=8;
		rr.lost=5;
		rr.nrr="+0.273";
		rr.points=17;
		int lastFiverr[]={1,1,1,0,0};
	    rr.lastFiveMatches=lastFiverr;
		
		Teams rcb=new Teams();
		rcb.name="RCB";
		rcb.noOfMatches=14;
		rcb.won=7;
		rcb.lost=7;
		rcb.nrr="+0.459";
		rcb.points=19;
		int last5rcb[]={1,1,1,1,1};
	    rcb.lastFiveMatches=last5rcb;
		
		Teams csk=new Teams();
		csk.name="CSK";
		csk.noOfMatches=14;
		csk.won=7;
		csk.lost=7;
		csk.nrr="+0.392";
		csk.points=14;
		int lastFivecsk1[]={0,1,0,1,0};
	    csk.lastFiveMatches=lastFivecsk1;
		
		Teams arrayOfTeamsForSeason3[] = {kkr,srh,rr,rcb,csk};
		
		season3.teams = arrayOfTeamsForSeason2;
		
		
		
		
		
		Season seasonsArray[] = {season1 , season2,season3};
		
		table.seasons= seasonsArray;
		
		ipl.table=table;
		
		ipl.getIplInfo();
	}
}