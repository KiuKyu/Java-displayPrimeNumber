import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter amount of prime numbers to print: ");
        int amount = userInput.nextInt();
        int count = 0;
        int numbers = 0;
        String output = "Prime numbers: ";
        while (count < amount) {
            if (numbers < 2) {
                numbers++;
                continue;
            } else if (numbers == 2) {
                output += numbers + " ,";
                count++;
            } else {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(numbers); i++) {
                    if (numbers % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    output += numbers + " ,";
                    count++;
                }
            }
            numbers++;
        }
        System.out.println(output);
    }
}
