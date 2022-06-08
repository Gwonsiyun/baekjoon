import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tk = Integer.parseInt(br.readLine());
        for(int i=0; i<tk; i++){
            String[] split = br.readLine().split(" ");
            int num = Integer.parseInt(split[0]);
            String str = split[1];
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<str.length();j++){
                for(int j2=0; j2<num; j2++){
                    sb.append(str.charAt(j));
                }
            }
            System.out.println(sb);
        }

    }
}
