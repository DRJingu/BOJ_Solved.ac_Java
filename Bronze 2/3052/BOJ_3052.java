import java.util.*;

public class BOJ_3052 {
    static void main(String[]l) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = s.nextInt()%42;
            al.add(arr[i]);
        }

        HashSet<Integer> hs = new HashSet<>(al);
        ArrayList<Integer> ni = new ArrayList<>(hs);
        System.out.println(ni.size());
    }
}
