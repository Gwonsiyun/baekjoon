import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int[] b = {1,2,3,4,5,6,7,8};
        int[] c = {8,7,6,5,4,3,2,1};
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < 8; i++) {
            if(Integer.parseInt(a[i])!=b[i]){
                ascending = false;
            }
            if(Integer.parseInt(a[i])!=c[i]){
                descending = false;
            }
        }
        if(ascending){
            System.out.println("ascending");
        }else if(descending){
            System.out.println("descending");
        }else {
            System.out.println("mixed");
        }

    }
}
