import java.util.Scanner;

public class BOJ_8393 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b=0, a = s.nextInt();
        for(int i =1; i<=a;i++){
            b+= i;
        }
        System.out.println(b);
    }

}
