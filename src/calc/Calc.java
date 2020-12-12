package calc;

import treatment.CheckNum;
import treatment.Convertation;
import treatment.Request;

public class Calc {
    Request request = new Request();
    CheckNum checkNum = new CheckNum();
    Convertation convertation = new Convertation();
    int result;

    public void calculate() { // Сам калькулятор. Инициализация запроса арифметической операции, и его расчёт.
        request.getRequest();
        checkNum.checkString(request.firstOperand, request.secondOperand);
            if (checkNum.positiveNumber) {
                if (checkNum.isArabic) { // Если арабские
                    System.out.println(request.firstOperand.toUpperCase() + " " + request.operator + " " + request.secondOperand.toUpperCase() + " = " + arabicCalc() + ".");
                } else if (checkNum.isRoman) { // Если римские
                    System.out.println(request.firstOperand.toUpperCase() + " " + request.operator + " " + request.secondOperand.toUpperCase() + " = " + romanCalc() + ".");
                }
            } else { // Ошибка
                System.out.println("Ожидаются числа от 1 до 10 в арабской либо римской системе исчисления.");
            }
    }

    // Калькулятор арабских чисел
    public int arabicCalc() {
        int firstOperand = Integer.parseInt(request.firstOperand),
                secondOperand = Integer.parseInt(request.secondOperand);
        switch (request.operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                result = firstOperand / secondOperand;
                break;
        }
            return result;
    }

    // Калькулятор римских чисел
    public String romanCalc() {
        int firstOperand = convertation.toArabian(request.firstOperand),
                secondOperand = convertation.toArabian(request.secondOperand);
        switch (request.operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                result = firstOperand / secondOperand;
                break;
        }
        return convertation.toRoman(result);
    }

}
