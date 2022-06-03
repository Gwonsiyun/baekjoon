import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean run = true;

        while (run){
            String[] split = br.readLine().split(" ");
            int R = Integer.parseInt(split[0]);
            int C = Integer.parseInt(split[1]);
            if(R==0&&C==0){
                break;
            }

            int[][] arr = new int[R][C];

            for(int i = 0; i<R; i++){
                String line = br.readLine();
                for(int j=0; j<C; j++){
                    if(line.charAt(j) == '*'){
                        arr[i][j]='*';
                        for(int a = -1; a<=1; a++) {
                            for (int b = -1; b <=1; b++) {
                                if(i + b>=0&&i+b<R&&j+a<C&&j+a>=0&&arr[i + b][j + a]!='*') {
                                    arr[i + b][j + a]++;
                                }
                            }
                        }
                    }
                }
            }
            for(int i = 0; i<R; i++){
                String result = "";
                for(int j = 0; j<C; j++){
                    if(arr[i][j]=='*'){
                        result+="*";
                    }else {
                        result += arr[i][j];
                    }
                }
                System.out.println(result);
            }
        }
    }
}
