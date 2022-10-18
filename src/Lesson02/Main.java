package Lesson02;

public class Main {
    static void myTitle(String fname, int age, String prof) {
        System.out.println("Меня зовут " + fname + ", " + "мне " + age + " лет. " + prof);
    }



    static void iKnowDataTypes(){
        byte first = 5;
        short second = 5000;
        int third  = 100000;
        long fourth = 522337203685477580L;
        float fifth = 5.75f;
        double sixth = 10.99d;
        boolean seventh = true;
        char eighth = 65;
        String tenth = "А вот и все типы данных в Java";
        System.out.println(tenth);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);
        System.out.println(sixth);
        System.out.println(seventh);
        System.out.println(eighth);
    }

    public static void main(String[] args) {
        myTitle("Станислав Казанцев", 27, "Врач-патологоанатом");
        iKnowDataTypes();

    }
}
