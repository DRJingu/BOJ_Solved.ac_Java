import java.util.Scanner;

public class BOJ_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a*b;
        for(int i=0;i<3;i++){
            System.out.println(a*(b%10));
            b = (b- (b%10))/10;
        }
        System.out.println(c);

    }
}
