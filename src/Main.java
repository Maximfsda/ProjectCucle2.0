public class Main {
    public static void main(String[] args) {
        //HomeworkOne
        //Task1
        double sum = 0;
        int month = 0;

        while (sum <= 2_459_000) {
            sum += 15_000 + (sum * 0.01);
            month++;
        }
        System.out.println("Месяц " + month + " ,сумма накоплений равна " + sum + " рублей");
        System.out.println();
        //Task2
        int i = 1;
        while (i <= 10) {
            System.out.printf(i + " ");
            i++;
        }
        i--;
        System.out.println();

        for (; i >= 1; i--) {
            System.out.printf(i + " ");
        }
        System.out.println();
        System.out.println();
        //Task3
        double populationСountry = 12_000_000;
        int year = 1;
        int fertility = 17;
        int mortalityRate = 8;

        for (; year <= 10; year++) {
            populationСountry = (populationСountry / 1000) * fertility + (populationСountry / 1000) * mortalityRate + populationСountry;
            System.out.println("Год " + year + ",численность населения составляет " + populationСountry + ".");
        }
        System.out.println();
        //HomeworkTwo
        //Task1
        sum = 0;
        month = 1;
        double percent = 0.07;

        while (sum <= 12_000_000) {
            sum = 15_000 + (sum * percent + sum);
            System.out.println("Месяц " + month + " ,сумма накоплений равна " + sum + " рублей");
            month++;
        }

        System.out.println();
        //Task2
        month = 1;
        sum = 0;

        while (sum <= 12_000_000) {
            sum = 15_000 + (sum * percent + sum);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " ,сумма накоплений равна " + sum + " рублей");
            }
            month++;
        }
        System.out.println();
        //Task3
        sum = 15000;
        month = 1;
        int monthsPerYear = 108;

        while (month <= monthsPerYear) {
            sum = 15_000 + (sum * percent + sum);
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " ,сумма накоплений равна " + sum + " рублей");
            }
            month++;
        }
        System.out.println();
        //Task4
        int monthOne = 31;

        for (int day = 5; day <= monthOne; day = day + 7) {
            System.out.println("Сегодня пятница," + day + " число.Необходимо подготовить отчет.");
        }
        System.out.println();
        //HomeworkThree
        //Task1
        int givenYear = 2022;
        int oneHundredYearsLater = 2122;
        int twoHundredYearsEarlier = 1822;
        int yearCameta;
        for (yearCameta = 79; yearCameta <= oneHundredYearsLater; yearCameta += 79) {
            if (yearCameta >= twoHundredYearsEarlier) {
                System.out.println(yearCameta);
            }
        }
        System.out.println();

        //Task2
        int multiplicationNumber = 2;
        for (int multiplication = 1; multiplication <= 10; multiplication++) {
            int summ = multiplicationNumber * multiplication;
            System.out.println(multiplicationNumber + "*" + multiplication + "=" + summ);
        }
    }
}

