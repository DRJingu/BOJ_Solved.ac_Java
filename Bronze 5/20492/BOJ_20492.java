import java.io.*;

public class BOJ_20492 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.printf("%d %d",a-(a*11/50),a-((a-(a*4/5))*11/50));
    }
}
