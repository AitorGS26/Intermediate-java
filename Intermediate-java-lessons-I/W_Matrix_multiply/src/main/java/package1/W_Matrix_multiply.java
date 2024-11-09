/*In the previouss lesson we started learning how to make operations with matrix,
 we learned how to add or subtract same dimensions matrixes

 * In today's lesson we'll be learning how to multyply matrixes.
 
 * The rules of multiplying matrix are different of adding or subtracting,
   here the key is that the first matrix's columns will be same as the lines of the second matrix
   or viceversa.

 * Here the result of the operation is also different, the oprations here aren't position by position
   as in the adding, so the result matrix has the lines of the first matrix with the columns of the 
   second

   [a1][a2][a3]     [c1][d1]     [(a1xc1)+(a2xc2)+(a3xc3)][(a1xd1)+(a2xd2)+(a3xd3)]
   [b1][b2][b3]  x  [c2][d2]  =  [(b1xc1)+(b1xc1)+(b3xc3)][(b1xd1)+(b2xd2)+(b3xd3)] 
                    [c3][d3]
 */
package package1;

public class W_Matrix_multiply {

    public static void main(String[] args) {
        /*It starts declaring the different matrix and putting the dimensions the exercise give us. */
        int Matrix1[][] = new int[2][3];
        int Matrix2[][] = new int[3][2];
        int matrixResult[][] = new int[2][2];
        
        /*Loop for adding the data of each position of the matrix randomly */
        for (int i = 0; i < Matrix1.length; i++) {//i refers to the lines of the matrix1
            for (int j = 0; j < Matrix1[0].length; j++) {/*j refers to the columns of
                matrix1. Adding [0] in j<Matrix1[0] for better understanding for the program*/
                Matrix1[i][j] = (int) (Math.random() * 5);/*we save in matrix i,j random entire 
                numbers between 0 and 4*/
            }
        }
        //same for Matrix2
        for (int i = 0; i < Matrix2.length; i++) {
            for (int j = 0; j < Matrix2[0].length; j++) {
                Matrix2[i][j] = (int) (Math.random() * 5);
            }
        }
        //Making operations
        /* we add an if else structure for each position of matrixResult
         * Above at the explanation we learned the way the operations are done if it's a multiplication
         */
        for (int i = 0; i < 10; i++) {/*We make a for loop for ensuring all the positions 
            will be added properly*/

            if (matrixResult[0][0] == 0) {
                int temp = (Matrix1[0][0] * Matrix2[0][0]) + (Matrix1[0][1] * Matrix2[1][0])
                        + (Matrix1[0][2] * Matrix2[2][0]);

                matrixResult[0][0] = temp;
                /*in each if statement is the same behaviour, we declare an object called temp
                 which will save the data inside the calculations and then we save that data in the 
                 proper position of the matrix
                 */

            } else if (matrixResult[1][0] == 0) {
                int temp = (Matrix1[1][0] * Matrix2[0][0]) + (Matrix1[1][1] * Matrix2[1][0])
                        + (Matrix1[1][2] * Matrix2[2][0]);

                matrixResult[1][0] = temp;

            } else if (matrixResult[0][1] == 0) {
                int temp = (Matrix1[0][0] * Matrix2[0][1]) + (Matrix1[0][1] * Matrix2[1][1])
                        + (Matrix1[0][2] * Matrix2[2][1]);

                matrixResult[0][1] = temp;

            } else if (matrixResult[1][1] == 0) {
                int temp = (Matrix1[1][0] * Matrix2[0][1]) + (Matrix1[1][1] * Matrix2[1][1])
                        + (Matrix1[1][2] * Matrix2[2][1]);

                matrixResult[1][1] = temp;
            }
        }
        //printing the program
        for (int i = 0; i < 3; i++) {/*we've 3 lines because matrix2 has 3 lines and its the largest one
        in lines so we add a for loop and put i<3 because it starts by 0 so last loop will be for 
        "2" line starting by "0"*/

            if (i < 2) {/*We start printing Matrix1, the if statement will add i(lines)<2 because it
                has two lines and we start by 0 */
                for (int j = 0; j < 3; j++) {//same for j(columns) it has 3, starting by 0 last is 2
                    System.out.print("[" + Matrix1[i][j] + "]"); //we print matrix1
                }
                if (i == 1) {/*for a better look, we tell the program to put x symbol when i==1, the second line*/
                    System.out.print("  x  ");
                } else {//if not it will print space (space between matrix)
                    System.out.print("     ");
                }
            } else {
                System.out.print("              ");
                //space for the 3 line, for a better look with matrix2
            }

            for (int j = 0; j < 2; j++) {

                System.out.print("[" + Matrix2[i][j] + "]");
            }
            if (i == 1) {
                System.out.print("  =  ");
            } else {
                System.out.print("     ");
            }
            //The result is 2x2 so starting by 0 the if for lines and loop for columns will be < 2
            if (i < 2) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("[" + matrixResult[i][j] + "]");
                }
            }

            System.out.println(""); //for having the look of matrix
        }
    }
}
