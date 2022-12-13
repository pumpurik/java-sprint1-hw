public class MonthData {
    int[] day;
    public MonthData() {
        day=new int[30];
        for (int i = 0; i < day.length; i++) {
            day[i] = 0;
        }
    }
}
