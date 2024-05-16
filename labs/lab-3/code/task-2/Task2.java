import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите стороны треугольника: ");
        double a1 = readSide(scanner);
        double a2 = readSide(scanner);
        double a3 = readSide(scanner);
        if (a1 == 0 || a2 == 0 || a3 == 0) {
            return;
        }
        double square = findSquare(a1, a2, a3);
        System.out.printf(
            "Для сторон %.2f, %.2f и %.2f площадь треугольника равна: %.2f\n",
            a1,
            a2,
            a3,
            square
        );
    }

    private static double findSquare(double a1, double a2, double a3) {
        double p = (a1 + a2 + a3) / 2;
        return Math.sqrt(p * (p - a1) * (p - a2) * (p - a3));
    }

    private static double readSide(Scanner scanner) {
        double result = 0;
        if (scanner.hasNextDouble()) {
            result = scanner.nextDouble();
        }
        if (result > 0) {
            return result;
        }

        System.out.println(
            "Передано некорректное значение стороны треугольника: "
            + scanner.next()
        );
        return 0;
    }
}
