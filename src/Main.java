public class Main {
    public static void main(String[] args) {


        //Задача 1

        // 1=Anddroid
       byte clientOS = 1;
       if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else System.out.println("Установите версию приложения для IOS по ссылке");


        //Задача 2

        int clientDeviceYear = 2_014;
        if (clientOS == 0) {
            if (clientDeviceYear < 2_015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else System.out.println("Установите версию приложения для Android по ссылке");

        } else if(clientDeviceYear >= 2_015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else System.out.println("Установите облегченную версию приложения для iOS по ссылке");


        //Задача 3

        int year = 3_600;
        double yearDel = year % 4;
        double year100 = year % 100;
        if (yearDel == 0) {
            if (year100 == 0)
                System.out.println(year + " год не является високосным");
            else System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");

        //Задача 4

        int deliveryDistance = 95;
        if (deliveryDistance > 20) {
            if (deliveryDistance > 60) System.out.println("Потребуется 3 дня для доставки");
            else System.out.println("Потребуется 2 дня для доставки");
        } else System.out.println("Потребуется 1 день для доставки");

        //Задание 5

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Нет такого месяца");
        }

    }

}