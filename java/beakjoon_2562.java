import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[9];
        int max = numbers[0];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
