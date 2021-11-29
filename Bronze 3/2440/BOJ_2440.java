import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i=a;i>0;i--){
            for(int j=0;j<i;j++){
                for(int z=0;z<j;z++){
                    System.out.printf(" ");
                }
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
