import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = a-1;
        int c = -1;

        for(int i = 0; i<a; i++){
            String star = "";
            for(int j = b; j>0; j--){
                star+=" ";
            }
            star+="*";
            for(int n = 0; n<c;n++){
                star+=" ";
            }
            if(c>0){
                star+="*";
            }
            b--;
            c+=2;
            System.out.println(star);
        }
    }
}
