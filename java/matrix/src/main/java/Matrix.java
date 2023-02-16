

class Matrix {

    int[][] matriz;

    private int getNumberColumns(String v) {
        String[] aux = v.split(" ");
        return aux.length;
    }

    Matrix(String matrixAsString) {
        String[] matrixLine = matrixAsString.split(Character.toString('\n'));
        matriz = new int[matrixLine.length][getNumberColumns(matrixLine[0])];

        for (int i = 0; i < matrixLine.length; i++) {
            String[] v = matrixLine[i].split(" ");
            for (int j = 0; j < v.length; j++) {
                matriz[i][j] = Integer.parseInt(v[j]);
            }
        }
    }

    int[] getRow(int rowNumber) {
        return matriz[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
        int[] v = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            v[i] = matriz[i][columnNumber - 1];
        }
        return v;
    }
}
