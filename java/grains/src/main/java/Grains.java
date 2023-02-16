import java.math.BigDecimal;
import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if ( square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return  BigInteger.valueOf(2).pow(square-1);
    }

    BigInteger grainsOnBoard() {
        BigInteger result = BigInteger.valueOf(0);
        for(int i = 0; i < 64; i++){
            result = result.add(grainsOnSquare(i+1));
        }
        return result;
    }

}
