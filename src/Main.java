public class Main {
    public static void main(String[] args) {
        task1();
        //task2();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        /*С помощью цикла while посчитайте, сколько месяцев потребуется,
        чтобы накопить 2 459 000 рублей при условии, что первоначально мы имеем 0 рублей
        и готовы откладывать по 15 тысяч рублей.*/

        int total = 0;
        int accum = 15_000;
        int month = 0;

        while (total < 2_459_000) {
            total += accum;
            month ++;
            System.out.println("Месяц " + month + ", сумма накоплений равна "+ total + " рублей");
        }

        //System.out.println("Месяц " + month + ", сумма накоплений равна "+ total + " рублей");
    }


}