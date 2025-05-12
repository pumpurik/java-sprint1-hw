public class MonthData {
    int days[] = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + " день: " + days[i]);
        }
    }

    int sumStepsFromMonth() {
        int sumOfSteps = 0;
        for (int day : days) {
            sumOfSteps += day;
        }
        return sumOfSteps;
    }

    int maxSteps() {
        int maxSteps = 0;
        for (int day : days) {
            if (maxSteps < day) {
                maxSteps=day;
            }
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i ++){
            if (days[i] >= goalByStepsPerDay && days[i + 1] >= goalByStepsPerDay){
                currentSeries +=  1;
            } else {
                if (currentSeries > finalSeries) {
                    finalSeries = currentSeries;
                }
                currentSeries = 0;
            }
        }
        return finalSeries + 1;
    }
}
