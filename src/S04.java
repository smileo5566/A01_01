import java.util.Random;
import java.util.Scanner;

public class S04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random ran = new Random();
        int a = scn.nextInt();
        ran.setSeed(a);
        for(int i = 0; i <= 4; i++){
            for(int j = 0; j <= 4; j++){
                System.out.print(ran.nextInt(9)+"\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        for(int j = 0; j <= 4; j++){
            for(int i = 0; i <= 4; i++){
                System.out.print(ran.nextInt(9)+"\t");
            }
            System.out.println();
        }
    }
}
