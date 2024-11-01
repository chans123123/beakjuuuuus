import java.util.Scanner;
public class beakjoon_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int [] intArray = new int[input];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        int max = intArray[0];
        int min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (max < intArray[i]) {
                max = intArray[i];
            }
            if (min > intArray[i]) {
                min = intArray[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
