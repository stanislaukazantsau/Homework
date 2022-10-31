package Lesson04;

public class Patient {
    private String firstName;
    private String secondName;
    private int age;
    private int numberOfHistory;
    private int id;
    private String disease;
    private String[] diary;
    private int timeOfTreatment;

    public Patient(String firstName, String secondName, int age, int numberOfHistory, int id, String disease, String[] diary, int timeOfTreatment) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.numberOfHistory = numberOfHistory;
        this.id = id;
        this.disease = disease;
        this.diary = diary;
        this.timeOfTreatment = timeOfTreatment;
    }

    public Patient(String firstName, String secondName, int age, int id, String disease, String[] diary, int timeOfTreatment) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.id = id;
        this.disease = disease;
        this.diary = diary;
        this.timeOfTreatment = timeOfTreatment;
    }

    public Patient(){
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfHistory() {
        return numberOfHistory;
    }

    public int getId() {
        return id;
    }

    public String getDisease() {
        return disease;
    }

    public String[] getDiary() {
        return diary;
    }

    public int getTimeOfTreatment() {
        return timeOfTreatment;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumberOfHistory(int numberOfHistory) {
        this.numberOfHistory = numberOfHistory;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setDiary(String[] diary) {
        this.diary = diary;
    }

    public void setTimeOfTreatment(int timeOfTreatment) {
        this.timeOfTreatment = timeOfTreatment;
    }
}
