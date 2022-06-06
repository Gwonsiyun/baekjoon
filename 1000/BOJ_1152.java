import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp[] = br.readLine().trim().split(" ");

        int result = temp.length;

        if(temp[0].equals("")){
            result=0;
        }

        System.out.println(result);

    }
}
