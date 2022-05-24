import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if(b<c) {
            int i = a/(c-b)+1;
            System.out.println(i);
        }else{
            System.out.println(-1);
        }
    }
}
