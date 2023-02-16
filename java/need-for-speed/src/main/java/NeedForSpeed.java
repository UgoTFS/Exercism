import java.sql.BatchUpdateException;

class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int mileage;
    private int battery;
    // TODO: define the constructor for the 'NeedForSpeed' class
    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.mileage = 0;
        this.battery = 100;
    }

    public boolean batteryDrained() {
        return battery <= 0 ? true : false;
    }

    public int distanceDriven() {
        return this.mileage;
    }

    public void drive() {
        if (!this.batteryDrained()) {
        this.mileage = this.mileage + this.speed;
        this.battery -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed( 50, 4);
        return car;
    }
}

class RaceTrack {
    private int distance;
    // TODO: define the constructor for the 'RaceTrack' class
    public RaceTrack(int distance){
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        while (!car.batteryDrained()){
            car.drive();
            if (car.distanceDriven() >= this.distance){
                return true;
            }
        }
        return false;
    }
}
