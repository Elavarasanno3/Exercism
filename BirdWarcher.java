package exersiem;

public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
       return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        birdsPerDay[6] = birdsPerDay[6]+1;
    }

    public boolean hasDayWithoutBirds() {
        for(int i : birdsPerDay){
            if(i == 0)
                return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if(numberOfDays > 6){
            numberOfDays = 7;
        }
        for(int i = 0;i<numberOfDays;i++){
            sum+= birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int count = 0;
        for(int i : birdsPerDay){
            if(i > 4){
                count++;
            }
        }
        return count;
    }
}