import java.util.Scanner;
public class StepTracker {
    int goal = 10000;
    MonthData[] monthToData;

    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void enterSteps(int month, int num_day, int steps) {
        monthToData[month - 1].day[num_day - 1] = steps;
        System.out.println("Вы прошли: " + monthToData[month - 1].day[num_day - 1] + " шагов " + num_day + " числа " + month + " месяца!");
    }

    void printStepsPerDay(int month) {
        for (int i = 0; i < monthToData[month - 1].day.length; i++) {
            if (i < (monthToData[month - 1].day.length - 1)) {
                System.out.print((i + 1) + " день: " + monthToData[month - 1].day[i] + ", ");
            } else {
                System.out.println((i + 1) + " день: " + monthToData[month - 1].day[i]);
            }
        }
    }

    int countStepsPerMonth(int month) {
        int sum = 0;
        for (int i = 0; i < monthToData[month - 1].day.length; i++) {
            sum = sum + monthToData[month - 1].day[i];
        }
        return sum;
    }

    int countMaxSteps(int month) {
        int maxSteps = 0;
        for (int i = 0; i < monthToData[month - 1].day.length; i++) {
            if (monthToData[month - 1].day[i] > maxSteps) {
                maxSteps = monthToData[month - 1].day[i];
            }
        }
        return maxSteps;
    }

    int countAverageSteps(int month) {
        int sum = countStepsPerMonth(month);
        int average = sum / 30;
        return average;
    }

    void changeGoal(int newGoal) {
        goal = newGoal;
        System.out.println("Новая цель по количеству шагов в день равна " + goal + "!");
    }

    int bestSeriesDays(int month) {
        int countDays = 0;
        int maxCountDays = 0;
        for (int i = 0; i < monthToData[month - 1].day.length; i++) {
            if (monthToData[month - 1].day[i] >= goal) {
                countDays = countDays + 1;
            } else {
                if (countDays > maxCountDays) {
                    maxCountDays = countDays;
                }
                countDays = 0;
            }
        }
        return maxCountDays;
    }
}

