import java.util.Scanner;

public class S02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a= scn.next();
        StringBuffer b =new StringBuffer();
        b.append(a);
        b.reverse();
        System.out.println(b);
    }
}
