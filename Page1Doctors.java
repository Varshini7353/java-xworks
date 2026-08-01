class Page1Doctors{
	
	public static void getPage1Doctors(){
		
		
		Hospital doctor=new Hospital();
		
		String []specializations={"Diabetology","Endocrinology" ,"Endocrinology"};
		
		doctor.doctorId=1;
		doctor.dName="Dr. Anoop Misra";
		doctor.designation="Executive Chairman ";
		doctor.specialization=specializations;
		doctor.experience="40 years";
		doctor.fees=2800;
		
		System.out.println("DoctorId:"+doctor.doctorId);
		System.out.println("Doctor name:"+doctor.dName);
		System.out.println("Designation:"+doctor.designation);
		System.out.println("specializations are:");
		for(String Specializations:doctor.specialization){
			System.out.println(Specializations);
		}
		System.out.println("Experience:"+doctor.experience);
		System.out.println("Fees:"+doctor.fees);
		System.out.println("------------------------------------");
		
		
		
		Hospital doctor1=new Hospital();
		
		String []specializations1={"General Surgery","Bariatric Surgery", "Robotic Surgery", "General Surgery ", "General and Minimal"," Access Surgery"," General and Laparoscopic ","Surgery"};
		
		doctor1.doctorId=2;
		doctor1.dName="Dr. (Prof.) Amit Javed";
		doctor1.designation="Principal Director ";
		doctor1.specialization=specializations;
		doctor1.experience="25 years";
		doctor1.fees=1500;
		
		System.out.println("DoctorId:"+doctor1.doctorId);
		System.out.println("Doctor name:"+doctor1.dName);
		System.out.println("Designation:"+doctor1.designation);
		System.out.println("specializations are:");
		for(String Specializations1:doctor1.specialization){
			System.out.println(Specializations1);
		}
		System.out.println("Experience:"+doctor1.experience);
		System.out.println("Fees:"+doctor1.fees);
		System.out.println("------------------------------------");
		
		
		
		Hospital doctor2=new Hospital();
		
		String []specializations2={"Cardiac Sciences", "Interventional Cardiology"};
		
		doctor2.doctorId=3;
		doctor2.dName="Dr. (Prof.) Amit Javed";
		doctor2.designation="Principal Director Cardiology";
		doctor2.specialization=specializations;
		doctor2.experience="35 years";
		doctor2.fees=2000;
		
		System.out.println("DoctorId:"+doctor2.doctorId);
		System.out.println("Doctor name:"+doctor2.dName);
		System.out.println("Designation:"+doctor2.designation);
		System.out.println("specializations are:");
		for(String Specializations2:doctor2.specialization){
			System.out.println(Specializations2);
		}
		System.out.println("Experience:"+doctor2.experience);
		System.out.println("Fees:"+doctor2.fees);
		System.out.println("------------------------------------");
		
		
		
		
		Hospital doctor3=new Hospital();
		
		String []specializations3={"Support Specialties" ,"General Physician","Internal Medicine"};
		
		doctor3.doctorId=4;
		doctor3.dName="Dr. Ajay Agarwal";
		doctor3.designation="Chairman  ";
		doctor3.specialization=specializations;
		doctor3.experience="25 years";
		doctor3.fees=1400;
		
		System.out.println("DoctorId:"+doctor3.doctorId);
		System.out.println("Doctor name:"+doctor3.dName);
		System.out.println("Designation:"+doctor3.designation);
		System.out.println("specializations are:");
		for(String Specializations3:doctor3.specialization){
			System.out.println(Specializations3);
		}
		System.out.println("Experience:"+doctor3.experience);
		System.out.println("Fees:"+doctor3.fees);
		System.out.println("------------------------------------");
		
		
		
		
		Hospital doctor4=new Hospital();
		
		String []specializations4={"Cardiac Sciences "," Vascular Surgery","Adult CTVS", "Cardiothoracic and Vascular Surgery"," Paediatric CTVS (Cardiothoracic and Vascular Surgery)"," Heart Transplant"};
		
		doctor4.doctorId=5;
		doctor4.dName="Dr. Ajay Kaul";
		doctor4.designation="Chairman Cardiac Science  ";
		doctor4.specialization=specializations;
		doctor4.experience="38 years";
		doctor4.fees=1600;
		
		System.out.println("DoctorId:"+doctor4.doctorId);
		System.out.println("Doctor name:"+doctor4.dName);
		System.out.println("Designation:"+doctor4.designation);
		System.out.println("specializations are:");
		for(String Specializations4:doctor4.specialization){
			System.out.println(Specializations4);
		}
		System.out.println("Experience:"+doctor4.experience);
		System.out.println("Fees:"+doctor4.fees);
		System.out.println("------------------------------------");
		
		
		
		Hospital doctor5 = new Hospital();

		String[] specializations5 = {"General Surgery","General and Minimal Access Surgery",
		"Laparoscopic Surgery","GI", "Minimal Access and Bariatric Surgery","Metabolic & Bariatric Surgery",
		"Gastroenterology and Hepatobiliary Sciences","Robotic Surgery"};

		doctor5.doctorId = 6;
		doctor5.dName = "Dr. Ajay Kumar Kriplani";
		doctor5.designation = "Principal Director ";
		doctor5.specialization = specializations5;
		doctor5.experience = "40 years";
		doctor5.fees = 1500;

		System.out.println("DoctorId:" + doctor5.doctorId);
		System.out.println("Doctor name:" + doctor5.dName);
		System.out.println("Designation:" + doctor5.designation);
		System.out.println("specializations are:");
		for(String Specializations5 : doctor5.specialization){
			System.out.println(Specializations5);
		}
		System.out.println("Experience:" + doctor5.experience);
		System.out.println("Fees:" + doctor5.fees);
		System.out.println("------------------------------------");
		
		
		
		Hospital doctor6 = new Hospital();

		String[] specializations6 = {"Organ Transplant","Kidney Transplant","Nephrology","Nephrology"};

		doctor6.doctorId = 7;
		doctor6.dName = "Dr. Ajit Singh Narula";
		doctor6.designation = "Principal Director Nephrology";
		doctor6.specialization = specializations6;
		doctor6.experience = "40 years";
		doctor6.fees = 2000;

		System.out.println("DoctorId:" + doctor6.doctorId);
		System.out.println("Doctor name:" + doctor6.dName);
		System.out.println("Designation:" + doctor6.designation);
		System.out.println("specializations are:");
		for(String Specializations6 : doctor6.specialization){
			System.out.println(Specializations6);
		}
		System.out.println("Experience:" + doctor6.experience);
		System.out.println("Fees:" + doctor6.fees);
		System.out.println("------------------------------------");
		
		
		
		
		Hospital doctor7 = new Hospital();

		String[] specializations7 = {"Orthopaedics","Orthopaedics and Joint Replacement",
		"Orthopaedics Sports Medicine","Robotic and Computer Navigated Joint Reconstruction"};

		doctor7.doctorId = 8;
		doctor7.dName = "Dr. Amite Pankaj Aggarwal";
		doctor7.designation = "Principal Director ";
		doctor7.specialization = specializations7;
		doctor7.experience = "27 years";
		doctor7.fees = 1500;

		System.out.println("DoctorId:" + doctor7.doctorId);
		System.out.println("Doctor name:" + doctor7.dName);
		System.out.println("Designation:" + doctor7.designation);
		System.out.println("specializations are:");
		for(String Specializations7 : doctor7.specialization){
			System.out.println(Specializations7);
		}
		System.out.println("Experience:" + doctor7.experience);
		System.out.println("Fees:" + doctor7.fees);
		System.out.println("------------------------------------");
				
		
		
		Hospital doctor8 = new Hospital();

		String[] specializations8 = {"Urology","Uro-Oncology","Robotic Surgery","Organ Transplant",
		"Kidney Transplant"};

		doctor8.doctorId = 9;
		doctor8.dName = "Dr. Anil Mandhani";
		doctor8.designation = "Chairman-Urology";
		doctor8.specialization = specializations8;
		doctor8.experience = "35 years";
		doctor8.fees = 2000;

		System.out.println("DoctorId:" + doctor8.doctorId);
		System.out.println("Doctor name:" + doctor8.dName);
		System.out.println("Designation:" + doctor8.designation);
		System.out.println("specializations are:");
		for(String Specializations8 : doctor8.specialization){
			System.out.println(Specializations8);
		}
		System.out.println("Experience:" + doctor8.experience);
		System.out.println("Fees:" + doctor8.fees);
		System.out.println("------------------------------------");
		
			
		
		
		Hospital doctor9 = new Hospital();

		String[] specializations9 = {"Cardiac Sciences","Electrophysiology"};

		doctor9.doctorId = 10;
		doctor9.dName = "Dr. Anil Saxena";
		doctor9.designation = "Chairman Cardiology";
		doctor9.specialization = specializations9;
		doctor9.experience = "35 years";
		doctor9.fees = 2000;

		System.out.println("DoctorId:" + doctor9.doctorId);
		System.out.println("Doctor name:" + doctor9.dName);
		System.out.println("Designation:" + doctor9.designation);
		System.out.println("specializations are:");
		for(String Specializations9 : doctor9.specialization){
			System.out.println(Specializations9);
		}
		System.out.println("Experience:" + doctor9.experience);
		System.out.println("Fees:" + doctor9.fees);
		System.out.println("------------------------------------");
		
		
		
		Hospital doctor10 = new Hospital();

		String[] specializations10 = {"Paediatrics","Paediatric Cardiac Sciences"};

		doctor10.doctorId = 11;
		doctor10.dName = "Dr. Anita Saxena";
		doctor10.designation = "Executive Director Paediatric Cardiology";
		doctor10.specialization = specializations10;
		doctor10.experience = "40 years";
		doctor10.fees = 2000;

		System.out.println("DoctorId:" + doctor10.doctorId);
		System.out.println("Doctor name:" + doctor10.dName);
		System.out.println("Designation:" + doctor10.designation);
		System.out.println("specializations are:");
		for(String Specializations10 : doctor10.specialization){
			System.out.println(Specializations10);
		}
		System.out.println("Experience:" + doctor10.experience);
		System.out.println("Fees:" + doctor10.fees);
		System.out.println("------------------------------------");
		
		
		
		Hospital doctor11 = new Hospital();

		String[] specializations11 = {"Oncology","Oncology","Medical Oncology"};

		doctor11.doctorId = 12;
		doctor11.dName = "Dr. Ankur Bahl";
		doctor11.designation = "Principal Director Medical Oncology";
		doctor11.specialization = specializations11;
		doctor11.experience = "20 years";
		doctor11.fees = 1800;

		System.out.println("DoctorId:" + doctor11.doctorId);
		System.out.println("Doctor name:" + doctor11.dName);
		System.out.println("Designation:" + doctor11.designation);
		System.out.println("specializations are:");
		for(String Specializations11 : doctor11.specialization){
			System.out.println(Specializations11);
		}
		System.out.println("Experience:" + doctor11.experience);
		System.out.println("Fees:" + doctor11.fees);
		System.out.println("------------------------------------");
		
	}		
}