import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15813 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine()),temp =0 ;
    String str = br.readLine();
    for(int i=0;i<a;i++){
        temp +=  (int)str.charAt(i) - 64;
    }
        System.out.println(temp );
    }
}
