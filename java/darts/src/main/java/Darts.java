class Darts {

    double innerCircle = 1.0;
    double middleCircle = 5.0;
    double outerCircle = 10.0;

    double distance (int x, int y) {
        return Math.sqrt(x*x + y*y);
    }

    double distance (Double x, Double y) {
        return Math.sqrt(x*x + y*y);
    }


    int score(int xOfDart, int yOfDart) {
        if (distance( xOfDart, yOfDart) <= innerCircle){
            return 10;
        }
        if (distance(xOfDart, yOfDart) <= middleCircle){
            return 5;
        }
        if (distance(xOfDart, yOfDart) <= outerCircle){
            return 1;
        }
        return 0;
    }

    int score(double xOfDart, double yOfDart) {
        if (distance( xOfDart, yOfDart) <= innerCircle){
            return 10;
        }
        if (distance(xOfDart, yOfDart) <= middleCircle){
            return 5;
        }
        if (distance(xOfDart, yOfDart) <= outerCircle){
            return 1;
        }
        return 0;
    }
}
