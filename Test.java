package Calculytor;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Test extends Arabskie{

    public static void main(String[] args) {

        System.out.println("Введите выражение с арабскими или римскими числами, от 1(I) до 10(X) включительно");

        String user = scanner.nextLine();

        char[] sign = new char[10];

        for (int i = 0; i < user.length(); i++) {
            sign[i] = user.charAt(i);
            if (sign[i] == '+') {
                operation = '+';
            }
            if (sign[i] == '-') {
                operation = '-';
            }
            if (sign[i] == '*') {
                operation = '*';
            }
            if (sign[i] == '/') {
                operation = '/';
            }
        }

        String signString = String.valueOf(sign);
        String[] blacks = signString.split("[+-/*]");
        String stable00 = blacks[0];
        String stable01 = blacks[1];
        String string03 = stable01.trim();
        
        boolean flag = false;
        x1 = 0;
        x2 = 0;
        x1 = romanToNumber(stable00);
        x2 = romanToNumber(string03);
        if (x1 != -1 && x2 != -1) {
            result = calc(x1, x2, operation);
            System.out.println("---Результат для римских цифр---");
            String resultRoman = Roman.toInt(result);
            System.out.println(stable00 + " " + operation + " " + string03 + " = " + resultRoman);
            flag = true;
        }

        if(!flag){
            x1 = Integer.parseInt(stable00);
            x2 = Integer.parseInt(string03);

            if(x1 > 10 || x1 <1) {
                throw new InputMismatchException("Числовой диапазон от 1 до 10");
            }

            if(x2 >10 || x2 < 1) {
                throw new InputMismatchException("Числовой диапазон от 1 до 10");
            }

            result = calc(x1, x2, operation);
            System.out.println("---Результат для арабских цифр---");
            System.out.println(x1 + " " + operation + " " + x2 + " = " + result);
        }
    }
}
