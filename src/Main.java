public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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

    public static void task2() {
        System.out.println("Задача 2");
        /*Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        Не забудьте выполнить переход на новую строку между двумя циклами.
        В результате программы вывод должен получиться следующий:*/

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        for (int j = 10; j > 0; j -= 1) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}