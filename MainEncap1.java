class PatientVinyaa {
    private String name;
    private int age;
    private String diagnosis;
    private String medicalHistory;

    // constructor
    PatientVinyaa(String name, int age) {
        this.name = name;
        this.age = age;
        this.medicalHistory = "No history";
    }

    // setter for diagnosis
    public void setDiagnosis(String diagnosis) {
        if (diagnosis != null && !diagnosis.isEmpty()) {
            this.diagnosis = diagnosis;
        } else {
            System.out.println("Invalid diagnosis");
        }
    }

    // update medical history
    public void updateMedicalHistory(String history) {
        this.medicalHistory = history;
    }

    // getter methods (controlled access)
    public String getPatientDetails() {
        return "Name: " + name + ", Age: " + age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }
}

public class MainEncap1{
    public static void main(String[] args) {
        PatientVinyaa p = new PatientVinyaa("Rahul", 25);

        System.out.println(p.getPatientDetails());

        p.setDiagnosis("Fever");
        p.updateMedicalHistory("No major illness");

        System.out.println("Diagnosis: " + p.getDiagnosis());
        System.out.println("History: " + p.getMedicalHistory());
    }
}