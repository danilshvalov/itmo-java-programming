import java.util.Scanner;


public class Task1 {
    private static int multiplyByTen(int number) {
        //      number * 8   +  number * 2
        return (number << 3) + (number << 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int result = multiplyByTen(number);
        System.out.printf(
            "Число %d, умноженное на десять, равно %d\n",
            number,
            result
        );
    }
}
