import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()), sum=1;
        if(a == 0){
            System.out.println(1);
        }else{
            for(int i=a;i>0;i--){
                sum*=i;
            }
            System.out.println(sum);
        }
    }
}
