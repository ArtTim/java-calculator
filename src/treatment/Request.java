package treatment;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Request {
    public String firstOperand, secondOperand;
    public String operator;
    Scanner in = new Scanner(System.in);

    public static void sayHello() {
        System.out.println("Введите арифметический запрос. Допустимы числа от 1 до 10 в арабской и римской системах счисления.\nНапример, a + b");
    }

    public void getRequest() {
        String request = in.nextLine();
        StringTokenizer requestString = new StringTokenizer(request, " .");

        while (requestString.hasMoreTokens()) { // Разбор строки
            firstOperand = requestString.nextToken();
            operator = requestString.nextToken();
            secondOperand = requestString.nextToken();
        }
    }

}

