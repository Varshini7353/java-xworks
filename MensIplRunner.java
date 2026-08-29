class MensIplRunner{
	
	public static void main(String []args){
		
		MensIpl mens=new MensIpl();
		
		Tables tables=new Tables();
		
		Seasons season=new Seasons();
		season.seasonYear=2008;
		
		Seasons s2009=new Seasons();
		s2009.seasonYear=2009;
		
		Seasons s2010=new Seasons();
		s2010.seasonYear=2010;
		
		Seasons s2011=new Seasons();
		s2011.seasonYear=2011;
		
		Seasons s2012=new Seasons();
		s2012.seasonYear=2012;
		
		Seasons s2013=new Seasons();
		s2013.seasonYear=2013;
		
		Seasons s2014=new Seasons();
		s2014.seasonYear=2014;
		
		Seasons s2015=new Seasons();
		s2015.seasonYear=2015;
		
		Seasons s2016=new Seasons();
		s2016.seasonYear=2016;
		
		Seasons s2017=new Seasons();
		s2017.seasonYear=2017;
		
		Seasons s2018=new Seasons();
		s2018.seasonYear=2018;
		
		Seasons s2019=new Seasons();
		s2019.seasonYear=2019;
		
		Seasons s2020=new Seasons();
		s2020.seasonYear=2020;
		
		Seasons s2021=new Seasons();
		s2021.seasonYear=2021;
		
		Seasons s2022=new Seasons();
		s2022.seasonYear=2022;

		Seasons s2023=new Seasons();
		s2023.seasonYear=2023;
		
		Seasons s2024=new Seasons();
		s2024.seasonYear=2024;
		
		Seasons s2025=new Seasons();
		s2025.seasonYear=2025;
		
		Seasons s2026=new Seasons();
		s2026.seasonYear=2026;
		
		
		Match match=new Match();
		
		match.teamName="RR";
		match.played=14;
		match.won=11;
		match.lost=3;
		match.points=22;
		match.nrr="+0.632";
		
		Match punjab=new Match();
		
		punjab.teamName="KXP";
		punjab.played=14;
		punjab.won=10;
		punjab.lost=4;
		punjab.points=20;
		punjab.nrr="+0.509";
		
		Match csk=new Match();
		
		csk.teamName="CSK";
		csk.played=14;
		csk.won=8;
		csk.lost=6;
		csk.points=16;
		csk.nrr="-0.192";
		
		Match dd=new Match();
		
		dd.teamName="DD";
		dd.played=14;
		dd.won=7;
		dd.lost=6;
		dd.points=15;
		dd.nrr="+0.342";
		
		Match mi=new Match();
		
		mi.teamName="MI";
		mi.played=14;
		mi.won=7;
		mi.lost=7;
		mi.points=14;
		mi.nrr="+0.570";
		
		Match kkr=new Match();
		
		kkr.teamName="KKR";
		kkr.played=14;
		kkr.won=6;
		kkr.lost=7;
		kkr.points=13;
		kkr.nrr="-0.147";
		
		Match rcb=new Match();
		
		rcb.teamName="RCB";
		rcb.played=14;
		rcb.won=4;
		rcb.lost=10;
		rcb.points=8;
		rcb.nrr="-1.160";
		
		Match dc=new Match();
		
		dc.teamName="DC";
		dc.played=14;
		dc.won=2;
		dc.lost=12;
		dc.points=4;
		dc.nrr="-0.467";
		
		
		Match arrayofMatch[]={match,punjab,csk,dd,mi,kkr,rcb,dc};
		
		
		season.match=arrayofMatch;
		
		
		
		
		Match dd2009=new Match();
		
		dd2009.teamName="DD";
		dd2009.played=14;
		dd2009.won=10;
		dd2009.lost=4;
		dd2009.points=20;
		dd2009.nrr="+0.311";
		
		Match csk2009=new Match();
		
		csk2009.teamName="CSK";
		csk2009.played=14;
		csk2009.won=8;
		csk2009.lost=5;
		csk2009.points=17;
		csk2009.nrr="+0.951";
		
		Match rcb2009=new Match();
		
		rcb2009.teamName="RCB";
		rcb2009.played=14;
		rcb2009.won=8;
		rcb2009.lost=6;
		rcb2009.points=16;
		rcb2009.nrr="-0.191";
		
		Match dc2009=new Match();
		
		dc2009.teamName="DC";
		dc2009.played=14;
		dc2009.won=7;
		dc2009.lost=7;
		dc2009.points=14;
		dc2009.nrr="+0.203";
		
		Match kp2009=new Match();
		
		kp2009.teamName="KP";
		kp2009.played=14;
		kp2009.won=7;
		kp2009.lost=7;
		kp2009.points=14;
		kp2009.nrr="-0.483";
		
		Match rr2009=new Match();
		
		rr2009.teamName="RR";
		rr2009.played=14;
		rr2009.won=6;
		rr2009.lost=7;
		rr2009.points=13;
		rr2009.nrr="-0.352";
		
		Match mi2009=new Match();
		
		mi2009.teamName="MI";
		mi2009.played=14;
		mi2009.won=5;
		mi2009.lost=8;
		mi2009.points=11;
		mi2009.nrr="+0.297";
		
		Match kkr2009=new Match();
		
		kkr2009.teamName="KKR";
		kkr2009.played=14;
		kkr2009.won=3;
		kkr2009.lost=10;
		kkr2009.points=7;
		kkr2009.nrr="-0.789";
		
		Match arrayofMatch2009[]={dd2009,csk2009,rcb2009,dc2009,kp2009,rr2009,mi2009,kkr2009};
		
		
		s2009.match=arrayofMatch2009;
		
		
		
		Match mi2010=new Match();
		
		mi2010.teamName="MI";
		mi2010.played=14;
		mi2010.won=10;
		mi2010.lost=4;
		mi2010.points=20;
		mi2010.nrr="+1.084";
		
		Match dec2010=new Match();
		
		dec2010.teamName="DEC";
		dec2010.played=14;
		dec2010.won=8;
		dec2010.lost=6;
		dec2010.points=16;
		dec2010.nrr="-0.297";
		
		Match csk2010=new Match();
		
		csk2010.teamName="CSK";
		csk2010.played=14;
		csk2010.won=7;
		csk2010.lost=7;
		csk2010.points=14;
		csk2010.nrr="+0.274";
		
		
		Match rcb2010=new Match();
		
		rcb2010.teamName="RCB";
		rcb2010.played=14;
		rcb2010.won=7;
		rcb2010.lost=7;
		rcb2010.points=14;
		rcb2010.nrr="+0.219";
		
		Match dd2010=new Match();
		
		dd2010.teamName="DD";
		dd2010.played=14;
		dd2010.won=7;
		dd2010.lost=7;
		dd2010.points=14;
		dd2010.nrr="+0.021";
		
		
		Match kkr2010=new Match();
		
		kkr2010.teamName="KKR";
		kkr2010.played=14;
		kkr2010.won=7;
		kkr2010.lost=7;
		kkr2010.points=14;
		kkr2010.nrr="-0.341";
		
		
		Match rr2010=new Match();
		
		rr2010.teamName="RR";
		rr2010.played=14;
		rr2010.won=6;
		rr2010.lost=8;
		rr2010.points=12;
		rr2010.nrr="-0.514";
		
		
		Match KXIP2010=new Match();
		
		KXIP2010.teamName="KXIP";
		KXIP2010.played=14;
		KXIP2010.won=4;
		KXIP2010.lost=10;
		KXIP2010.points=8;
		KXIP2010.nrr="-0.478";
		
		Match arrayofMatch2010[]={mi2010,dec2010,csk2010,rcb2010,dd2010,kkr2010,rr2010,KXIP2010};
		
		
		s2010.match=arrayofMatch2010;
		
		
		
		Match rcb2011=new Match();
		
		rcb2011.teamName="RCB";
		rcb2011.played=14;
		rcb2011.won=9;
		rcb2011.lost=4;
		rcb2011.points=19;
		rcb2011.nrr="+0.326";
		
		Match csk2011=new Match();
		
		csk2011.teamName="CSK";
		csk2011.played=14;
		csk2011.won=9;
		csk2011.lost=5;
		csk2011.points=19;
		csk2011.nrr="+0.443";
		
		Match mi2011=new Match();
		
		mi2011.teamName="MI";
		mi2011.played=14;
		mi2011.won=9;
		mi2011.lost=5;
		mi2011.points=18;
		mi2011.nrr="+0.040";
		
		Match kkr2011=new Match();
		
		kkr2011.teamName="KKR";
		kkr2011.played=14;
		kkr2011.won=8;
		kkr2011.lost=6;
		kkr2011.points=16;
		kkr2011.nrr="+0.433";
		
		Match KXIP2011=new Match();
		
		KXIP2011.teamName="KXIP";
		KXIP2011.played=14;
		KXIP2011.won=7;
		KXIP2011.lost=7;
		KXIP2011.points=14;
		KXIP2011.nrr="-0.051";
		
		Match rr2011=new Match();
		
		rr2011.teamName="RR";
		rr2011.played=14;
		rr2011.won=6;
		rr2011.lost=7;
		rr2011.points=13;
		rr2011.nrr="-0.691";
		
		
		Match dc2011=new Match();
		
		dc2011.teamName="DC";
		dc2011.played=14;
		dc2011.won=6;
		dc2011.lost=8;
		dc2011.points=12;
		dc2011.nrr="+0.222";
		
		Match ktk2011=new Match();
		
		ktk2011.teamName="KTK";
		ktk2011.played=14;
		ktk2011.won=6;
		ktk2011.lost=8;
		ktk2011.points=12;
		ktk2011.nrr="-0.134";
		
		
		Match pwi2011=new Match();
		
		pwi2011.teamName="PWI";
		pwi2011.played=14;
		pwi2011.won=4;
		pwi2011.lost=9;
		pwi2011.points=9;
		pwi2011.nrr="-0.134";
		
		Match dd2011=new Match();
		
		dd2011.teamName="DD";
		dd2011.played=14;
		dd2011.won=4;
		dd2011.lost=9;
		dd2011.points=9;
		dd2011.nrr="-0.448";
		
		Match arrayofMatch2011[]={rcb2011,csk2011,mi2011,kkr2011,rr2011,dc2011,ktk2011,pwi2011,dd2011};
		
		
		s2011.match=arrayofMatch2011;
		
		Match dd2012=new Match();
		
		dd2012.teamName="DD";
		dd2012.played=16;
		dd2012.won=11;
		dd2012.lost=5;
		dd2012.points=22;
		dd2012.nrr="+0.617";
		
		
		Match kkr2012=new Match();
		
		kkr2012.teamName="KKR";
		kkr2012.played=16;
		kkr2012.won=10;
		kkr2012.lost=5;
		kkr2012.points=21;
		kkr2012.nrr="+0.561";
		
		Match mi2012=new Match();
		
		mi2012.teamName="MI";
		mi2012.played=16;
		mi2012.won=10;
		mi2012.lost=6;
		mi2012.points=20;
		mi2012.nrr="-0.100";
		
		
		Match csk2012=new Match();
		
		csk2012.teamName="CSK";
		csk2012.played=16;
		csk2012.won=8;
		csk2012.lost=7;
		csk2012.points=17;
		csk2012.nrr="+0.100";

		
		Match rcb2012=new Match();
		
		rcb2012.teamName="RCB";
		rcb2012.played=16;
		rcb2012.won=8;
		rcb2012.lost=7;
		rcb2012.points=17;
		rcb2012.nrr="-0.022";
		
		
		Match KXIP2012=new Match();
		
		KXIP2012.teamName="KXIP";
		KXIP2012.played=16;
		KXIP2012.won=8;
		KXIP2012.lost=8;
		KXIP2012.points=16;
		KXIP2012.nrr="-0.216";
		
		
		Match rr2012=new Match();
		
		rr2012.teamName="RR";
		rr2012.played=16;
		rr2012.won=7;
		rr2012.lost=8;
		rr2012.points=14;
		rr2012.nrr="-0.201";
		
		
		Match dc2012=new Match();
		
		dc2012.teamName="DC";
		dc2012.played=16;
		dc2012.won=4;
		dc2012.lost=11;
		dc2012.points=9;
		dc2012.nrr="-0509";
		
		
		Match pwi2012=new Match();
		
		pwi2012.teamName="PWI";
		pwi2012.played=16;
		pwi2012.won=4;
		pwi2012.lost=12;
		pwi2012.points=8;
		pwi2012.nrr="-0.551";
		
		
		Match arrayofMatch2012[]={dd2012,kkr2012,mi2012,csk2012,rcb2012,KXIP2012,rr2012,dc2012,pwi2012};
		
		
		s2012.match=arrayofMatch2012;
		
		
		Match csk2013=new Match();
		
		csk2013.teamName="CSK";
		csk2013.played=16;
		csk2013.won=11;
		csk2013.lost=5;
		csk2013.points=22;
		csk2013.nrr="+0.530";
		
		Match mi2013=new Match();
		
		mi2013.teamName="MI";
		mi2013.played=16;
		mi2013.won=11;
		mi2013.lost=5;
		mi2013.points=22;
		mi2013.nrr="+0.441";
		
		Match rr2013=new Match();
		
		rr2013.teamName="RR";
		rr2013.played=16;
		rr2013.won=10;
		rr2013.lost=6;
		rr2013.points=20;
		rr2013.nrr="+0.441";
		
		
		Match srh2013=new Match();
		
		srh2013.teamName="SRH";
		srh2013.played=16;
		srh2013.won=10;
		srh2013.lost=6;
		srh2013.points=20;
		srh2013.nrr="+0.003";
		
		
		Match rcb2013=new Match();
		
		rcb2013.teamName="RCB";
		rcb2013.played=16;
		rcb2013.won=9;
		rcb2013.lost=7;
		rcb2013.points=18;
		rcb2013.nrr="+0.457";
		
		
		Match KXIP2013=new Match();
		
		KXIP2013.teamName="KXIP";
		KXIP2013.played=16;
		KXIP2013.won=8;
		KXIP2013.lost=8;
		KXIP2013.points=16;
		KXIP2013.nrr="+0.226";
		
		
		Match kkr2013=new Match();
		
		kkr2013.teamName="KKR";
		kkr2013.played=16;
		kkr2013.won=6;
		kkr2013.lost=10;
		kkr2013.points=12;
		kkr2013.nrr="-0.095";
		
		Match pwi2013=new Match();
		
		pwi2013.teamName="PWI";
		pwi2013.played=16;
		pwi2013.won=4;
		pwi2013.lost=12;
		pwi2013.points=8;
		pwi2013.nrr="-1.006";
		
		Match dd2013=new Match();
		
		dd2013.teamName="DD";
		dd2013.played=16;
		dd2013.won=3;
		dd2013.lost=13;
		dd2013.points=6;
		dd2013.nrr="-0.848";
		
		
		Match arrayofMatch2013[]={csk2013,mi2013,rr2013,srh2013,rcb2013,KXIP2013,kkr2013,pwi2013,dd2013};
		
		
		s2013.match=arrayofMatch2013;
		
		
		Match KXIP2014=new Match();
		
		KXIP2014.teamName="KXIP";
		KXIP2014.played=14;
		KXIP2014.won=11;
		KXIP2014.lost=3;
		KXIP2014.points=22;
		KXIP2014.nrr="+0.968";
		
		Match kkr2014=new Match();
		
		kkr2014.teamName="KKR";
		kkr2014.played=14;
		kkr2014.won=9;
		kkr2014.lost=5;
		kkr2014.points=18;
		kkr2014.nrr="+0.968";
		
		Match csk2014=new Match();
		
		csk2014.teamName="CSK";
		csk2014.played=14;
		csk2014.won=9;
		csk2014.lost=5;
		csk2014.points=18;
		csk2014.nrr="+0.385";
		
		Match mi2014=new Match();
		
		mi2014.teamName="MI";
		mi2014.played=14;
		mi2014.won=7;
		mi2014.lost=7;
		mi2014.points=14;
		mi2014.nrr="+0.095";
		
		Match rr2014=new Match();
		
		rr2014.teamName="RR";
		rr2014.played=14;
		rr2014.won=7;
		rr2014.lost=7;
		rr2014.points=14;
		rr2014.nrr="+0.060";
		
		Match srh2014=new Match();
		
		srh2014.teamName="SRH";
		srh2014.played=14;
		srh2014.won=6;
		srh2014.lost=8;
		srh2014.points=12;
		srh2014.nrr="-0.399";
		
		Match rcb2014=new Match();
		
		rcb2014.teamName="RCB";
		rcb2014.played=14;
		rcb2014.won=5;
		rcb2014.lost=9;
		rcb2014.points=10;
		rcb2014.nrr="-0.428";
		
		Match dd2014=new Match();
		
		dd2014.teamName="DD";
		dd2014.played=14;
		dd2014.won=2;
		dd2014.lost=12;
		dd2014.points=4;
		dd2014.nrr="-0.428";
		
		
		Match arrayofMatch2014[]={KXIP2014,kkr2014,csk2014,mi2014,rr2014,srh2014,rcb2014,dd2014};
		
		
		s2014.match=arrayofMatch2014;
		
		
		Match csk2015=new Match();
		
		csk2015.teamName="CSK";
		csk2015.played=14;
		csk2015.won=9;
		csk2015.lost=5;
		csk2015.points=18;
		csk2015.nrr="+0.709";
		int last5csk2015[]={1,0,1,0,1};
		csk2015.last5match=last5csk2015;
		
		Match mi2015=new Match();
		
		mi2015.teamName="MI";
		mi2015.played=14;
		mi2015.won=8;
		mi2015.lost=6;
		mi2015.points=16;
		mi2015.nrr="-0.043";
		int last5mi2015[]={1,1,0,1,1};
		mi2015.last5match=last5mi2015;
		
		Match rcb2015=new Match();
		
		rcb2015.teamName="RCB";
		rcb2015.played=14;
		rcb2015.won=7;
		rcb2015.lost=5;
		rcb2015.points=16;
		rcb2015.nrr="+1.037";
		int last5rcb2015[]={1,1,0,1,0};
		rcb2015.last5match=last5rcb2015;
		
		
		Match rr2015=new Match();
		
		rr2015.teamName="RR";
		rr2015.played=14;
		rr2015.won=7;
		rr2015.lost=5;
		rr2015.points=16;
		rr2015.nrr="+0.062";
		int last5rr2015[]={0,1,0,0,1};
		rr2015.last5match=last5rr2015;
		
		Match kkr2015=new Match();
		
		kkr2015.teamName="KKR";
		kkr2015.played=14;
		kkr2015.won=7;
		kkr2015.lost=6;
		kkr2015.points=15;
		kkr2015.nrr="+0.253";
		int last5kkr2015[]={1,1,1,0,0};
		kkr2015.last5match=last5kkr2015;
		
		Match srh2015=new Match();
		
		srh2015.teamName="SRH";
		srh2015.played=14;
		srh2015.won=7;
		srh2015.lost=7;
		srh2015.points=14;
		srh2015.nrr="-0.239";
		int last5srh2015[]={1,1,1,0,0};
		srh2015.last5match=last5srh2015;
		
		Match dc2015=new Match();
		
		dc2015.teamName="DC";
		dc2015.played=16;
		dc2015.won=5;
		dc2015.lost=8;
		dc2015.points=11;
		dc2015.nrr="-0.049";
		int last5dc2015[]={0,0,0,1,0};
		dc2015.last5match=last5dc2015;
		
		Match pbk2015=new Match();
		
		pbk2015.teamName="PBKS";
		pbk2015.played=14;
		pbk2015.won=3;
		pbk2015.lost=11;
		pbk2015.points=6;
		pbk2015.nrr="-1.436";
		int last5pbk2015[]={0,0,0,1,0};
		pbk2015.last5match=last5pbk2015;
		
		
		Match arrayofMatch2015[]={csk2015,mi2015,rcb2015,rr2015,kkr2015,srh2015,dc2015,pbk2015};
		
		
		s2015.match=arrayofMatch2015;
		
		
		Match gl2016=new Match();
		
		gl2016.teamName="GL";
		gl2016.played=14;
		gl2016.won=9;
		gl2016.lost=5;
		gl2016.points=18;
		gl2016.nrr="-0.374";
		int last5gl2016[]={0,1,0,1,1};
		gl2016.last5match=last5gl2016;
		
		Match rcb2016=new Match();
		
		rcb2016.teamName="RCB";
		rcb2016.played=14;
		rcb2016.won=8;
		rcb2016.lost=6;
		rcb2016.points=16;
		rcb2016.nrr="+0.932";
		int last5rcb2016[]={0,1,1,1,1};
		rcb2016.last5match=last5rcb2016;
		
		Match srh2016=new Match();
		
		srh2016.teamName="SRH";
		srh2016.played=14;
		srh2016.won=8;
		srh2016.lost=6;
		srh2016.points=16;
		srh2016.nrr="+0.245";
		int last5srh2016[]={1,0,1,1,1};
		srh2016.last5match=last5srh2016;
		
		Match kkr2016=new Match();
		
		kkr2016.teamName="KKR";
		kkr2016.played=14;
		kkr2016.won=8;
		kkr2016.lost=6;
		kkr2016.points=16;
		kkr2016.nrr="+0.106";
		int last5kkr2016[]={0,1,0,0,1};
		kkr2016.last5match=last5kkr2016;
		
		Match mi2016=new Match();
		
		mi2016.teamName="MI";
		mi2016.played=14;
		mi2016.won=7;
		mi2016.lost=7;
		mi2016.points=14;
		mi2016.nrr="-0.146";
		int last5mi2016[]={1,1,0,1,1};
		mi2016.last5match=last5mi2016;
		
		
		Match dc2016=new Match();
		
		dc2016.teamName="DC";
		dc2016.played=14;
		dc2016.won=7;
		dc2016.lost=7;
		dc2016.points=14;
		dc2016.nrr="-0.155";
		int last5dc2016[]={1,0,0,1,0};
		dc2016.last5match=last5dc2016;
		
		Match rps2016=new Match();
		
		rps2016.teamName="RPS";
		rps2016.played=14;
		rps2016.won=7;
		rps2016.lost=7;
		rps2016.points=14;
		rps2016.nrr="-0.155";
		int last5rps2016[]={0,0,0,1,1};
		rps2016.last5match=last5rps2016;
		
		Match pbk2016=new Match();
		
		pbk2016.teamName="PBKS";
		pbk2016.played=14;
		pbk2016.won=4;
		pbk2016.lost=10;
		pbk2016.points=8;
		pbk2016.nrr="-0.015";
		int last5pbk2016[]={0,1,0,0,0};
		pbk2016.last5match=last5pbk2016;
		
		Match arrayofMatch2016[]={gl2016,rcb2016,srh2016,kkr2016,kkr2016,mi2016,dc2016,rps2016,pbk2016};
		
		
		s2016.match=arrayofMatch2016;
		
		
		Match mi2017=new Match();
		
		mi2017.teamName="MI";
		mi2017.played=14;
		mi2017.won=10;
		mi2017.lost=4;
		mi2017.points=20;
		mi2017.nrr="+0.784";
		int last5mi2017[]={1,1,0,0,1};
		mi2017.last5match=last5mi2017;
		
		Match rps2017=new Match();
		
		rps2017.teamName="RPS";
		rps2017.played=14;
		rps2017.won=9;
		rps2017.lost=5;
		rps2017.points=18;
		rps2017.nrr="+0.176";
		int last5rps2017[]={1,1,1,0,1};
		rps2017.last5match=last5rps2017;
		
		Match srh2017=new Match();
		
		srh2017.teamName="SRH";
		srh2017.played=14;
		srh2017.won=8;
		srh2017.lost=5;
		srh2017.points=17;
		srh2017.nrr="+0.599";
		int last5srh2017[]={1,0,0,1,1};
		srh2017.last5match=last5srh2017;
		
		Match kkr2017=new Match();
		
		kkr2017.teamName="KKR";
		kkr2017.played=14;
		kkr2017.won=8;
		kkr2017.lost=6;
		kkr2017.points=16;
		kkr2017.nrr="+0.641";
		int last5kkr2017[]={0,0,1,0,0};
		kkr2017.last5match=last5kkr2017;
		
		Match pbk2017=new Match();
		
		pbk2017.teamName="PBKS";
		pbk2017.played=14;
		pbk2017.won=7;
		pbk2017.lost=7;
		pbk2017.points=14;
		pbk2017.nrr="-0.009";
		int last5pbk2017[]={1,0,1,1,0};
		pbk2017.last5match=last5pbk2017;
		
		Match dc2017=new Match();
		
		dc2017.teamName="DC";
		dc2017.played=14;
		dc2017.won=6;
		dc2017.lost=8;
		dc2017.points=12;
		dc2017.nrr="-0.512";
		int last5dc2017[]={1,0,1,1,0};
		dc2017.last5match=last5dc2017;
	
		Match gl2017=new Match();
		
		gl2017.teamName="GL";
		gl2017.played=14;
		gl2017.won=4;
		gl2017.lost=10;
		gl2017.points=8;
		gl2017.nrr="-0.412";
		int last5gl2017[]={0,0,1,0,0};
		gl2017.last5match=last5gl2017;
		
		Match rcb2017=new Match();
		
		rcb2017.teamName="RCB";
		rcb2017.played=14;
		rcb2017.won=3;
		rcb2017.lost=10;
		rcb2017.points=7;
		rcb2017.nrr="-1.299";
		int last5rcb2017[]={0,0,0,0,1};
		rcb2017.last5match=last5rcb2017;
		
		Match arrayofMatch2017[]={mi2017,rps2017,srh2017,kkr2017,pbk2017,dc2017,gl2017,rcb2017};
		
		
		s2017.match=arrayofMatch2017;
		
		
		
		Match srh2018=new Match();
		
		srh2018.teamName="SRH";
		srh2018.played=14;
		srh2018.won=9;
		srh2018.lost=5;
		srh2018.points=18;
		srh2018.nrr="+0.284";
		int last5srh2018[]={1,1,0,0,0};
		srh2018.last5match=last5srh2018;
		
		
		Match csk2018=new Match();
		
		csk2018.teamName="CSK";
		csk2018.played=14;
		csk2018.won=9;
		csk2018.lost=5;
		csk2018.points=18;
		csk2018.nrr="+0.253";
		int last5csk2018[]={1,0,1,0,1};
		csk2018.last5match=last5csk2018;
		
		Match kkr2018=new Match();
		
		kkr2018.teamName="KKR";
		kkr2018.played=14;
		kkr2018.won=8;
		kkr2018.lost=6;
		kkr2018.points=16;
		kkr2018.nrr="-0.070";
		int last5kkr2018[]={0,0,1,1,1};
		kkr2018.last5match=last5kkr2018;
		
		Match rr2018=new Match();
		
		rr2018.teamName="RR";
		rr2018.played=14;
		rr2018.won=7;
		rr2018.lost=7;
		rr2018.points=16;
		rr2018.nrr="-0.250";
		int last5rr2018[]={1,1,1,0,1};
		rr2018.last5match=last5rr2018;
		
		Match mi2018=new Match();
		
		mi2018.teamName="MI";
		mi2018.played=14;
		mi2018.won=6;
		mi2018.lost=8;
		mi2018.points=12;
		mi2018.nrr="+0.317";
		int last5mi2018[]={1,1,0,1,0};
		mi2018.last5match=last5mi2018;
		
		Match rcb2018=new Match();
		
		rcb2018.teamName="RCB";
		rcb2018.played=14;
		rcb2018.won=6;
		rcb2018.lost=8;
		rcb2018.points=12;
		rcb2018.nrr="+1.129";
		int last5rcb2018[]={0,1,1,1,0};
		rcb2018.last5match=last5rcb2018;
		
		Match pbk2018=new Match();
		
		pbk2018.teamName="PBKS";
		pbk2018.played=14;
		pbk2018.won=6;
		pbk2018.lost=8;
		pbk2018.points=12;
		pbk2018.nrr="-0.502";
		int last5pbk2018[]={0,0,0,0,0};
		pbk2018.last5match=last5pbk2018;
		
		Match dc2018=new Match();
		
		dc2018.teamName="DC";
		dc2018.played=14;
		dc2018.won=5;
		dc2018.lost=9;
		dc2018.points=10;
		dc2018.nrr="-0.222";
		int last5dc2018[]={0,0,0,1,1};
		dc2018.last5match=last5dc2018;
		
		
		Match arrayofMatch2018[]={srh2018,csk2018,kkr2018,rr2018,mi2018,rcb2018,pbk2018,dc2018};
		
		
		s2018.match=arrayofMatch2018;
		
		
		Match mi2019=new Match();
		
		mi2019.teamName="MI";
		mi2019.played=14;
		mi2019.won=9;
		mi2019.lost=5;
		mi2019.points=18;
		mi2019.nrr="+0.421";
		int last5mi2019[]={0,1,0,1,1};
		mi2019.last5match=last5mi2019;
		
		Match csk2019=new Match();
		
		csk2019.teamName="CSK";
		csk2019.played=14;
		csk2019.won=9;
		csk2019.lost=5;
		csk2019.points=18;
		csk2019.nrr="+0.131";
		int last5csk2019[]={0,1,0,1,0};
		csk2019.last5match=last5csk2019;
		
		Match dc2019=new Match();
		
		dc2019.teamName="DC";
		dc2019.played=14;
		dc2019.won=9;
		dc2019.lost=5;
		dc2019.points=18;
		dc2019.nrr="+0.044";
		int last5dc2019[]={1,1,1,0,1};
		dc2019.last5match=last5dc2019;
		
		
		Match srh2019=new Match();
		
		srh2019.teamName="SRH";
		srh2019.played=14;
		srh2019.won=6;
		srh2019.lost=8;
		srh2019.points=12;
		srh2019.nrr="+0.577";
		int last5srh2019[]={0,0,1,0,0};
		srh2019.last5match=last5srh2019;
		
		Match kkr2019=new Match();
		
		kkr2019.teamName="KKR";
		kkr2019.played=14;
		kkr2019.won=6;
		kkr2019.lost=8;
		kkr2019.points=12;
		kkr2019.nrr="+0.028";
		int last5kkr2019[]={0,0,1,1,0};
		kkr2019.last5match=last5kkr2019;
		
		
		Match pbk2019=new Match();
		
		pbk2019.teamName="PBKS";
		pbk2019.played=14;
		pbk2019.won=6;
		pbk2019.lost=8;
		pbk2019.points=12;
		pbk2019.nrr="-0.251";
		int last5pbk2019[]={0,0,0,0,0};
		pbk2019.last5match=last5pbk2019;
		
		Match rr2019=new Match();
		
		rr2019.teamName="RR";
		rr2019.played=14;
		rr2019.won=5;
		rr2019.lost=8;
		rr2019.points=11;
		rr2019.nrr="-0.449";
		int last5rr2019[]={0,1,1,0,0};
		rr2019.last5match=last5rr2019;
		
		Match rcb2019=new Match();
		
		rcb2019.teamName="RCB";
		rcb2019.played=14;
		rcb2019.won=5;
		rcb2019.lost=8;
		rcb2019.points=11;
		rcb2019.nrr="-0.607";
		int last5rcb2019[]={1,1,0,0,1};
		rcb2019.last5match=last5rcb2019;
		
		
		Match arrayofMatch2019[]={mi2019,csk2019,dc2019,srh2019,kkr2019,pbk2019,rr2019,rcb2019};
		
		
		s2019.match=arrayofMatch2019;
		
		
		Match mi2020=new Match();
		
		mi2020.teamName="MI";
		mi2020.played=14;
		mi2020.won=9;
		mi2020.lost=5;
		mi2020.points=18;
		mi2020.nrr="+1.107";
		int last5mi2020[]={1,0,1,1,0};
		mi2020.last5match=last5mi2020;
		
		Match dc2020=new Match();
		
		dc2020.teamName="DC";
		dc2020.played=14;
		dc2020.won=8;
		dc2020.lost=6;
		dc2020.points=16;
		dc2020.nrr="-0.109";
		int last5dc2020[]={0,0,0,0,1};
		dc2020.last5match=last5dc2020;
		
		Match srh2020=new Match();
		
		srh2020.teamName="SRH";
		srh2020.played=14;
		srh2020.won=7;
		srh2020.lost=7;
		srh2020.points=14;
		srh2020.nrr="+0.608";
		int last5srh2020[]={1,0,1,1,1};
		srh2020.last5match=last5srh2020;
		
		Match rcb2020=new Match();
		
		rcb2020.teamName="RCB";
		rcb2020.played=14;
		rcb2020.won=7;
		rcb2020.lost=7;
		rcb2020.points=14;
		rcb2020.nrr="-0.172";
		int last5rcb2020[]={1,0,0,0,0};
		rcb2020.last5match=last5rcb2020;
		
		Match kkr2020=new Match();
		
		kkr2020.teamName="KKR";
		kkr2020.played=14;
		kkr2020.won=7;
		kkr2020.lost=7;
		kkr2020.points=14;
		kkr2020.nrr="+0.214";
		int last5kkr2020[]={0,1,0,0,1};
		kkr2020.last5match=last5kkr2020;
		
		Match pbk2020=new Match();
		
		pbk2020.teamName="PBKS";
		pbk2020.played=14;
		pbk2020.won=6;
		pbk2020.lost=8;
		pbk2020.points=12;
		pbk2020.nrr="-0.162";
		int last5pbk2020[]={1,1,1,0,0};
		pbk2020.last5match=last5pbk2020;
		
		
		Match csk2020=new Match();
		
		csk2020.teamName="CSK";
		csk2020.played=14;
		csk2020.won=6;
		csk2020.lost=8;
		csk2020.points=12;
		csk2020.nrr="-0.455";
		int last5csk2020[]={0,0,1,1,1};
		csk2020.last5match=last5csk2020;
		
		
		Match rr2020=new Match();
		
		rr2020.teamName="RR";
		rr2020.played=14;
		rr2020.won=5;
		rr2020.lost=8;
		rr2020.points=11;
		rr2020.nrr="-0.449";
		int last5rr2020[]={1,0,1,1,0};
		rr2020.last5match=last5rr2020;
		
		Match arrayofMatch2020[]={mi2020,dc2020,srh2020,rcb2020,kkr2020,pbk2020,csk2020,rr2020};
		
		
		s2020.match=arrayofMatch2020;
		
		
		Match dc2021=new Match();
		
		dc2021.teamName="DC";
		dc2021.played=14;
		dc2021.won=8;
		dc2021.lost=6;
		dc2021.points=16;
		dc2021.nrr="-0.109";
		int last5dc2021[]={0,0,0,0,1};
		dc2021.last5match=last5dc2021;
		
		Match csk2021=new Match();
		
		csk2021.teamName="CSK";
		csk2021.played=14;
		csk2021.won=9;
		csk2021.lost=5;
		csk2021.points=18;
		csk2021.nrr="+0.455";
		int last5csk2021[]={1,1,0,0,0};
		csk2021.last5match=last5csk2021;
		
		Match rcb2021=new Match();
		
		rcb2021.teamName="RCB";
		rcb2021.played=14;
		rcb2021.won=9;
		rcb2021.lost=5;
		rcb2021.points=18;
		rcb2021.nrr="-0.140";
		int last5rcb2021[]={1,1,1,0,1};
		rcb2021.last5match=last5rcb2021;
		
		Match kkr2021=new Match();
		
		kkr2021.teamName="KKR";
		kkr2021.played=14;
		kkr2021.won=7;
		kkr2021.lost=7;
		kkr2021.points=14;
		kkr2021.nrr="+0.587";
		int last5kkr2021[]={0,1,0,1,1};
		kkr2021.last5match=last5kkr2021;
		
		Match mi2021=new Match();
		
		mi2021.teamName="MI";
		mi2021.played=14;
		mi2021.won=7;
		mi2021.lost=7;
		mi2021.points=14;
		mi2021.nrr="+0.116";
		int last5mi2021[]={0,1,0,1,1};
		mi2021.last5match=last5mi2021;
		
		Match pbk2021=new Match();
		
		pbk2021.teamName="PBKS";
		pbk2021.played=14;
		pbk2021.won=6;
		pbk2021.lost=8;
		pbk2021.points=12;
		pbk2021.nrr="-0.001";
		int last5pbk2021[]={1,0,1,0,1};
		pbk2021.last5match=last5pbk2021;
		
		Match rr2021=new Match();
		
		rr2021.teamName="RR";
		rr2021.played=14;
		rr2021.won=5;
		rr2021.lost=9;
		rr2021.points=10;
		rr2021.nrr="-0.993";
		int last5rr2021[]={0,0,1,0,0};
		rr2021.last5match=last5rr2021;
		
		Match srh2021=new Match();
		
		srh2021.teamName="SRH";
		srh2021.played=14;
		srh2021.won=3;
		srh2021.lost=11;
		srh2021.points=6;
		srh2021.nrr="-0.545";
		int last5srh2021[]={1,0,0,1,0};
		srh2021.last5match=last5srh2021;
		
		
		Match arrayofMatch2021[]={dc2021,csk2021,rcb2021,kkr2021,mi2021,pbk2021,rr2021,srh2021};
		
		
		s2021.match=arrayofMatch2021;
		
		
		Match gt2022=new Match();
		
		gt2022.teamName="GT";
		gt2022.played=14;
		gt2022.won=10;
		gt2022.lost=4;
		gt2022.points=20;
		gt2022.nrr="+0.316";
		int last5gt2022[]={0,0,1,1,0};
		gt2022.last5match=last5gt2022;
		
		Match rr2022=new Match();
		
		rr2022.teamName="RR";
		rr2022.played=14;
		rr2022.won=9;
		rr2022.lost=5;
		rr2022.points=18;
		rr2022.nrr="+0.298";
		int last5rr2022[]={0,1,0,1,1};
		rr2022.last5match=last5rr2022;
		
		Match lsg2022=new Match();
		
		lsg2022.teamName="LSG";
		lsg2022.played=14;
		lsg2022.won=9;
		lsg2022.lost=5;
		lsg2022.points=18;
		lsg2022.nrr="+0.251";
		int last5lsg2022[]={1,1,0,0,1};
		lsg2022.last5match=last5lsg2022;
		
		Match rcb2022=new Match();
		
		rcb2022.teamName="RCB";
		rcb2022.played=14;
		rcb2022.won=8;
		rcb2022.lost=6;
		rcb2022.points=16;
		rcb2022.nrr="-0.253";
		int last5rcb2022[]={0,1,1,0,1};
		rcb2022.last5match=last5rcb2022;
		
		
		Match dc2022=new Match();
		
		dc2022.teamName="DC";
		dc2022.played=14;
		dc2022.won=7;
		dc2022.lost=7;
		dc2022.points=14;
		dc2022.nrr="+0.204";
		int last5dc2022[]={1,0,1,1,0};
		dc2022.last5match=last5dc2022;
		
		Match pbk2022=new Match();
		
		pbk2022.teamName="PBKS";
		pbk2022.played=14;
		pbk2022.won=7;
		pbk2022.lost=7;
		pbk2022.points=14;
		pbk2022.nrr="+1.126";
		int last5pbk2022[]={1,0,1,0,1};
		pbk2022.last5match=last5pbk2022;
		
		Match kkr2022=new Match();
		
		kkr2022.teamName="KKR";
		kkr2022.played=14;
		kkr2022.won=6;
		kkr2022.lost=8;
		kkr2022.points=12;
		kkr2022.nrr="+0.146";
		int last5kkr2022[]={1,0,1,1,0};
		kkr2022.last5match=last5kkr2022;
		
		Match srh2022=new Match();
		
		srh2022.teamName="SRH";
		srh2022.played=14;
		srh2022.won=6;
		srh2022.lost=8;
		srh2022.points=12;
		srh2022.nrr="-0.379";
		int last5srh2022[]={0,0,0,1,0};
		srh2022.last5match=last5srh2022;
		
		
		Match csk2022=new Match();
		
		csk2022.teamName="CSK";
		csk2022.played=14;
		csk2022.won=4;
		csk2022.lost=10;
		csk2022.points=8;
		csk2022.nrr="-0.203";
		int last5csk2022[]={0,1,0,0,0};
		csk2022.last5match=last5csk2022;
	
		
		Match mi2022=new Match();
		
		mi2022.teamName="MI";
		mi2022.played=14;
		mi2022.won=4;
		mi2022.lost=10;
		mi2022.points=8;
		mi2022.nrr="-0.506";
		int last5mi2022[]={1,0,1,0,1};
		mi2022.last5match=last5mi2022;
		
		Match arrayofMatch2022[]={gt2022,rr2022,lsg2022,rcb2022,dc2022,pbk2022,kkr2022,srh2022,csk2022,mi2022};
		
		
		s2022.match=arrayofMatch2022;
		
		
		Match gt2023=new Match();
		
		gt2023.teamName="GT";
		gt2023.played=14;
		gt2023.won=10;
		gt2023.lost=4;
		gt2023.points=20;
		gt2023.nrr="+0.809";
		int last5gt2023[]={1,1,0,1,1};
		gt2023.last5match=last5gt2023;
		
		Match csk2023=new Match();
		
		csk2023.teamName="CSK";
		csk2023.played=14;
		csk2023.won=8;
		csk2023.lost=5;
		csk2023.points=17;
		csk2023.nrr="+0.652";
		int last5csk2023[]={0,1,1,0,1};
		csk2023.last5match=last5csk2023;
		
		Match lsg2023=new Match();
		
		lsg2023.teamName="LSG";
		lsg2023.played=14;
		lsg2023.won=8;
		lsg2023.lost=5;
		lsg2023.points=17;
		lsg2023.nrr="+0.284";
		int last5lsg2023[]={0,0,1,1,1};
		lsg2023.last5match=last5lsg2023;
		
		Match mi2023=new Match();
		
		mi2023.teamName="MI";
		mi2023.played=14;
		mi2023.won=8;
		mi2023.lost=6;
		mi2023.points=16;
		mi2023.nrr="-0.044";
		int last5mi2023[]={0,1,1,0,1};
		mi2023.last5match=last5mi2023;
		
		Match rr2023=new Match();
		
		rr2023.teamName="RR";
		rr2023.played=14;
		rr2023.won=7;
		rr2023.lost=7;
		rr2023.points=14;
		rr2023.nrr="+0.148";
		int last5rr2023[]={0,0,1,0,1};
		rr2023.last5match=last5rr2023;
		
		Match rcb2023=new Match();
		
		rcb2023.teamName="RCB";
		rcb2023.played=14;
		rcb2023.won=7;
		rcb2023.lost=7;
		rcb2023.points=14;
		rcb2023.nrr="+0.135";
		int last5rcb2023[]={0,0,1,1,0};
		rcb2023.last5match=last5rcb2023;
		
		Match kkr2023=new Match();
		
		kkr2023.teamName="KKR";
		kkr2023.played=14;
		kkr2023.won=6;
		kkr2023.lost=8;
		kkr2023.points=12;
		kkr2023.nrr="-0.239";
		int last5kkr2023[]={1,1,0,1,0};
		kkr2023.last5match=last5kkr2023;
		
		Match pbk2023=new Match();
		
		pbk2023.teamName="PBKS";
		pbk2023.played=14;
		pbk2023.won=6;
		pbk2023.lost=8;
		pbk2023.points=12;
		pbk2023.nrr="+0.304";
		int last5pbk2023[]={0,0,1,0,0};
		pbk2023.last5match=last5pbk2023;
		
		
		Match dc2023=new Match();
		
		dc2023.teamName="DC";
		dc2023.played=14;
		dc2023.won=5;
		dc2023.lost=9;
		dc2023.points=10;
		dc2023.nrr="-0.808";
		int last5dc2023[]={1,0,0,1,0};
		dc2023.last5match=last5dc2023;
		
		Match srh2023=new Match();
		
		srh2023.teamName="SRH";
		srh2023.played=14;
		srh2023.won=6;
		srh2023.lost=8;
		srh2023.points=12;
		srh2023.nrr="-0.379";
		int last5srh2023[]={1,0,0,0,0};
		srh2023.last5match=last5srh2023;
		
		
		Match arrayofMatch2023[]={gt2023,csk2023,lsg2023,mi2023,rr2023,rcb2023,kkr2023,pbk2023,dc2023,srh2023};
		
		
		s2023.match=arrayofMatch2023;
		
		
		Match kkr2024=new Match();
		
		kkr2024.teamName="KKR";
		kkr2024.played=14;
		kkr2024.won=9;
		kkr2024.lost=3;
		kkr2024.points=20;
		kkr2024.nrr="+1.428";
		int last5kkr2024[]={1,1,1,0,0};
		kkr2024.last5match=last5kkr2024;
		
		Match srh2024=new Match();
		
		srh2024.teamName="SRH";
		srh2024.played=14;
		srh2024.won=8;
		srh2024.lost=5;
		srh2024.points=17;
		srh2024.nrr="+0.414";
		int last5srh2024[]={1,0,1,0,1};
		srh2024.last5match=last5srh2024;
		
		Match rr2024=new Match();
		
		rr2024.teamName="RR";
		rr2024.played=14;
		rr2024.won=8;
		rr2024.lost=5;
		rr2024.points=14;
		rr2024.nrr="+0.273";
		int last5rr2024[]={0,0,0,0,0};
		rr2024.last5match=last5rr2024;
		
		
		Match rcb2024=new Match();
		
		rcb2024.teamName="RCB";
		rcb2024.played=14;
		rcb2024.won=7;
		rcb2024.lost=7;
		rcb2024.points=14;
		rcb2024.nrr="+0.459";
		int last5rcb2024[]={1,1,1,1,1};
		rcb2024.last5match=last5rcb2024;
		
		Match csk2024=new Match();
		
		csk2024.teamName="CSK";
		csk2024.played=14;
		csk2024.won=7;
		csk2024.lost=7;
		csk2024.points=17;
		csk2024.nrr="+0.392";
		int last5csk2024[]={0,1,0,1,0};
		csk2024.last5match=last5csk2024;
		
		Match dc2024=new Match();
		
		dc2024.teamName="DC";
		dc2024.played=14;
		dc2024.won=7;
		dc2024.lost=7;
		dc2024.points=14;
		dc2024.nrr="-0.377";
		int last5dc2024[]={1,0,1,0,1};
		dc2024.last5match=last5dc2024;
		
		Match lsg2024=new Match();
		
		lsg2024.teamName="LSG";
		lsg2024.played=14;
		lsg2024.won=7;
		lsg2024.lost=7;
		lsg2024.points=14;
		lsg2024.nrr="-0.667";
		int last5lsg2024[]={1,0,0,0,1};
		lsg2024.last5match=last5lsg2024;
		
		Match gt2024=new Match();
		
		gt2024.teamName="GT";
		gt2024.played=14;
		gt2024.won=5;
		gt2024.lost=7;
		gt2024.points=12;
		gt2024.nrr="-1.063";
		int last5gt2024[]={0,0,1,0,0};
		gt2024.last5match=last5gt2024;
		
		
		Match pbk2024=new Match();
		
		pbk2024.teamName="PBKS";
		pbk2024.played=14;
		pbk2024.won=5;
		pbk2024.lost=9;
		pbk2024.points=10;
		pbk2024.nrr="-0.353";
		int last5pbk2024[]={1,0,0,1,0};
		pbk2024.last5match=last5pbk2024;
		
		Match mi2024=new Match();
		
		mi2024.teamName="MI";
		mi2024.played=14;
		mi2024.won=4;
		mi2024.lost=10;
		mi2024.points=8;
		mi2024.nrr="-0.318";
		int last5mi2024[]={0,0,1,0,0};
		mi2024.last5match=last5mi2024;
		
		
		Match arrayofMatch2024[]={kkr2024,srh2024,rr2024,rcb2024,csk2024,dc2024,lsg2024,gt2024,pbk2024,mi2024};
		
		
		s2024.match=arrayofMatch2024;
		
		
		Match pbk2025=new Match();
		
		pbk2025.teamName="PBKS";
		pbk2025.played=14;
		pbk2025.won=9;
		pbk2025.lost=4;
		pbk2025.points=19;
		pbk2025.nrr="+0.372";
		int last5pbk2025[]={1,1,1,0,1};
		pbk2025.last5match=last5pbk2025;
		
		Match rcb2025=new Match();
		
		rcb2025.teamName="RCB";
		rcb2025.played=14;
		rcb2025.won=9;
		rcb2025.lost=4;
		rcb2025.points=19;
		rcb2025.nrr="+0.301";
		int last5rcb2025[]={1,1,0,0,1};
		rcb2025.last5match=last5rcb2025;
		
		Match gt2025=new Match();
		
		gt2025.teamName="GT";
		gt2025.played=14;
		gt2025.won=9;
		gt2025.lost=5;
		gt2025.points=18;
		gt2025.nrr="+0.254";
		int last5gt2025[]={1,1,1,0,0};
		gt2025.last5match=last5gt2025;
		
		Match mi2025=new Match();
		
		mi2025.teamName="MI";
		mi2025.played=14;
		mi2025.won=8;
		mi2025.lost=6;
		mi2025.points=16;
		mi2025.nrr="+1.142";
		int last5mi2025[]={1,1,0,1,0};
		mi2025.last5match=last5mi2025;
		
		Match dc2025=new Match();
		
		dc2025.teamName="DC";
		dc2025.played=14;
		dc2025.won=7;
		dc2025.lost=6;
		dc2025.points=15;
		dc2025.nrr="+0.011";
		int last5dc2025[]={0,0,0,0,1};
		dc2025.last5match=last5dc2025;
		
		Match srh2025=new Match();
		
		srh2025.teamName="SRH";
		srh2025.played=14;
		srh2025.won=6;
		srh2025.lost=7;
		srh2025.points=13;
		srh2025.nrr="-0.241";
		int last5srh2025[]={0,0,1,1,1};
		srh2025.last5match=last5srh2025;
		
		Match lsg2025=new Match();
		
		lsg2025.teamName="LSG";
		lsg2025.played=14;
		lsg2025.won=6;
		lsg2025.lost=8;
		lsg2025.points=12;
		lsg2025.nrr="-0.376";
		int last5lsg2025[]={0,0,0,1,0};
		lsg2025.last5match=last5lsg2025;
		
		Match kkr2025=new Match();
		
		kkr2025.teamName="KKR";
		kkr2025.played=14;
		kkr2025.won=5;
		kkr2025.lost=7;
		kkr2025.points=12;
		kkr2025.nrr="-0.305";
		int last5kkr2025[]={1,1,0,0,0};
		kkr2025.last5match=last5kkr2025;
		
		
		Match rr2025=new Match();
		
		rr2025.teamName="RR";
		rr2025.played=14;
		rr2025.won=4;
		rr2025.lost=10;
		rr2025.points=8;
		rr2025.nrr="-0.549";
		int last5rr2025[]={1,0,0,0,1};
		rr2025.last5match=last5rr2025;
		
		Match csk2025=new Match();
		
		csk2025.teamName="CSK";
		csk2025.played=14;
		csk2025.won=4;
		csk2025.lost=10;
		csk2025.points=8;
		csk2025.nrr="-0.647";
		int last5csk2025[]={0,0,1,0,1};
		csk2025.last5match=last5csk2025;
		
		Match arrayofMatch2025[]={pbk2025,rcb2025,gt2025,mi2025,dc2025,srh2025,lsg2025,kkr2025,rr2025,csk2025};
		
		
		s2025.match=arrayofMatch2025;
		
		Match rcb2026=new Match();
		
		rcb2026.teamName="RCB";
		rcb2026.played=14;
		rcb2026.won=9;
		rcb2026.lost=5;
		rcb2026.points=18;
		rcb2026.nrr="+0.783";
		int last5rcb2026[]={0,1,1,1,0};
		rcb2026.last5match=last5rcb2026;
		
		
		Match gt2026=new Match();
		
		gt2026.teamName="GT";
		gt2026.played=14;
		gt2026.won=9;
		gt2026.lost=5;
		gt2026.points=18;
		gt2026.nrr="+0.695";
		int last5gt2026[]={1,1,1,0,1};
		gt2026.last5match=last5gt2026;
		
		Match srh2026=new Match();
		
		srh2026.teamName="SRH";
		srh2026.played=14;
		srh2026.won=9;
		srh2026.lost=5;
		srh2026.points=18;
		srh2026.nrr="+0.524";
		int last5srh2026[]={0,1,0,1,1};
		srh2026.last5match=last5srh2026;
		
		Match rr2026=new Match();
		
		rr2026.teamName="RR";
		rr2026.played=14;
		rr2026.won=8;
		rr2026.lost=6;
		rr2026.points=16;
		rr2026.nrr="+0.189";
		int last5rr2026[]={0,0,0,1,1};
		rr2026.last5match=last5rr2026;
		
		Match pbk2026=new Match();
		
		pbk2026.teamName="PBKS";
		pbk2026.played=14;
		pbk2026.won=7;
		pbk2026.lost=6;
		pbk2026.points=15;
		pbk2026.nrr="+0.309";
		int last5pbk2026[]={0,0,0,0,1};
		pbk2026.last5match=last5pbk2026;
		
		Match dc2026=new Match();
		
		dc2026.teamName="DC";
		dc2026.played=14;
		dc2026.won=7;
		dc2026.lost=7;
		dc2026.points=14;
		dc2026.nrr="-0.651";
		int last5dc2026[]={0,0,1,1,1};
		dc2026.last5match=last5dc2026;
		
		Match kkr2026=new Match();
		
		kkr2026.teamName="KKR";
		kkr2026.played=14;
		kkr2026.won=6;
		kkr2026.lost=7;
		kkr2026.points=13;
		kkr2026.nrr="-0.147";
		int last5kkr2026[]={1,0,1,1,0};
		kkr2026.last5match=last5kkr2026;
		
		Match csk2026=new Match();
		
		csk2026.teamName="CSK";
		csk2026.played=14;
		csk2026.won=6;
		csk2026.lost=8;
		csk2026.points=12;
		csk2026.nrr="-0.345";
		int last5csk2026[]={1,1,0,0,0};
		csk2026.last5match=last5csk2026;
		
		Match mi2026=new Match();
		
		mi2026.teamName="MI";
		mi2026.played=14;
		mi2026.won=4;
		mi2026.lost=10;
		mi2026.points=8;
		mi2026.nrr="-0.584";
		int last5mi2026[]={1,0,1,0,0};
		mi2026.last5match=last5mi2026;
		
		
		Match lsg2026=new Match();
		
		lsg2026.teamName="LSG";
		lsg2026.played=14;
		lsg2026.won=4;
		lsg2026.lost=10;
		lsg2026.points=8;
		lsg2026.nrr="-0.740";
		int last5lsg2026[]={1,0,1,0,0};
		lsg2026.last5match=last5lsg2026;
		
		Match arrayofMatch2026[]={rcb2026,gt2026,srh2026,rr2026,pbk2026,dc2026,kkr2026,
		csk2026,mi2026,lsg2026};
		
		
		s2026.match=arrayofMatch2026;
		
		Seasons seasonArr[]={season,s2009,s2010,s2011,s2012,s2013,s2014,s2015,s2016,s2017,
		s2018,s2019,s2020,s2021,s2022,s2023,s2024,s2025,s2026};
		
		
		
		tables.season=seasonArr;
		
		mens.tables=tables;
		
		mens.getMensIplInfo();
		
	}
}
