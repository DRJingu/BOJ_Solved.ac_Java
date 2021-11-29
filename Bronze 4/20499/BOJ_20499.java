import java.util.Scanner;

public class BOJ_20499 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String arr[] = sc.nextLine().split("/");
            int K = Integer.parseInt(arr[0]), D= Integer.parseInt(arr[1]), A= Integer.parseInt(arr[2]);

            System.out.println(K+A<D||D==0 ? "hasu" : "gosu");
        }
}
