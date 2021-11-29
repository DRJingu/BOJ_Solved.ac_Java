import java.util.Scanner;

public class BOJ_11022 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i=1;i<=a;i++){
            int b = s.nextInt();
            int c = s.nextInt();
            int d = b+c;
            System.out.printf("Case #%d: %d + %d = %d\n",i,b,c,d);
        }
    }
}
