import java.io.*;
import java.math.BigInteger;

public class BOJ_22193 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        BigInteger a = new BigInteger(bf.readLine());
        BigInteger b = new BigInteger(bf.readLine());
        System.out.println(a.multiply(b));

    }
}
