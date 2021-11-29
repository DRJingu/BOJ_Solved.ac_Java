import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int ctn = 0;
        String arr[] = a.split(" ");
        for(int i=0;i<arr.length;i++){
            if(!arr[i].equals("")){
                ctn++;
            }
        }
        System.out.println(ctn);
    }
}
