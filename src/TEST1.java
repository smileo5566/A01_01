import java.util.Scanner;

public class TEST1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double f = scn.nextDouble();
        double c = ((f/0.45359));
        c =(int)(c*100);
        c =c/100;
        System.out.println(c);
        }
    }