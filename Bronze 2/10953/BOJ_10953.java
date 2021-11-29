import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i=0;i<a;i++){
            String c = br.readLine();
            System.out.println((int)c.charAt(0) + (int)c.charAt(2) - 96);
        }
    }
}
