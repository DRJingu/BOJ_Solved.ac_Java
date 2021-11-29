import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int temp = 0;
        for(int i=0;i<b.length();i++){
            temp += Integer.parseInt(String.valueOf(b.charAt(i)));
        }
        System.out.println(temp);

    }
}
