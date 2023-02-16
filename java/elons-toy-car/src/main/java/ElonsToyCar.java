
public class ElonsToyCar {
    public int drivenMileage = 0;
    public int batteryPercentage = 100;

    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        car.setup();

        return car;
    }

    private void setup(){
        drivenMileage = 0;
        batteryPercentage = 100;
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", drivenMileage);
    }

    public String batteryDisplay() {
        if (batteryPercentage <= 0) {
            return ("Battery empty");
        }
        return String.format("Battery at %d%%", batteryPercentage);
    }

    public void drive() {
        

        if (batteryPercentage > 0) {
        drivenMileage += 20;
        batteryPercentage -= 1;
        }
        batteryDisplay();
        distanceDisplay();
    }
}
