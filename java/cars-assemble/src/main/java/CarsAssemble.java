public class CarsAssemble {
    static int productionBrute = 221;

    public double productionRatePerHour(int speed) {
        if (speed <= 4){
            return speed*productionBrute;
        }
        if (speed <= 8){
            return speed*productionBrute*0.9;
        }
        if (speed <= 9){
            return speed*productionBrute*0.8;
        }
        if (speed <= 10){
            return speed*productionBrute*0.77;
        }
        throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRateperHour() method");
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60;
    }
}
