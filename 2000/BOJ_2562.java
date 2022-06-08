import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int count = 0;
        for(int i=1; i<=9; i++){
            int a = Integer.parseInt(br.readLine());
            if(max<a){
                max=a;
                count=i;
            }
        }
        System.out.println(max+"\n"+count);

    }
}
