import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 1;
        for(int i=0; i<3; i++){
            int a = Integer.parseInt(br.readLine());
            num= num*a;
        }
        String num2 = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=9;i++){
            int count = 0;
            for(int j=0; j<num2.length();j++){
                if(num2.charAt(j)==i+48){
                    count++;
                }
            }
            sb.append(count);
            if(i<9){
                sb.append("\n");
            }
        }
        System.out.println(sb);

    }
}
