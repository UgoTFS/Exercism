import java.util.ArrayList;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1, ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> cars = new ArrayList<ProductionRemoteControlCar>();
        
        if (prc1.getNumberOfVictories() > prc2.getNumberOfVictories()){
            cars.add(prc2);
            cars.add(prc1);
        }
        else{
            cars.add(prc1);
            cars.add(prc2);
        }
        return cars;
    }
}
