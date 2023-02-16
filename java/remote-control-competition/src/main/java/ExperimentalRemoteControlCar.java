public class ExperimentalRemoteControlCar implements RemoteControlCar{

    private int speed = 20;
    private int mileage = 0;

    public void drive() {
        this.mileage += this.speed;
    }

    public int getDistanceTravelled() {
        return this.mileage;
    }
}
