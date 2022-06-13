import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int N = Integer.parseInt(a[0]);
        int M = Integer.parseInt(a[1]);
        System.out.println(N<M?N/2:M/2);
    }
}
