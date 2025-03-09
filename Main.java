import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Создание объекта класса
        ExpressionCalculator calc = new ExpressionCalculator();

        // Ввод значений
        System.out.print("Введите x: ");
        double x = sc.nextDouble();
        System.out.print("Введите a: ");
        double a = sc.nextDouble();
        System.out.print("Введите b: ");
        double b = sc.nextDouble();

        // Вычисление y = 3x + 5
        double result1 = calc.calculateExpression1(x);
        System.out.println("y = 3x + 5: " + result1);

        // Вычисление y = (a + b) / (a - b)
        double result2 = calc.calculateExpression2(a, b);
        if (!Double.isNaN(result2)) {
            System.out.println("y = (a + b) / (a - b): " + result2);
        }

        // Вычисление y = (a * x / b)!
        double result3 = calc.calculateExpression3(a, x, b);
        if (!Double.isNaN(result3)) {
            System.out.println("y = (a * x / b)!: " + result3);
        }

        sc.close();
    }
}
class ExpressionCalculator {

    // Метод для вычисления y = 3x + 5
    public double calculateExpression1(double x) {
        return 3 * x + 5;
    }

    // Метод для вычисления y = (a + b) / (a - b)
    public double calculateExpression2(double a, double b) {
        if (a == 0) {
            System.out.println("Ошибка: Деление на ноль");
            return Double.NaN; // Возвращаем NaN для обозначения нечислового результата
        }
        return (a + b) / (a - b);
    }

    // Метод для вычисления y = (a * x / b)!
    public double calculateExpression3(double a, double x, double b) {
        if (b == 0) {
            System.out.println("Ошибка: Деление на ноль");
            return Double.NaN; // Возвращаем NaN для обозначения нечислового результата
        }
        double value = (a * x) / b;
        return factorial((int) value);
    }

    // Метод для вычисления факториала
    private double factorial(int n) {
        if (n < 0) {
            System.out.println("Ошибка: Факториал не определен для отрицательных чисел");
            return Double.NaN; // Возвращаем NaN для обозначения нечислового результата
        }
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
