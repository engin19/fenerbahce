package groupProject;

public class E4 {
    public static void main(String[] args) {
                int[][] matrix = {
                        {10, 20, 50},
                        {25, 35, 66},
                        {80, 90, 78, 45},
                        {45, 55, 66}


                }; int sum1 = 0,sum2=0;
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (matrix[i][j] % 2 == 0){
                            sum1=sum1+matrix[i][j];
                        }else{
                            sum2=sum2+matrix[i][j];
                        }
                    }
                }
                        System.out.println("The sum of all even numbers is "+sum1);
                        System.out.println("The sum of all odd numbers is "+sum2);
    }

                }

