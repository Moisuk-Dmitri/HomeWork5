public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1 & 2");

        int clientOS = 1;
        int clientDeviceYear = 2014;

        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("Task 3");

        int year = 2021;

        if (year > 1584 && (year % 4) == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println("Task 4");

        int deliveryDistance = 95;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Доставка не осуществляется");
        }

        System.out.println("Task 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");
                break;
            case 2:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");
                break;
            case 3:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");
                break;
            case 4:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");
                break;
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");
                break;
            case 6:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");
                break;
            case 7:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");
                break;
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");
                break;
            case 9:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");
                break;
            case 10:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");
                break;
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");
                break;
            case 12:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");
                break;
            default:
                System.out.println("Введен неправильный номер месяца");
                break;
        }
    }
}
