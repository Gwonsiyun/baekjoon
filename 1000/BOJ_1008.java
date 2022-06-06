import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp[] = br.readLine().split(" ");
        double a = Integer.parseInt(temp[0]);
        double b = Integer.parseInt(temp[1]);

        System.out.println(a/b);

    }
}
