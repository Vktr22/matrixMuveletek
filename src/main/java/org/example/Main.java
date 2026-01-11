package org.example;
import model.Feladat;


public class Main {
    public static void main(String[] args) {

        Feladat feladat = new Feladat(3,4);

        System.out.println("matrixA: ");
        feladat.kiir(feladat.getMatrixA());

        System.out.println("\nmatrixB: ");
        feladat.kiir(feladat.getMatrixB());

        System.out.println("\nmatrixA + matrixB: ");
        feladat.kiir(feladat.osszead());



    }
}