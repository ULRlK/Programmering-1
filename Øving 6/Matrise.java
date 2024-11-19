
import java.util.Arrays;





public class Matrise {
    public int[][] matrix;

    public Matrise(int[][] mat){
        this.matrix = mat;
    }

    public void tilString(){
        for (int[] matrix1 : this.matrix) {
            System.out.println(Arrays.toString(matrix1));
        }
    }

    public Matrise addMatrise(Matrise mat){
        int[][] test = new int[this.matrix.length][this.matrix[0].length];
        if (this.matrix.length == mat.matrix.length & this.matrix[0].length == mat.matrix[0].length){
            for (int i = 0; i < this.matrix.length; i++) {
                for (int j = 0; j < this.matrix[0].length; j++) {
                    test[i][j] = this.matrix[i][j] + mat.matrix[i][j]; 
                }
            }
            
        }
        return new Matrise(test);
    }

    /*
     * Matrisemultiplikasjon
     * Rad ganges med sølje
     * 3x3 blir sånn her:
     * i[0][0] * j[0][0] + i[0][1] * j[1][0] + i[0][2] * j[2][0]
     */

    public Matrise gangeMatrise(Matrise mat){
        int[][] result = new int[this.matrix[0].length][mat.matrix.length];
        if (this.matrix[0].length != mat.matrix.length){
            return null;
        }
        for (int i = 0; i < mat.matrix[0].length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                result[i][j] = 0;
                for (int k = 0; k < mat.matrix.length; k++) {
                    result[i][j] +=   this.matrix[j][k] * mat.matrix[k][j]; 
                }
                 
            }
            
        }
        
        return new Matrise(result);
    }

    


    public static void main(String[] args) {
        int[][] test1 = {{1,2},{2,1}};
        int[][] test2 = {{1,2},{2,1}};

        Matrise test3 = new Matrise(test1);
        Matrise test4 = new Matrise(test2);

        Matrise testGanging = test3.gangeMatrise(test4);

        testGanging.tilString();
        
    }
}
