
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0, i = 0;
        while (true) {

            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            } else {
                if (num > 0) {
                    total += num;
                    i++;
                }

            }

        }
        if (i > 0) {
            System.out.println((1.0 * total) / i);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
