import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
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
