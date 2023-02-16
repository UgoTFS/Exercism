class ProductionRemoteControlCar implements RemoteControlCar{

    private int speed = 10;
    private int numberofVictories;
    private int mileage = 0;

    public void drive() {
        this.mileage += this.speed;
    }

    public int getDistanceTravelled() {
        return this.mileage;
    }

    public int getNumberOfVictories() {
        return this.numberofVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.numberofVictories = numberofVictories;
    }
}
