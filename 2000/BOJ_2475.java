import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int result = 0;
        for(int i=0; i<split.length;i++){
            int temp = Integer.parseInt(split[i]);
            result+=temp*temp;
        }
        System.out.println(result%10);
    }
}
