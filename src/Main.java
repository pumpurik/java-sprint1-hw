import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            printMenu();
            int i = scanner.nextInt();
            // здесь будет работа с командами

            if (i == 1) {
                // здесь будет логика команды 1
                stepTracker.addNewNumberStepsPerDay();
            } else if (i == 2) {
                // здесь будет логика команды 2
                stepTracker.changeStepGoal();
            } else if (i == 3) {
                // здесь будет логика команды 3
                stepTracker.printStatistic();
            } else if (i == 4) {
                System.out.println("Пока!");
                scanner.close();
                return;
            } else {
                System.out.println("Такой команды нет");
            }
        }
    }
    static void printMenu() {
        System.out.println("Что вы хотите сделать? 1 - ввести количество шагов за определённый день, " +
                "2 - изменить цель по количеству шагов в день, 3 - напечатать статистику за определённый месяц, " +
                "4 - выйти из приложения");
    }
}

