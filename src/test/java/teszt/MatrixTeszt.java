package teszt;

import model.Feladat;
import org.junit.jupiter.api.Test;
import java.util.List;

public class MatrixTeszt {
    int sor = 5;
    int oszlop = 6;
    Feladat feladat = new Feladat(sor, oszlop);
    List<int[][]> matrixok = List.of(
            feladat.getMatrixA(),
            feladat.getMatrixB()
    );


    @Test
    void matrixMeretMegfeleloTest(){
        try {
            for (int[][] matrix : matrixok) {
                assert matrix.length == sor;
                assert matrix[0].length == oszlop;
            }

        } catch (IllegalArgumentException e) {
            assert false : "A mátrix mérete nem megfelelő";
        }
    }

    @Test
    void MatrixNemTartalmazhatNullatTest() {
        try {

            for (int[][] matrix : matrixok) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        assert matrix[i][j] != 0;
                    }
                }
            }

        } catch (IllegalArgumentException e) {
            assert false : "A mátrix null értéket tartalmaz";
        }
    }

}
