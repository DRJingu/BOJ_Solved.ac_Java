import java.util.Scanner;

public class BOJ_10871 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        for(int i=1;i<=a;i++){
            int d = s.nextInt();
            System.out.print(d<b ? d+" " : "");
        }

    }
}
