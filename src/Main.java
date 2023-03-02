public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
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
        /*
        Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        Не забудьте выполнить переход на новую строку между двумя циклами.
        В результате программы вывод должен получиться следующий:
        */

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

    public static void task3() {
        System.out.println("Задача 3");
        /*
        В стране Y население равно 12 миллионов человек.
        Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
        Рассчитайте, какая численность населения будет через 10 лет,
        если показатели рождаемости и смертности постоянны.
        В консоль выведите результат операции на каждый год в формате:
        «Год …, численность населения составляет …».
         */

        int population = 12_000_000; // численность
        int birth = 17; // рождаемость
        int death = 8; // смертность
        int perCount = 1_000; // рождаемость и смертность на 1000 чел
        int count; // ввела количество "партий" по 1000 для дальнейших расчетов

        for (int i = 1; i <= 10; i++) {
            count = population / perCount; // сколько раз рождается и умирает на каждые 1000
            population = population + (birth - death) * count;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        /*
        Василий решил положить деньги на накопительный счет,
        где каждый месяц к сумме его вклада добавляется еще 7%.
        Первоначальная сумма вклада — 15 тысяч рублей.
        Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить,
        чтобы собрать сумму в 12 миллионов рублей при условии,
        что процент банка от накоплений не меняется, а всегда равен 7%.
        Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
         */

        double deposit = 15_000;
        double interest = 7;
        double interestRate = interest / 100;
        int month = 1;
        int totalDeposit;
        while (deposit < 12_000_000) {
            deposit = deposit * (1 + interestRate);
            totalDeposit = (int)(deposit);
            System.out.println("В " + month + " месяц Василий накопит " + totalDeposit + " руб.");
            month ++;
        }

        /*
        ВОПРОС!!!!!!
        Задание 4
        почему с типом данных double большие числа выводит с буквой Е?
        пришлось привести к int, чтобы избавиться от этого
         */
    }

    public static void task5() {
        System.out.println("Задача 5");
        /*
        Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд,
        а только каждый шестой. Должны быть видны накопления за 6, 12, 18, 24-й и следующие месяцы.
         */
        double deposit = 15_000;
        double interest = 7;
        double interestRate = interest / 100;
        int month = 1;
        int totalDeposit;
        while (deposit < 12_000_000) {
            deposit = deposit * (1 + interestRate);
            totalDeposit = (int)(deposit);
            if (month % 6 == 0) {
                System.out.println("В " + month + " месяц Василий накопит " + totalDeposit + " руб.");
            }
            month ++;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        /*
        Василий решил, что будет копить деньги ближайшие 9 лет.
        Он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
        Исходная сумма всё та же — 15 тысяч рублей, проценты банка – 7% ежемесячно.
        Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.
         */

        double deposit = 15_000;
        double interest = 7;
        double interestRate = interest / 100;
        int month = 1;
        int totalDeposit;
        //int depositTerm = 9 * 12;
        while (month < 9 * 12) {
            deposit = deposit * (1 + interestRate);
            totalDeposit = (int)(deposit);
            if (month % 6 == 0) {
                System.out.println("За " + (month / 12f) + " г. Василий накопит " + totalDeposit + " руб.");
            }
            month ++;
        }
    }
}