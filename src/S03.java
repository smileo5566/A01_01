import java.util.Random;
import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        Random ran = new Random();
        ran.setSeed(a);

        for(int b=0;b<=6;b++){

            System.out.print(ran.nextInt(42)+1+"\t");
        }






    }
}
