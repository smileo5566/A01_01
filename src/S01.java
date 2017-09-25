import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = 0;
        while (a>0){
            b = b+a%10;
            a=a/10;
        }
        System.out.println(b);




    }
}
