import java.util.Random;
import java.util.Scanner;


public class TEST1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rd = new Random();
        int b = scn.nextInt();
        rd.setSeed(b);
        int a[][] = new int[5][5];

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                a[i][j] = rd.nextInt(10);
                System.out.print(a[i][j] + "\t");

            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(a[j][i] + "\t");

            }
            System.out.println();
        }

    }
}