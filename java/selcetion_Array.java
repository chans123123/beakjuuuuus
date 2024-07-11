import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int [] inputArray(int n, BufferedReader br) throws IOException{
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("숫자 " + (i + 1) + " = " );
            int input = Integer.parseInt(br.readLine());
            arr[i] = input;
        }
        return arr;
    }
    public static int[] selectionArr(int [] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int smallestIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }//if end
            }
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = temp;
        }//for end
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("숫자 개수 = ");
        int n = Integer.parseInt(br.readLine());
        int [] myarr = inputArray(n, br);
        int [] sortedArr = selectionArr(myarr);
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }
    }
}
