/*In this lesson we'll be learning how to make an adding or a subtraction of Matrix.

 * Matrix adding and subtraction => The two or more matrixes you'll be using have to be same dimensions
 * The positions will add or subtract with other matrixe's same position, as below.
 * [0,0]+[0,0]=[0,0] first 0 is line second one column.
 * 
 * Matrix 1     Matrix2    matrixResult
    [1][2]     +   [1][2]     = [2][4]
    [3][4]         [3][4]       [6][8]
 */

 /* For a better understandig of all this, we'll do an exercise which result will be like below.
 The numebrs of two matrixes have to be random numbers and it has to have the following appearance:
[2][3][2]     [0][2][1]     [2][5][3]
[2][1][1]  +  [0][1][2]  =  [2][2][3]
[2][1][2]     [2][2][0]     [4][3][2] */
package package1;

public class V_add_subtraction_ofMatrix {

    public static void main(String[] args) {
        /*As the exercise says, we've to start declaring the variables we'll be using.*/
        int matrix1[][] = new int[3][3];//First and second number type matrixes, with 3x3 structure
        int matrix2[][] = new int[3][3];
        int matrixResult[][] = new int[3][3];//finally the result of the adding 

        //First matrix
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix1[i][j] = (int) (Math.random() * 5);
            }
        }
        /*EXPLANATION OF THE LOOP => the first for acts at the lines of matrix 1, and the second one 
         acts at the columns, the method .lenght is for stopping the loop when it arrives to the 
         amount of lines and columns we've declared before 
         
         *Inside the loops we declare that a random number between 0 and 4 that is an entire number (int)
         will be filled in matrix1's lines [i] and columns [j]*/

        //second matrix. This is same as Matrix1 but for Matrix2.
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                matrix2[i][j] = (int) (Math.random() * 5);
            }
        }

        //Adding or subtracting of matrix
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        /*The above's loop, is same as before, this is because qe need to make a loop for
        lines and columns. In this case we have same dimension matrixes for adding or subtracting
        so doesn't matter which lenght we put inside of the loop, for proving it, i've putted in the
        first one Matrix1's lenght and in the second loop Matrix2's

        Inside the loop we add the adding or subtrcting operation, in my case i'll prove with 
        adding.*/

        //Printing matrix

        /*By now we've make the logic of the program, it has be easy, isn't it?
         *Now we find an obstacle when we try to print it like the exercise asks, but we'll make int
         
         * We start printing matrix 1, inside a for loop for acting in it's lines and columns, as before*/
        for (int i = 0; i < matrix1.length; i++) {

            for (int j = 0; j < matrix1.length; j++) {
                System.out.print("[" + matrix1[i][j] + "]");
            }
            //we need to add the + or - signs between two matrixe's second line, for that we add an ifElse
            if (i == 1) {
                System.out.print("  +  ");
            } else {
                System.out.print("     ");
            }
            /*Above's ifElse say's that when i (lines) is 1, it starts at 0 and the rules tell the program
        i++ while i>matrix1.length so it will print it at the second line, because in java it aways
        start counting at 0*/

            //same as with matrix1
            for (int j = 0; j < matrix2.length; j++) {
                System.out.print("[" + matrix2[i][j] + "]");
            }

            if (i == 1) {
                System.out.print("  =  ");
            } else {
                System.out.print("     ");
            }

            //Finally we print the result of the adding or subtraction.
            for (int j = 0; j < matrixResult.length; j++) {
                System.out.print("[" + matrixResult[i][j] + "]");
            }
            //This jump of line is the key for printing matrix as the example
            System.out.println("");

        }
    }
}
