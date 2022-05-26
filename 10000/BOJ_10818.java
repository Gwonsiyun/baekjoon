import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int max=-1000000;
        int min=1000000;
        String num = br.readLine();
        String st[] = num.split(" ");
        for(int i=0; i<a; i++){
            int cur = Integer.parseInt(st[i]);
            if(max<cur){
                max = cur;
            }
            if(min>cur){
                min = cur;
            }

        }
        System.out.println(min+" "+max);
    }
}
