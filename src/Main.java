import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StepTracker data = new StepTracker();
        Converter convert = new Converter();
        Scanner scanner = new Scanner(System.in);
        while (true){
            printMenu();
            int command = scanner.nextInt();
            if (command==1){
                System.out.println("Введите номер месяца: ");
                int month= scanner.nextInt();
                while ((month<=0)||(month>12))
                {
                    System.out.println("Введите номер месяца: ");
                    month= scanner.nextInt();
                }
                System.out.println("Введите номер дня: ");
                int number_day= scanner.nextInt();
                while ((number_day<=0)||(number_day>30))
                {
                    System.out.println("Введите номер дня: ");
                    number_day= scanner.nextInt();
                }
                System.out.println("Введите кол-во шагов: ");
                int steps= scanner.nextInt();
                while (steps<0)
                {
                    System.out.println("Введите кол-во шагов: ");
                    steps= scanner.nextInt();
                }
                data.enterSteps(month,number_day,steps);
            }
            else if (command ==2 ){
                System.out.println("Введите номер месяца: ");
                int month = scanner.nextInt();
                while ((month<=0)||(month>12))
                {
                    System.out.println("Введите номер месяца: ");
                    month= scanner.nextInt();
                }
                data.printStepsPerDay(month);
                System.out.println("Общее количество шагов - " + data.countStepsPerMonth(month));
                System.out.println("Максимальное пройденное количество шагов - " + data.countMaxSteps(month));
                System.out.println("Среднее количество шагов в день составило - " + data.countAverageSteps(month));
                System.out.println("Пройденная дистанция - " + convert.countDistance(month, data) + " км!");
                System.out.println("Вы сожгли - " + convert.countCalories(month,data) + " килокалорий!");
                System.out.println("Лучшая серия - " + data.bestSeriesDays(month) + " подряд идущих дней!");

            }
            else if (command == 3){
                System.out.println("Введите новое целевое значение: ");
                int newGoal = scanner.nextInt();
                while (newGoal<=0)
                {
                    System.out.println("Введите новое целевое значение: ");
                    newGoal = scanner.nextInt();
                }
                data.changeGoal(newGoal);
            }
            else if (command==0){
                System.out.println("Выход из приложения");
                break;
            }
            else{
                System.out.println("Такой команды нет!");
            }
        }
    }
    public static void printMenu(){
        System.out.println(" ");
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - ввести количество шагов за определённый день");
        System.out.println("2 - напечатать статистику за определённый месяц");
        System.out.println("3 - изменить цель по количеству шагов в день");
        System.out.println("0 - выйти из приложения");
    }
}


