package groupProject;

public class E8 {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 50},
                {25, 35, 66},
                {80, 90, 78, 45},
                {45, 55, 66}


        }; int max=matrix[0][0],min=matrix[0][0];
        for (int i=0; i< matrix.length; i++){
            for (int j=0;j<matrix[i].length;j++)
            if (matrix[i][j]>max){
                max=matrix[i][j];

            } else if (matrix[i][j]<min){
                min=matrix[i][j];
            }

        }
        System.out.println("The largest number of the matrix array is "+max);
        System.out.println("The smallest number of the matrix array is "+min);
    }
}