import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int x;
            switch (command) {
                case "add":
                    x = Integer.parseInt(st.nextToken());    
                    hs.add(x);
                    break;
                case "remove":
                    x = Integer.parseInt(st.nextToken());
                    hs.remove(x);
                    break;
                case "check":
                    x = Integer.parseInt(st.nextToken());
                    System.out.println(hs.contains(x) ? 1 : 0);
                    break;
                case "toggle":
                    x = Integer.parseInt(st.nextToken());
                    if (hs.contains(x)) {
                        hs.remove(x);
                    } 
                    else {
                        hs.add(x);
                    }
                    break;
                case "all":
                    hs = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 
                                                        12, 13, 14, 15, 16, 17, 18, 19, 20));
                    break;
                case "empty":
                    hs.clear();
            } // switch end
        } // fori end
    } 
}
