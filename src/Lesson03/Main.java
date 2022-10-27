package Lesson03;

import java.util.Scanner;

public class Main {

    public static void updateLoop30() {
        String str = new String();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please, enter something: ");
            str = scanner.nextLine();
            if (str.equals("Exit") || str.equals("exit")){
                System.out.println("Infinity loop is terminated");
                break;
            } else if (str.length() != 0){
                System.out.println(str);
            }


        }
    }
    public static void updateLoop36(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter a number: ");
        int x = scanner.nextInt();
        while (x < 0) {
            System.out.println("Please, enter a positive number: ");
            x = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }
        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum);
    }

    public static void updateStatements() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, guess a number between 0 and 100: ");
        int number = scanner.nextInt();
        while (number < 0 || number > 100) {
            System.out.println("Incorrect number. Enter a number between 0 and 100: ");
            number = scanner.nextInt();
        }
        if (number >= 70) {
            System.out.println("Congrats! You’ve passed the test!");
        } else {
            System.out.println("Sorry, you’ve failed the test.");
        }
    }

    public static void remoteController() {
        System.out.print("Select channel from 0 to 10: ");
        String[] channels = {"Turn off", "Беларусь1", "Беларусь2", "Беларусь3", "ОНТ", "СТВ", "Спорт", "TW3", "Euro news", "Discovery", "National Geographic"};
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        while (x > 0) {
            System.out.println(channels[x]);
            x = scanner.nextInt();
            if (x == 0){
                System.out.println(channels[x]);
                break;
            }
        }
    }

    public static void extraTask() {
        Scanner scanner = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        int dateOfBirth = 0;
        while (true) {
            System.out.printf("Введите цифру для вызова пункта меню: %n1. Ввести имя. %n2. Ввести фамилию. %n3. Ввести год рождения. %n4. Вывести информацию. %n0. Выход.%n");
            int x = scanner.nextInt();
            switch (x) {
                case 1:
                    Scanner firstCase = new Scanner(System.in);
                    System.out.println("Введите имя: ");
                    String caseName = firstCase.nextLine();
                    firstName = caseName;
                    break;
                case 2:
                    Scanner secondCase = new Scanner(System.in);
                    System.out.println("Введите фамилию: ");
                    String caseLastName = secondCase.nextLine();
                    lastName = caseLastName;
                    break;
                case 3:
                    Scanner thirdCase = new Scanner(System.in);
                    System.out.println("Введите год рождения: ");
                    int caseDateOfBirth = thirdCase.nextInt();
                    dateOfBirth = caseDateOfBirth;
                    break;
                case 4:
                    System.out.println("Имя: " + firstName) ;
                    System.out.println("Фамилия: " +lastName);
                    System.out.println("Год рождения: " + dateOfBirth);
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
    }
    public static void main(String[] args) {
        updateLoop30();
        updateLoop36();
        updateStatements();
        extraTask();
    }
}
