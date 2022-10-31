package Lesson04;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient();
        System.out.println(patient);
        patient.setFirstName("Иван");
        patient.setSecondName("Иванов");
        patient.setAge(56);
        patient.setId(1);
        patient.setNumberOfHistory(1234);
        patient.setDiary(new String[]{"Поступил с острой болью в правом подреберье"});
        patient.setDisease("О. Холецистит");
        patient.setTimeOfTreatment(1);
        System.out.println(patient.getFirstName());
    }



}
