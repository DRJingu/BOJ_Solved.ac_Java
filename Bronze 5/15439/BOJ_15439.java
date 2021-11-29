import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BOJ_15439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = a-1; i>0;i--){
            sum += i;
        }
        System.out.println(sum*2);

    }
}
