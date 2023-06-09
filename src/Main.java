// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1(){
        System.out.println("Task 1");
        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Install iOS");
        } else {
            System.out.println("Install Android");
        }
    }

    public static void task2() {
        System.out.println("Task 2");
        int clientOS = 0;
        int clientDeviceYear = 2013;

        if ( clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Install light iOS");
            } else {
                System.out.println("Install light Android");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Install iOS");
            } else {
                System.out.println("Install Android");
            }
        }
    }

    public static void task3() {
        System.out.println("Task 3");
        int year = 2023;
        System.out.println("Year " + year);
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Regular year");
        }
    }

    public static void task4() {
        System.out.println("Task 4");
        int deliveryDistance = 95;
        int deliveryTime = 0;

        if (deliveryDistance < 20) {
            deliveryTime = 1;
        } else if ( deliveryDistance >=20 && deliveryDistance < 60) {
            deliveryTime = 2;
        } else if ( deliveryDistance >=60 && deliveryDistance < 100 ) {
            deliveryTime = 3;
        } else {
            deliveryTime = 999;
        }

        if (deliveryTime != 999) {
            System.out.println("Delivery time is " + deliveryTime + " days");
        } else {
            System.out.println("Delivery is not possible");
        }
    }

    public static void task5() {
        System.out.println("Task 5");
        int monthNumber = 1;

        switch(monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Month " + monthNumber + " is winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Month " + monthNumber + " is spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Month " + monthNumber + " is summer");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Month " + monthNumber + " is fall");
                break;

            default:
                System.out.println("Month number " + monthNumber + " is invalid");
        }
    }
}