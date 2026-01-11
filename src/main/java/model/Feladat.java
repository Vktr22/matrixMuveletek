package model;

import java.util.Random;

public class Feladat {
    private int sor;
    private int oszlop;
    private int[][] matrixA;
    private int[][] matrixB;

    public Feladat(int sor, int oszlop){
        this.sor = sor;
        this.oszlop=oszlop;
        matrixA = new int[sor][oszlop];
        matrixB = new int[sor][oszlop];
        feltolt();
    }

    public int[][] getMatrixB() {
        return matrixB;
    }

    public int[][] getMatrixA() {
        return matrixA;
    }

    private void feltolt(){
        feltoltMatrix(matrixA);
        feltoltMatrix(matrixB);
    }

    private void feltoltMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                matrix[i][j] = random.nextInt(26)-10;
            }
        }
    }

    public int[][] osszead(){
        int [][] eredmeny = new int[sor][oszlop];
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                int osszeg = matrixA[i][j] + matrixB[i][j];
                if(osszeg==0){
                    osszeg=1;
                }
                eredmeny[i][j] = osszeg;
            }
        }
        return  eredmeny;
    }

    public void kiir(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }


}
