import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class BOJ_14928 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine());

        System.out.println(a.remainder(BigInteger.valueOf(20000303)));

    }
}