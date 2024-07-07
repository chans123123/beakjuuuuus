import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String word = br.readLine();

        for (String croatia1 : croatia) {
            word = word.replace(croatia1, " ");
        }
        System.out.println(word.length());
    }
}
