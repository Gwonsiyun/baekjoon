import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=a-1; i>=0; i--){
            for(int j=0; j<i;j++){
                sb.append(" ");
            }
            b++;
            for(int j=0; j<b;j++){
                sb.append("*");
            }
            if(i!=0){
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
