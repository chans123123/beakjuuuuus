import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class beakjoon_2525 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cook_time = Integer.parseInt(br.readLine());

        int total_min = (h * 60) + m + cook_time;
        
        int hour = (total_min / 60) % 24;
        int minute = total_min % 60;
        
        System.out.print(hour + " ");
        System.out.print(minute);
    }
}
