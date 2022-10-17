package com.skypro;

public class Main {
    public static void main(String[] args) {
        System.out.println("String");

        advertString();
        changeCaseUp();
        changeSymbol();

        System.out.println("HomeWork Complete");
    }

    //task-3
    private static void changeSymbol() {
        System.out.println("Task-3");

        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");

        System.out.printf("Данные ФИО сотрудника — %s.\n", fullName);

        System.out.println();

    }

    //task-2
    private static void changeCaseUp() {
        System.out.println("Task-2");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;

        String caseUp =  fullName.toUpperCase();

        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s.\n", caseUp);

        System.out.println();
    }

    //task-1
    private static void advertString() {
        System.out.println("Task-1");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.printf("ФИО сотрудника — %s.\n", fullName);

        System.out.println();
    }
}
