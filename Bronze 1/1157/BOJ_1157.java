import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine().toUpperCase();
        int arr[] = new int[27];
        arr[26] = -10;
        int max = 26;
        for(int i=0;i<a.length();i++){
             arr[(int)a.charAt(i)-65]++;
        }
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-1;j++) {
                if(max != j){
                   if(arr[max]== arr[j]){
                        System.out.println("?");
                        System.exit(0);
                    }
                }
            }
        }
        int f = max+65;
        System.out.println((char)f);
    }
}
