package treatment;

public class CheckNum {
    private String [] arabic = {"10","1","2","3","4","5","6","7","8","9"};
    private String [] roman = {"X","I","II","III","IV","V","VI","VII","VIII","IX"};
    private String [] romanNumerous = {"C", "X","XX","XXX","XL","L","LX","LXX", "LXXX", "XC"};
    public boolean firstIsArabic = false, secondIsArabic = false, firstIsRoman = false, secondIsRoman = false, positiveNumber = false, isArabic = false, isRoman = false;

    public void checkString(String firstOperand, String secondOperand ) { // Проверяется соответствует ли число массиву arabic или roman
        for (int i = 0; i < arabic.length; i++) {
            String arabianStr = arabic[i];
            String romanStr = roman[i];
            if (firstOperand.equals(arabianStr)) {
                firstIsArabic = true;
            }
            if (secondOperand.equals(arabianStr)) {
                secondIsArabic = true;
            }
            if (firstOperand.toUpperCase().equals(romanStr)) {
                firstIsRoman = true;
            }
            if (secondOperand.toUpperCase().equals(romanStr)) {
                secondIsRoman = true;
            }
        }

        // Проверка на число 1 до 10
        if (firstIsArabic && secondIsArabic) { // Если оба числа арабские
            if (Integer.parseInt(firstOperand) > 0 && Integer.parseInt(firstOperand) <= 11 && Integer.parseInt(secondOperand) > 0 && Integer.parseInt(secondOperand) <= 11) {
                positiveNumber = true;
            }
            isArabic = true;
        } else if (firstIsRoman && secondIsRoman) { // Если оба числа римские
            positiveNumber = true;
            isRoman = true;
        } else {
            positiveNumber = false;
        }
    }

    public String[] getArabic() {
        return arabic;
    }
    public String[] getRoman() {
        return roman;
    }
    public String[] getRomanNumerous() {
        return romanNumerous;
    }
}
