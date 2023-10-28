package Calculytor;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Arabskie extends Rimskie {
    static Scanner scanner = new Scanner(System.in);
    static int x1, x2;
    static char operation;
    static int result;

    public static int calc(int x1, int x2, char operation) {
        int result = 0;
        switch (operation){
            case '+':
                result = x1+x2;
                break;
            case '-':
                result = x1-x2;
                break;
            case '*':
                result = x1*x2;
                break;
            case '/':
                try {
                    result = x1 / x2;
                } catch (ArithmeticException | InputMismatchException e) {
                    System.out.println("Exception : " + e);
                    System.out.println("Допускается только целое число, не нулевое значение");

                    break;
                }
                break;
            default:
                throw new IllegalArgumentException("Не верный знак операции");
        }
        return result;
    }
}
