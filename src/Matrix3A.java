//Exercise 3A
//Fill matrix by numbers from 1 ... N2. Where N is the matrix size.

public class Matrix3A {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        int i = 0;
        int j = 0;
        System.out.print(matrix[i][j]);
        do {
            j = j + 1;
            System.out.print(" " + matrix[i][j]);
            System.out.print(" " + matrix[j][i]);

        } while (j < 4);
        do {
            i++;
            System.out.print(" " + matrix[i][j]);
            if (i == j) break;
            System.out.print(" " + matrix[j][i]);

        } while (i < 4);
    }
}
