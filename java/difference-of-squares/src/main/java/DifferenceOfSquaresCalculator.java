class DifferenceOfSquaresCalculator {

    private static int recursionSquareSum(int result, int n) {
        if (n == 0) {
            return result * result;
        }
        return recursionSquareSum(result + n, n - 1);
    }

    private static int recursionSumSquare(int result, int n) {
        if (n == 0) {
            return result;
        }
        return recursionSumSquare(result + (n * n), n - 1);
    }

    int computeSquareOfSumTo(int input) {
        return recursionSquareSum(0, input);
    }

    int computeSumOfSquaresTo(int input) {
        return recursionSumSquare(0, input);
    }

    int computeDifferenceOfSquares(int input) {
        return (computeSquareOfSumTo(input) - computeSumOfSquaresTo(input));
    }

}
