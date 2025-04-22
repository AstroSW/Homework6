public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print( i +"   ");
        }
        System.out.println();
        System.out.println();

        // Задача 2
        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print( i +"   ");
        }
        System.out.println();
        System.out.println();

        // Задача 3
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.print( i +"   ");
        }
        System.out.println();
        System.out.println();

        // Задача 4
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print( i +"   ");
        }
        System.out.println();
        System.out.println();

        // Задача 5
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println( i +" год является високосным");
        }
        System.out.println();

        // Задача 6
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i+"   ");
        }
        System.out.println();
        System.out.println();

        // Задача 7
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i+"   ");
        }
        System.out.println();
        System.out.println();

        // Задача 8
        System.out.println("Задача 8");
        int salary = 29000;
        double total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц "+ i +", сумма накоплений равна "+ total +" рублей");
        }
        System.out.println();

        // Задача 9
        System.out.println("Задача 9");
        total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total * 1.01;
            total = total + salary;
            System.out.println("Месяц "+ i +", сумма накоплений равна "+ total +" рублей");
        }
        System.out.println();

        // Задача 10
        System.out.println("Задача 10");
        int number = 2;
        int result = number;
        for (int i = 1; i <= 10; i++) {
            result = i * 2;
            System.out.println(number +" * "+ i +" = "+ result);
        }
    }
}