import java.util.stream.IntStream;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        if (this.birdsPerDay.length == 0){
            return 0;
        }
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        return IntStream.of(birdsPerDay).anyMatch(x->x==0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        int counter = 0;
        if (numberOfDays > this.birdsPerDay.length){
            numberOfDays = this.birdsPerDay.length;
        } 
        for ( int i=0; i<numberOfDays; i++){
            counter = counter + this.birdsPerDay[i];
        }
        return counter;
    }

    public int getBusyDays() {
        int counter = 0;
        for ( int i : this.birdsPerDay){
            if(i >= 5){
                counter++;
            }
        }
        return counter;
    }
}
