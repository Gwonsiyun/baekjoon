import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int temp = 0;
        for(int i = a; i>0; i--){
            a--;
            temp++;
            String text = "";
            for(int j=0; j<a; j++){
                text+=" ";

            }
            text+="*";
            for(int j=2; j<temp; j++){
                text+=" ";

            }
            temp++;
            if(temp>2){
                text+="*";
            }
            System.out.println(text);
        }

    }
}
