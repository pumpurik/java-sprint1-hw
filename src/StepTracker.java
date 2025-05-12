import java.util.Scanner;

public class StepTracker {
    int goalByStepsPerDay = 10000;
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    Converter converter = new Converter();

    StepTracker (Scanner scan){
        scanner = scan;
            for (int i = 0; i < monthToData.length; i++){
                monthToData[i]= new MonthData();
            }

    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        if (month < 1 || month > 12){
            System.out.println("Неверно введен номер месяца");
            return;
        }
        System.out.println("Введите номер дня");
        int day = scanner.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Неверно введен номер дня");
            return;
        }
        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();
        if (steps < 0){
            System.out.println("Неверно введено количество шагов");
            return;
        }
        monthToData[month - 1].days[day - 1] = steps;
    }

    void changeStepGoal(){
        System.out.println("Введите цель шагов на день");
        int goal = scanner.nextInt();
        if (goal < 0 || goal == 0){
            System.out.println("Неверно введена цель");
            return;
        }
    }

    void printStatistic() {
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        if (month < 1 || month > 12){
            System.out.println("Неверно введен номер месяца");
            return;
        }
        monthToData[month - 1].printDaysAndStepsFromMonth();
        System.out.println("общее количество шагов за месяц: " + monthToData[month - 1].sumStepsFromMonth());
        System.out.println("максимальное пройденное количество шагов в месяце: " + monthToData[month - 1].maxSteps());
        int sum =  monthToData[month - 1].sumStepsFromMonth();
        System.out.println("cреднее количество шагов за месяц: " + (sum/30)); //можно в метод но по тз вроде нет такого
        System.out.println("пройденная дистанция (в км): " + converter.convertToKm(sum));
        System.out.println("количество сожжённых килокалорий: " + converter.convertStepsToKilocalories(sum));
        System.out.println("лучшая серия: максимальное количество подряд идущих дней, " +
                "в течение которых количество шагов за день было равно или выше целевого " +
                monthToData[month - 1].bestSeries(goalByStepsPerDay));

    }
}
