import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int max = 0;
        double total = 0;
        String[] split = br.readLine().split(" ");
        for(int i=0; i<split.length; i++) {
            int temp = Integer.parseInt(split[i]);
            if(temp>max){
                max=temp;
            }
        }
        for(int i=0; i<split.length; i++){
            int temp = Integer.parseInt(split[i]);
            total+=(double)temp/max*100;
        }
        System.out.println((double) total/count);
    }
}
