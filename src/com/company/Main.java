package com.company;

public class Main {

    public static void main(String[] args) {
        int clientOS = 1, clientDeviceYear = 2015, year = 2021, deliveryDistance = 95, deliveryTime = 1, monthNumber = 12;

        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }


        if (year %100 == 0 && year %400 == 0 )
            System.out.println(year + " год является високосным");
        else if (year % 4 == 0 && year % 100 > 0)
            System.out.println(year + " год является високосным");
        else if (year % 100 == 0)
            System.out.println(year + " год не является високосным");
        else
            System.out.println(year + " год не является високосным");


        if (deliveryDistance >= 60)
            System.out.println("Потребуется дней: " + (deliveryTime + 2));
        else if (deliveryDistance >= 20)
            System.out.println("Потребуется дней: " + (deliveryTime + 1));
        else
            System.out.println("Потребуется дней: " + deliveryTime);


        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима"); break;
            case 3:
            case 4:
            case 5: System.out.println("весна"); break;
            case 6:
            case 7:
            case 8: System.out.println("лето"); break;
            case 9:
            case 10:
            case 11: System.out.println("осень"); break;
            default: System.out.println("Некорректный номер месяца"); break;
        }
    }
}
