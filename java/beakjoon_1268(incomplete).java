import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int [][] arr = new int[n][5];
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < n; k++) {
                    if (arr[i][j] == arr[k][j] && i!=k) {
                        arr[k][j] = 0;
                        arr[i][j] = 0;
                    }
                }
            }
        }
        
        for (int[] arr1 : arr) {
            System.out.println(Arrays.toString(arr1));
        }
    }
}
