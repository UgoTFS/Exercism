import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;

class Matrix {

    Integer[][] matriz;
    List<Integer> maxValues = new ArrayList<Integer>();
    List<List<Integer>> elementList;
    int rows;
    int columns;

    Integer getRowLength(){
        return this.elementList.size();
    }

    Integer getColumnLength(){
        return getRowLength() > 0 ? this.elementList.get(0).size() : 0;
    }

    Matrix(List<List<Integer>> values) {
        this.elementList = values;
        if(!values.isEmpty()){
        List<Integer> col = values.get(0);
        this.rows = values.size();
        this.columns = col.size();
        matriz = values.stream().map(arr -> arr.toArray(Integer[]::new)).toArray(Integer[][]::new);
        for(int i = 0; i < this.rows; i++) {
            col = values.get(i);
            maxValues.add(Collections.max(col));
        }}
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        Set<MatrixCoordinate> aux = new HashSet<MatrixCoordinate>();
        int maxValue;
        if(this.matriz == null){
            return aux;
        }
        for(int i = 0; i < this.rows; i++) {
            maxValue = maxValues.get(i);
            for(int j = 0; j < this.columns; j++) {
                if(maxValue == matriz[i][j]){
                    boolean saddle = true;
                    for(int k = 0; k < this.rows; k++){
                        if(maxValue > matriz[k][j]){
                            saddle = false;
                        }
                    }
                    if(saddle){
                        // System.out.println("i, j, k:", i, j, k);
                        aux.add(new MatrixCoordinate(i+1, j+1));
                    }
                }
            }

        }
        return aux;
    }
}
