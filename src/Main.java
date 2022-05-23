public class Main {
    public static void main(String[] args) {

//        Задание 1
//
//        int clientOS = 0;
//        if (clientOS == 1){
//            System.out.println("Установите версию приложения для iOS по ссылке");
//        }
//        else System.out.println("Установите версию приложения для Android по ссылке");

//          Задание 2

//        int clientDeviceYear =2012;
//        int clientOS = 0;
//        if (clientOS == 1){
//            if (clientDeviceYear < 2015){
//                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
//            }
//            else System.out.println("Установите версию приложения для iOS по ссылке");
//        }
//        else if (clientOS == 0) {
//            if (clientDeviceYear < 2015){
//                System.out.println("Установите облегченную версию приложения для Android  по ссылке");
//            }
//            else System.out.println("Установите версию приложения для Android  по ссылке");
//        }
//        else System.out.println("Ваша ОС не поддерживается");

//        Задание 3

//        int year = 2000;
//        if (year % 4 == 0 || year % 400 ==0){
//            if (year % 100 != 0) {
//                System.out.println("Год високосный");
//            }
//            else System.out.println("Год не високосный");
//        }
//        else System.out.println("Год не високосный");
//
//        Задание 4


//        int deliveryDistance = 50;
//        int deliveryDays = 0;
//        if (deliveryDistance <= 20){
//            deliveryDays = 1;
//            System.out.println(deliveryDays + "Days");
//        }
//        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
//            deliveryDays = 2;
//            System.out.println(deliveryDays + "Days");
//        }
//        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
//            deliveryDays = 3;
//            System.out.println(deliveryDays + "Days");
//        }
//        else System.out.println("Доставка не осуществляется");
//
//        Задание 5


        int monthNumber = 13;
        switch (monthNumber){
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("incorrect");
        }
    }
}
