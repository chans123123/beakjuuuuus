import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] triangle = new int[3];

        while (true) { 
            StringTokenizer st = new StringTokenizer(br.readLine());
            triangle[0] = Integer.parseInt(st.nextToken());
            triangle[1] = Integer.parseInt(st.nextToken());
            triangle[2] = Integer.parseInt(st.nextToken());
            
            if (triangle[0] == 0 && triangle[1] == 0 && triangle[2] == 0) {
                break;
            }
            
            Arrays.sort(triangle);
            if (triangle[2] >= (triangle[1] + triangle[0])) {
                System.out.println("Invalid");
            }
            else if (triangle[0] == triangle[1] && triangle[1] == triangle[2]) {
                System.out.println("Equilateral");
            }
            else if (triangle[0] == triangle[1] || triangle[0] == triangle[2] || triangle[1] == triangle[2]) {
                System.out.println("Isosceles");
            }
            else {
                System.out.println("Scalene");
            }
        }
    }
}
