import java.util.Scanner;

public class BOJ_14681 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b=s.nextInt();
        System.out.println(a*b<0 ? a>0 ? 4 : 2  :  a>0 ? 1 : 3);
    }
}
