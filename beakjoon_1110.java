import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = n;
        int cnt = 0;

        while (true) { 
            int a = num / 10;
            int b = num % 10;
            int c = (a + b) % 10;
            num = (b * 10) + c;
            cnt += 1;
            
            if (n == num) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
