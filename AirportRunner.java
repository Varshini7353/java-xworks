class AirportRunner{
	
	
	public static void main(String []arr){
		
		// 1. Kempegowda International Airport
		Airport airport1 = new Airport();

		airport1.airportId = 1;
		airport1.airportName = "Kempegowda International Airport";
		airport1.cityName = "Bangalore";
		airport1.location = "Devanahalli";

		Terminal terminal1 = new Terminal();

		terminal1.terminalName = "Terminal 1";
		terminal1.totalGates = 8;
		terminal1.hasInternationalcoustom = true;
		terminal1.passengerCount = 500;

		airport1.terminal = terminal1;
		airport1.getAirportDetails();
		System.out.println("----------------------------");
		


		// 2. Mangalore International Airport
		Airport airport2 = new Airport();

		airport2.airportId = 2;
		airport2.airportName = "Mangalore International Airport";
		airport2.cityName = "Mangalore";
		airport2.location = "Bajpe";

		Terminal terminal2 = new Terminal();

		terminal2.terminalName = "Main Terminal";
		terminal2.totalGates = 6;
		terminal2.hasInternationalcoustom = true;
		terminal2.passengerCount = 300;

		airport2.terminal = terminal2;
		airport2.getAirportDetails();
		System.out.println("----------------------------");


		// 3. Mysore Airport
		Airport airport3 = new Airport();

		airport3.airportId = 3;
		airport3.airportName = "Mysore Airport";
		airport3.cityName = "Mysore";
		airport3.location = "Mandakalli";

		Terminal terminal3 = new Terminal();

		terminal3.terminalName = "Passenger Terminal";
		terminal3.totalGates = 4;
		terminal3.hasInternationalcoustom = false;
		terminal3.passengerCount = 150;

		airport3.terminal = terminal3;
		airport3.getAirportDetails();
		System.out.println("----------------------------");


		// 4. Hubballi Airport
		Airport airport4 = new Airport();

		airport4.airportId = 4;
		airport4.airportName = "Hubballi Airport";
		airport4.cityName = "Hubballi";
		airport4.location = "Gokul Road";

		Terminal terminal4 = new Terminal();

		terminal4.terminalName = "Main Terminal";
		terminal4.totalGates = 5;
		terminal4.hasInternationalcoustom = false;
		terminal4.passengerCount = 200;

		airport4.terminal = terminal4;
		airport4.getAirportDetails();
		System.out.println("----------------------------");


		// 5. Belagavi Airport
		Airport airport5 = new Airport();

		airport5.airportId = 5;
		airport5.airportName = "Belagavi Airport";
		airport5.cityName = "Belagavi";
		airport5.location = "Sambra";

		Terminal terminal5 = new Terminal();

		terminal5.terminalName = "Main Terminal";
		terminal5.totalGates = 5;
		terminal5.hasInternationalcoustom = false;
		terminal5.passengerCount = 180;

		airport5.terminal = terminal5;
		airport5.getAirportDetails();
		System.out.println("----------------------------");


		// 6. Kalaburagi Airport
		Airport airport6 = new Airport();

		airport6.airportId = 6;
		airport6.airportName = "Kalaburagi Airport";
		airport6.cityName = "Kalaburagi";
		airport6.location = "Srinivas Saradagi";

		Terminal terminal6 = new Terminal();

		terminal6.terminalName = "Passenger Terminal";
		terminal6.totalGates = 4;
		terminal6.hasInternationalcoustom = false;
		terminal6.passengerCount = 120;

		airport6.terminal = terminal6;
		airport6.getAirportDetails();
		System.out.println("----------------------------");


		// 7. Chennai International Airport
		Airport airport7 = new Airport();

		airport7.airportId = 7;
		airport7.airportName = "Chennai International Airport";
		airport7.cityName = "Chennai";
		airport7.location = "Tirusulam";

		Terminal terminal7 = new Terminal();

		terminal7.terminalName = "Anna Terminal";
		terminal7.totalGates = 10;
		terminal7.hasInternationalcoustom = true;
		terminal7.passengerCount = 700;

		airport7.terminal = terminal7;
		airport7.getAirportDetails();
		System.out.println("----------------------------");


		// 8. Coimbatore International Airport
		Airport airport8 = new Airport();

		airport8.airportId = 8;
		airport8.airportName = "Coimbatore International Airport";
		airport8.cityName = "Coimbatore";
		airport8.location = "Peelamedu";

		Terminal terminal8 = new Terminal();

		terminal8.terminalName = "Main Terminal";
		terminal8.totalGates = 7;
		terminal8.hasInternationalcoustom = true;
		terminal8.passengerCount = 400;

		airport8.terminal = terminal8;
		airport8.getAirportDetails();
		System.out.println("----------------------------");


		// 9. Madurai Airport
		Airport airport9 = new Airport();

		airport9.airportId = 9;
		airport9.airportName = "Madurai Airport";
		airport9.cityName = "Madurai";
		airport9.location = "Avaniyapuram";

		Terminal terminal9 = new Terminal();

		terminal9.terminalName = "Main Terminal";
		terminal9.totalGates = 5;
		terminal9.hasInternationalcoustom = true;
		terminal9.passengerCount = 250;

		airport9.terminal = terminal9;
		airport9.getAirportDetails();
		System.out.println("----------------------------");


		// 10. Tiruchirappalli International Airport
		Airport airport10 = new Airport();

		airport10.airportId = 10;
		airport10.airportName = "Tiruchirappalli International Airport";
		airport10.cityName = "Tiruchirappalli";
		airport10.location = "Trichy";

		Terminal terminal10 = new Terminal();

		terminal10.terminalName = "Main Terminal";
		terminal10.totalGates = 6;
		terminal10.hasInternationalcoustom = true;
		terminal10.passengerCount = 350;

		airport10.terminal = terminal10;
		airport10.getAirportDetails();
		System.out.println("----------------------------");


		// 11. Salem Airport
		Airport airport11 = new Airport();

		airport11.airportId = 11;
		airport11.airportName = "Salem Airport";
		airport11.cityName = "Salem";
		airport11.location = "Kamalapuram";

		Terminal terminal11 = new Terminal();

		terminal11.terminalName = "Passenger Terminal";
		terminal11.totalGates = 3;
		terminal11.hasInternationalcoustom = false;
		terminal11.passengerCount = 100;

		airport11.terminal = terminal11;
		airport11.getAirportDetails();
		System.out.println("----------------------------");


		// 12. Tuticorin Airport
		Airport airport12 = new Airport();

		airport12.airportId = 12;
		airport12.airportName = "Tuticorin Airport";
		airport12.cityName = "Thoothukudi";
		airport12.location = "Vagaikulam";

		Terminal terminal12 = new Terminal();

		terminal12.terminalName = "Main Terminal";
		terminal12.totalGates = 3;
		terminal12.hasInternationalcoustom = false;
		terminal12.passengerCount = 100;

		airport12.terminal = terminal12;
		airport12.getAirportDetails();
		System.out.println("----------------------------");


		// 13. Kochi International Airport
		Airport airport13 = new Airport();

		airport13.airportId = 13;
		airport13.airportName = "Cochin International Airport";
		airport13.cityName = "Kochi";
		airport13.location = "Nedumbassery";

		Terminal terminal13 = new Terminal();

		terminal13.terminalName = "Terminal 1";
		terminal13.totalGates = 10;
		terminal13.hasInternationalcoustom = true;
		terminal13.passengerCount = 800;

		airport13.terminal = terminal13;
		airport13.getAirportDetails();
		System.out.println("----------------------------");


		// 14. Trivandrum International Airport
		Airport airport14 = new Airport();

		airport14.airportId = 14;
		airport14.airportName = "Trivandrum International Airport";
		airport14.cityName = "Thiruvananthapuram";
		airport14.location = "Shangumugham";

		Terminal terminal14 = new Terminal();

		terminal14.terminalName = "Terminal 1";
		terminal14.totalGates = 8;
		terminal14.hasInternationalcoustom = true;
		terminal14.passengerCount = 600;

		airport14.terminal = terminal14;
		airport14.getAirportDetails();
		System.out.println("----------------------------");


		// 15. Calicut International Airport
		Airport airport15 = new Airport();

		airport15.airportId = 15;
		airport15.airportName = "Calicut International Airport";
		airport15.cityName = "Kozhikode";
		airport15.location = "Karipur";

		Terminal terminal15 = new Terminal();

		terminal15.terminalName = "Main Terminal";
		terminal15.totalGates = 7;
		terminal15.hasInternationalcoustom = true;
		terminal15.passengerCount = 500;

		airport15.terminal = terminal15;
		airport15.getAirportDetails();
		System.out.println("----------------------------");


		// 16. Kannur International Airport
		Airport airport16 = new Airport();

		airport16.airportId = 16;
		airport16.airportName = "Kannur International Airport";
		airport16.cityName = "Kannur";
		airport16.location = "Mattannur";

		Terminal terminal16 = new Terminal();

		terminal16.terminalName = "Main Terminal";
		terminal16.totalGates = 7;
		terminal16.hasInternationalcoustom = true;
		terminal16.passengerCount = 400;

		airport16.terminal = terminal16;
		airport16.getAirportDetails();
		System.out.println("----------------------------");
		

		// 17. Vijayawada International Airport
		Airport airport17 = new Airport();

		airport17.airportId = 17;
		airport17.airportName = "Vijayawada International Airport";
		airport17.cityName = "Vijayawada";
		airport17.location = "Gannavaram";

		Terminal terminal17 = new Terminal();

		terminal17.terminalName = "Main Terminal";
		terminal17.totalGates = 6;
		terminal17.hasInternationalcoustom = true;
		terminal17.passengerCount = 300;

		airport17.terminal = terminal17;
		airport17.getAirportDetails();
		System.out.println("----------------------------");


		// 18. Visakhapatnam International Airport
		Airport airport18 = new Airport();

		airport18.airportId = 18;
		airport18.airportName = "Visakhapatnam Airport";
		airport18.cityName = "Visakhapatnam";
		airport18.location = "Madhurawada";

		Terminal terminal18 = new Terminal();

		terminal18.terminalName = "Passenger Terminal";
		terminal18.totalGates = 7;
		terminal18.hasInternationalcoustom = true;
		terminal18.passengerCount = 450;

		airport18.terminal = terminal18;
		airport18.getAirportDetails();
		System.out.println("----------------------------");


		// 19. Tirupati Airport
		Airport airport19 = new Airport();

		airport19.airportId = 19;
		airport19.airportName = "Tirupati Airport";
		airport19.cityName = "Tirupati";
		airport19.location = "Renigunta";

		Terminal terminal19 = new Terminal();

		terminal19.terminalName = "Main Terminal";
		terminal19.totalGates = 5;
		terminal19.hasInternationalcoustom = true;
		terminal19.passengerCount = 250;

		airport19.terminal = terminal19;
		airport19.getAirportDetails();
		System.out.println("----------------------------");


		// 20. Rajahmundry Airport
		Airport airport20 = new Airport();

		airport20.airportId = 20;
		airport20.airportName = "Rajahmundry Airport";
		airport20.cityName = "Rajahmundry";
		airport20.location = "Madhurapudi";

		Terminal terminal20 = new Terminal();

		terminal20.terminalName = "Passenger Terminal";
		terminal20.totalGates = 4;
		terminal20.hasInternationalcoustom = false;
		terminal20.passengerCount = 180;

		airport20.terminal = terminal20;
		airport20.getAirportDetails();
		System.out.println("----------------------------");


		// 21. Kadapa Airport
		Airport airport21 = new Airport();

		airport21.airportId = 21;
		airport21.airportName = "Kadapa Airport";
		airport21.cityName = "Kadapa";
		airport21.location = "Kopparthy";

		Terminal terminal21 = new Terminal();

		terminal21.terminalName = "Main Terminal";
		terminal21.totalGates = 3;
		terminal21.hasInternationalcoustom = false;
		terminal21.passengerCount = 100;

		airport21.terminal = terminal21;
		airport21.getAirportDetails();
		System.out.println("----------------------------");


		// 22. Kurnool Airport
		Airport airport22 = new Airport();

		airport22.airportId = 22;
		airport22.airportName = "Kurnool Airport";
		airport22.cityName = "Kurnool";
		airport22.location = "Orvakal";

		Terminal terminal22 = new Terminal();

		terminal22.terminalName = "Passenger Terminal";
		terminal22.totalGates = 3;
		terminal22.hasInternationalcoustom = false;
		terminal22.passengerCount = 100;

		airport22.terminal = terminal22;
		airport22.getAirportDetails();
		System.out.println("----------------------------");


		// 23. Rajiv Gandhi International Airport
		Airport airport23 = new Airport();

		airport23.airportId = 23;
		airport23.airportName = "Rajiv Gandhi International Airport";
		airport23.cityName = "Hyderabad";
		airport23.location = "Shamshabad";

		Terminal terminal23 = new Terminal();

		terminal23.terminalName = "Main Terminal";
		terminal23.totalGates = 10;
		terminal23.hasInternationalcoustom = true;
		terminal23.passengerCount = 800;

		airport23.terminal = terminal23;
		airport23.getAirportDetails();
		System.out.println("----------------------------");


		// 24. Warangal Airport
		Airport airport24 = new Airport();

		airport24.airportId = 24;
		airport24.airportName = "Warangal Airport";
		airport24.cityName = "Warangal";
		airport24.location = "Mamnoor";

		Terminal terminal24 = new Terminal();

		terminal24.terminalName = "Passenger Terminal";
		terminal24.totalGates = 2;
		terminal24.hasInternationalcoustom = false;
		terminal24.passengerCount = 80;

		airport24.terminal = terminal24;
		airport24.getAirportDetails();
		System.out.println("----------------------------");


		// 25. Goa International Airport
		Airport airport25 = new Airport();

		airport25.airportId = 25;
		airport25.airportName = "Manohar International Airport";
		airport25.cityName = "Goa";
		airport25.location = "Mopa";

		Terminal terminal25 = new Terminal();

		terminal25.terminalName = "Main Terminal";
		terminal25.totalGates = 10;
		terminal25.hasInternationalcoustom = true;
		terminal25.passengerCount = 700;

		airport25.terminal = terminal25;
		airport25.getAirportDetails();
		System.out.println("----------------------------");


		// 26. Dabolim Airport
		Airport airport26 = new Airport();

		airport26.airportId = 26;
		airport26.airportName = "Dabolim Airport";
		airport26.cityName = "Goa";
		airport26.location = "Dabolim";

		Terminal terminal26 = new Terminal();

		terminal26.terminalName = "Integrated Terminal";
		terminal26.totalGates = 8;
		terminal26.hasInternationalcoustom = true;
		terminal26.passengerCount = 500;

		airport26.terminal = terminal26;
		airport26.getAirportDetails();
		System.out.println("----------------------------");


		// 27. Pondicherry Airport
		Airport airport27 = new Airport();

		airport27.airportId = 27;
		airport27.airportName = "Pondicherry Airport";
		airport27.cityName = "Puducherry";
		airport27.location = "Lawspet";

		Terminal terminal27 = new Terminal();

		terminal27.terminalName = "Passenger Terminal";
		terminal27.totalGates = 2;
		terminal27.hasInternationalcoustom = false;
		terminal27.passengerCount = 70;

		airport27.terminal = terminal27;
		airport27.getAirportDetails();
		System.out.println("----------------------------");


		// 28. Shirdi Airport
		Airport airport28 = new Airport();

		airport28.airportId = 28;
		airport28.airportName = "Shirdi Airport";
		airport28.cityName = "Shirdi";
		airport28.location = "Kakadi";

		Terminal terminal28 = new Terminal();

		terminal28.terminalName = "Passenger Terminal";
		terminal28.totalGates = 4;
		terminal28.hasInternationalcoustom = false;
		terminal28.passengerCount = 150;

		airport28.terminal = terminal28;
		airport28.getAirportDetails();
		System.out.println("----------------------------");


		// 29. Shivamogga Airport
		Airport airport29 = new Airport();

		airport29.airportId = 29;
		airport29.airportName = "Shivamogga Airport";
		airport29.cityName = "Shivamogga";
		airport29.location = "Sogane";

		Terminal terminal29 = new Terminal();

		terminal29.terminalName = "Main Terminal";
		terminal29.totalGates = 4;
		terminal29.hasInternationalcoustom = false;
		terminal29.passengerCount = 150;

		airport29.terminal = terminal29;
		airport29.getAirportDetails();
		System.out.println("----------------------------");


		// 30. Salem Airport
		Airport airport30 = new Airport();

		airport30.airportId = 30;
		airport30.airportName = "Salem Airport";
		airport30.cityName = "Salem";
		airport30.location = "Kamalapuram";

		Terminal terminal30 = new Terminal();

		terminal30.terminalName = "Main Terminal";
		terminal30.totalGates = 3;
		terminal30.hasInternationalcoustom = false;
		terminal30.passengerCount = 100;

		airport30.terminal = terminal30;
		airport30.getAirportDetails();
		System.out.println("----------------------------");
		


		// 31. Hosur Airport
		Airport airport31 = new Airport();

		airport31.airportId = 31;
		airport31.airportName = "Hosur Airport";
		airport31.cityName = "Hosur";
		airport31.location = "Hosur";

		Terminal terminal31 = new Terminal();

		terminal31.terminalName = "Passenger Terminal";
		terminal31.totalGates = 2;
		terminal31.hasInternationalcoustom = false;
		terminal31.passengerCount = 60;

		airport31.terminal = terminal31;
		airport31.getAirportDetails();
		System.out.println("----------------------------");


		// 32. Donakonda Airport
		Airport airport32 = new Airport();

		airport32.airportId = 32;
		airport32.airportName = "Donakonda Airport";
		airport32.cityName = "Donakonda";
		airport32.location = "Prakasam";

		Terminal terminal32 = new Terminal();

		terminal32.terminalName = "Passenger Terminal";
		terminal32.totalGates = 2;
		terminal32.hasInternationalcoustom = false;
		terminal32.passengerCount = 50;

		airport32.terminal = terminal32;
		airport32.getAirportDetails();
		System.out.println("----------------------------");


		// 33. Vellore Airport
		Airport airport33 = new Airport();

		airport33.airportId = 33;
		airport33.airportName = "Vellore Airport";
		airport33.cityName = "Vellore";
		airport33.location = "Abdullapuram";

		Terminal terminal33 = new Terminal();

		terminal33.terminalName = "Passenger Terminal";
		terminal33.totalGates = 2;
		terminal33.hasInternationalcoustom = false;
		terminal33.passengerCount = 50;

		airport33.terminal = terminal33;
		airport33.getAirportDetails();
		System.out.println("----------------------------");


		// 34. Nizamabad Airport
		Airport airport34 = new Airport();

		airport34.airportId = 34;
		airport34.airportName = "Nizamabad Airport";
		airport34.cityName = "Nizamabad";
		airport34.location = "Telangana";

		Terminal terminal34 = new Terminal();

		terminal34.terminalName = "Passenger Terminal";
		terminal34.totalGates = 2;
		terminal34.hasInternationalcoustom = false;
		terminal34.passengerCount = 60;

		airport34.terminal = terminal34;
		airport34.getAirportDetails();
		System.out.println("----------------------------");


		// 35. Kannur Airport
		Airport airport35 = new Airport();

		airport35.airportId = 35;
		airport35.airportName = "Kannur International Airport";
		airport35.cityName = "Kannur";
		airport35.location = "Mattannur";

		Terminal terminal35 = new Terminal();

		terminal35.terminalName = "Main Terminal";
		terminal35.totalGates = 7;
		terminal35.hasInternationalcoustom = true;
		terminal35.passengerCount = 400;

		airport35.terminal = terminal35;
		airport35.getAirportDetails();
			}
		}
				