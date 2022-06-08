import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String star = "";
        for(int i = 0; i<count; i++){
            star += "*";
            System.out.println(star);
        }
    }
}
