public class Converter {
    int centimeters = 75;
    int calories = 50;
    int countDistance (int month, StepTracker data){
        int sum = data.countStepsPerMonth (month);
        int km=(sum*centimeters)/100000;
        return km;
    }
    int countCalories (int month, StepTracker data){
        int sum = data.countStepsPerMonth (month);
        int kilocalories=(sum*calories)/1000;
        return kilocalories;
    }
}

