import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphabet = new int[26];
        String temp = br.readLine().toUpperCase();
        for(int i = 0; i<temp.length(); i++){
            alphabet[temp.charAt(i)-'A']++;
        }
        // 최대값, 최대값의 인덱스 초기값 세팅
        int max = alphabet[0];
        int maxIndex = 0;
        // 최대값, 최대값의 인덱스 구하기
        for (int i = 1; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                maxIndex = i;
            }else if(alphabet[i] == max){
                maxIndex=-2;
            }
        }
        System.out.println((char)(maxIndex==-2?'?':maxIndex+'A'));

    }
}
