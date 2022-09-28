package com.company;

public class Matr {
    int row;
    int column;
    int[][] declarationMatrix;

    public Matr(int row, int column) {
        this.row = row;
        this.column = column;
        this.declarationMatrix = new int[row][column];
    }

    public void PrintMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("\t" + declarationMatrix[i][j]);
            }
            System.out.println();
        }
    }

    //матрица + матрица
    public static Matr SumMatrix(Matr a, Matr b) {
        Matr Sum = new Matr(a.row, b.column);
        for (int i = 0; i < a.row; i++) {
            for (int j = 0; j < b.column; j++) {
                Sum.declarationMatrix[i][j] = a.declarationMatrix[i][j] + b.declarationMatrix[i][j];
            }
        }
        return Sum;
    }

    //матрица * матрица
    public static Matr MultiplicationMatrix(Matr a, Matr b) {
        Matr Multiplication = new Matr(a.row, b.column);
        for (int i = 0; i < a.row; i++) {
            for (int j = 0; j < b.column; j++){
                for (int n = 0; n < a.column; n++){
                    Multiplication.declarationMatrix[i][j] = Multiplication.declarationMatrix[i][j] + a.declarationMatrix[i][n] * b.declarationMatrix[n][j];
                }
            }
        }
        return Multiplication;
    }

    //матрица * число
    public static Matr MultiplicationMatrixByNumber(Matr a, int c) {
        Matr mat = new Matr(a.row, a.column);
        for (int i = 0; i < a.row; i++) {
            for (int j = 0; j < a.column; j++) {
                mat.declarationMatrix[i][j] = a.declarationMatrix[i][j] * c;
            }
        }
        return mat;
    }


}
