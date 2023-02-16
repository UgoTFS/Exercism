import java.util.ArrayList;
import java.util.List;

class HandshakeCalculator {

    List<Signal> handShake = new ArrayList<Signal>();

    boolean comparaBit(int num, int bit) {
        return bit == (int) (num & bit) ? true : false;
    }

    List<Signal> calculateHandshake(int number) {

        // normal order or inverse order
        if (!comparaBit(number, 16)) {

            if (comparaBit(number, 1)) {
                handShake.add(Signal.WINK);
            }
            if (comparaBit(number, 2)) {
                handShake.add(Signal.DOUBLE_BLINK);
            }
            if (comparaBit(number, 4)) {
                handShake.add(Signal.CLOSE_YOUR_EYES);
            }
            if (comparaBit(number, 8)) {
                handShake.add(Signal.JUMP);
            }
        } else {
            if (comparaBit(number, 8)) {
                handShake.add(Signal.JUMP);
            }
            if (comparaBit(number, 4)) {
                handShake.add(Signal.CLOSE_YOUR_EYES);
            }
            if (comparaBit(number, 2)) {
                handShake.add(Signal.DOUBLE_BLINK);
            }
            if (comparaBit(number, 1)) {
                handShake.add(Signal.WINK);
            }
        }
        return handShake;

    }

}
