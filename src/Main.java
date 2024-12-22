public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int diseredSum = 2_459_000;
        int sum = 0;
        int amount = 15_000;
        double percent = 1D / 100;
        int month = 0;
        while (sum < diseredSum) {
            sum += amount;
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertilityPerThousend = 17;
        int mortalityPerThousend = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += population * fertilityPerThousend / 1000 - population * mortalityPerThousend / 1000;
            System.out.println("Год " + year + ", численность населения составляет" + population);
        }
        System.out.println();
        System.out.println("Задача 4");
        percent = 7D / 100;
        diseredSum = 12_000_000;
        sum = amount;
        month = 0;
        while (sum < diseredSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();
        System.out.println("Задача 5");
        sum = amount;
        month = 0;
        while (sum < diseredSum) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
            }
            System.out.println();
            System.out.println("Задача 6");
            sum = amount;
            month = 0;
            int months = 9 * 12;
            while (month < months) {
                sum = (int) (sum * (1 + percent));
                month++;
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
                }
                System.out.println();
                System.out.println("Задача 7");
                int firstFriday = 3;
                for (int day = firstFriday; day <= 31; day += 7) {
                    System.out.println("Сегодня пятница " + day + "-е число. Необходимо подготовить отчёт.");
                }
                System.out.println();
                System.out.println("Задача 8");
                int period = 79;
                int startSeeing = 0;
                int start = currentYear - 200;
                int end = currentYear + 100;
                for (int year = startSeeing; year < end; year += period) {
                    if (year > start) {
                        System.out.println(year);
                    }
                }
            }
        }
    }
}