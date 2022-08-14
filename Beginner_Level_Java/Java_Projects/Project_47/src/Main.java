public class Main {

    static int[][] reverseMatrix(int[][] matrix) {
        int[][] reverseMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                reverseMatrix[j][i] = matrix[i][j];
            }
        }
        return reverseMatrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] myMatrix = {{2, 3, 4}, {5, 6, 7}};

        System.out.println("Matris :");
        printMatrix(myMatrix);

        System.out.println("Transpoze :");
        printMatrix(reverseMatrix(myMatrix));
    }
}