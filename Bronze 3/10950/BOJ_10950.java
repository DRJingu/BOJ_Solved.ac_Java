import java.util.Scanner;

public class BOJ_10950 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(),b,c;
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            b = s.nextInt();
            c = s.nextInt();
            arr[i] = b+c;
        }
        for(int i=0;i<a;i++){
            System.out.println(arr[i]);
        }
    }
}
