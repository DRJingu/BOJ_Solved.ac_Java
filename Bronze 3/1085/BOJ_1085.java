import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        arr[2] -= arr[0];
        arr[3] -= arr[1];
        System.out.println(Arrays.stream(arr).min().getAsInt());
    }
}
