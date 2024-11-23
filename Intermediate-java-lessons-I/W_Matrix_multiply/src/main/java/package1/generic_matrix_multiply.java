package package1;

import java.util.Scanner;

public class generic_matrix_multiply {

    public void MultipliMatrixes() {

        Scanner input = new Scanner(System.in); //adding scanner for user's input

        //Variables for each matrix
        int columnsA = 0;
        int linesA = 0;

        int columnsB = 0;
        int linesB = 0;

        //First matrix data, by user's input
        System.out.print("How many lines do you want to the first matrix? ");
        linesA = input.nextInt();
        System.out.print("How many columns do you want to the first matrix? ");
        columnsA = input.nextInt();

        //Second matrix data, by user's input
        System.out.println("Columns of first matrix and lines of second matrix have to be the same for allowing the multiplication, so..");
        linesB = columnsA;//the rule at matrix is this two have to have same lenght

        System.out.print("How many columns do you want to the second matrix? ");
        columnsB = input.nextInt();

        int[][] matrixA = new int[linesA][columnsA];
        int[][] matrixB = new int[linesB][columnsB];
        int[][] matrixMultiply = new int[linesA][columnsB];
        columnsA = linesB;

        for (int i = 0; i < matrixA.length; i++) { //first matrix's lines
            for (int j = 0; j < matrixA[0].length; j++) { // first matrix's columns

                matrixA[i][j] = (int) (Math.random() * 5); //adding to each position a number between 0-4, remember, always in javawe start at 0 position
            }

        }

        //Same to the second Matrix
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {

                matrixB[i][j] = (int) (Math.random() * 5);
            }

        }

        for (int i = 0; i < linesA; i++) {
            for (int j = 0; j < columnsB; j++) {
                /*As we know matrixA's columns and matrixB's lines have to be same lenght
                 * For that reason we add another variable "k" which will ensure the same lenght for both 
                 * */
                for (int k = 0; k < columnsA; k++) {//Here desn't matter if we add columnsA or linesB, they'll be same lenght
                    matrixMultiply[i][j] = matrixA[i][k] * matrixB[k][j];// we multiply adding each variable in it's appropiate place

                }

            }

        }
        //printing the program
        for (int i = 0; i < linesB; i++) {

            if (i < linesA) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matrixA[i][j] + "]"); //we print matrix1
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

            for (int j = 0; j < columnsB; j++) {

                System.out.print("[" + matrixB[i][j] + "]");
            }
            if (i == 1) {
                System.out.print("  =  ");
            } else {
                System.out.print("     ");
            }
            //The result is 2x2 so starting by 0 the if for lines and loop for columns will be < 2
            if (i < linesA) {
                for (int j = 0; j < columnsB; j++) {
                    System.out.print("[" + matrixMultiply[i][j] + "]");
                }
            }

            System.out.println("");
        }

    }
}
