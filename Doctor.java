class Doctor {

    public static void treat(String patientName, String symptom) {

        System.out.println("Treat Started");

        System.out.println("Patient Name : " + patientName);
        System.out.println("Symptom      : " + symptom);

        if(symptom.equalsIgnoreCase("Anemia")){
            System.out.println("Medicine Prescribed : Iron Tablets");
        }else{
            System.out.println("General Consultation");
        }

        System.out.println("Treat Ended");
    }
}