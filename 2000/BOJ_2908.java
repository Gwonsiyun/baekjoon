import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        StringBuilder a = new StringBuilder();
        for(int i = N.length()-1; i>=0; i--){
            a.append(N.charAt(i));
        }
        String[] b = a.toString().split(" ");
        int c = Integer.parseInt(b[0]);
        int d = Integer.parseInt(b[1]);
        if(c>d){
            System.out.println(c);
        }else {
            System.out.println(d);
        }

    }
}
