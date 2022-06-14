import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mod[] = new int[42];
        int count = 0;
        for(int i = 0; i < 10; i++){
            int temp = Integer.parseInt(br.readLine())%42;
            if (++mod[temp]==1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
