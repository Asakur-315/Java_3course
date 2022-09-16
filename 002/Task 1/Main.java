package com.company;

import java.util.Random;


class Matrix {
    int[][] matrix;
    byte n, m;
    Random rnd = new Random();

    public Matrix(byte n, byte m) {
        this.n = n;
        this.m = m;
        matrix = new int[this.n][this.m];
        for (byte i = 0; i <= this.n - 1; i++) {
            for (byte j = 0; j <= this.m - 1; j++) {
                matrix[i][j] = rnd.nextInt(10);
            }
        }
    }

    int getByIndex(byte i, byte j) {
        return this.matrix[i][j];
    }
    void setByIndex(byte i, byte j,int x){
        this.matrix[i][j] = x;
    }

    void print(){
        for (byte i = 0; i <= this.n - 1; i++) {
            for (byte j = 0; j <= this.m - 1; j++) {
                System.out.print(String.valueOf(matrix[i][j]) + ' ');
            }
            System.out.println();
        }
        System.out.println("-------");
    }

     Matrix sum(Matrix matrix2) {
        Matrix mSum = new Matrix(n,m);
        for (byte i = 0; i <= n - 1; i++) {
            for (byte j = 0; j <= m - 1; j++) {
                mSum.setByIndex(i,j,matrix[i][j] + matrix2.getByIndex(i, j));
            }
        }
        System.out.println("Сумма матриц:");
        mSum.print();
        return mSum;
    }
    Matrix sub(Matrix matrix2) {
        Matrix mSum = new Matrix(n,m);
        for (byte i = 0; i <= n - 1; i++) {
            for (byte j = 0; j <= m - 1; j++) {
                mSum.setByIndex(i,j,matrix[i][j] - matrix2.getByIndex(i, j));
            }
        }
        System.out.println("Разность матриц:");
        mSum.print();
        return mSum;
    }
    Matrix mul (int x) {
        Matrix mSum = new Matrix(n,m);
        for (byte i = 0; i <= n - 1; i++) {
            for (byte j = 0; j <= m - 1; j++) {
                mSum.setByIndex(i,j,matrix[i][j] * x);
            }
        }
        System.out.println("Матрица умноженная на "+ x + " :");
        mSum.print();
        return mSum;
    }

    Matrix trans () {
        Matrix mSum = this;
        for (byte i = 0; i <= n - 1; i++) {
            for (byte j = 0; j <= m - 1; j++) {
                mSum.setByIndex(i,j,this.getByIndex(j,i));
            }
        }
        System.out.println("Транспорнированная матрица:");
        mSum.print();
        return mSum;
    }
    Matrix exp ( int n) {
        Matrix res = this;
        for (byte i = 0; i < n; i++){
            res = Matrix.mMul(res,this);
        }
        System.out.println("Матрица в степени " + n);
        res.print();
        return res;
    }

    public static Matrix mMul(Matrix matrix1, Matrix matrix2){
        byte m = matrix1.m;
        byte n = matrix2.n;
        byte o = matrix2.n;
        Matrix res = new Matrix(n,m);

        for (byte i = 0; i < m; i++) {
            for (byte j = 0; j < n; j++) {
                for (byte k = 0; k < o; k++) {
                    res.setByIndex(i,j,res.getByIndex(i,j) + matrix1.getByIndex(i,k) * matrix2.getByIndex(k,j));
                }
            }
        }
        System.out.println("Умножение матриц друг на друга:");
        res.print();
        return res;
    }
}

public class Main {

    public static void main(String[] args) {
        final byte N= 3;
        final byte M= 3;
        Matrix matrix = new Matrix(N,M);
        matrix.print();
        Matrix matrix2 = new Matrix(N,M);
        matrix2.print();

        matrix.sum(matrix2); 
        matrix.sub(matrix2);
        matrix.mul(2);
        matrix.trans();
        Matrix.mMul(matrix,matrix2);
        matrix.exp(2);
    }

}
