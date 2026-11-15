import java.io.*;

public class Exercicio5 {
    public static void main(String[] args) {
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(IO.readln("Digite m[" + i + "][" + j + "]:"));
            }
        }
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(" " + m[i][i]);
        }
        System.out.println();
    }
}
