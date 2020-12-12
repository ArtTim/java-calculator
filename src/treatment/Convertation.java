package treatment;

public class Convertation {
    CheckNum checkNum = new CheckNum();

    // Преобразование в арабскую систему счисления
    public int toArabian(String str) {
        String[] arabian = checkNum.getArabic();
        String[] roman = checkNum.getRoman();
        String result = "";
        for (int i = 0; i < roman.length; i++) {
            if (str.toUpperCase().contains(roman[i])) {
                result = arabian[i];
            }
        }
        return Integer.parseInt(String.valueOf(result));
    }

    // Преобразование в римскую систему счисления
    public String toRoman(int number) {
        String[] arabian = checkNum.getArabic();
        String[] roman = checkNum.getRoman();
        String result = "";
        if (number > 0 && number < 10) { // Если число не больше 10
            for (int i = 0; i < arabian.length; i++) {
                int x = Integer.parseInt(arabian[i]);
                if (number == x) {
                    result += roman[i];
                }
            }
            checkNum.positiveNumber = true;
            return result;
        } else if (number == 0) {
           return result = "0";
        } else { // Иначе
            result = String.valueOf(number);
            String[] resultArray = result.split("");
            String romanResult = "";

            if (resultArray.length == 2) { // Если число двухзначное
//                    System.out.println("Двухзначное число");
                for (int j = 0; j < checkNum.getArabic().length; j++) {
                    if (resultArray[0].contains(checkNum.getArabic()[j])) {
                        romanResult += checkNum.getRomanNumerous()[j];
                    }
                    if (resultArray[1].contains(checkNum.getArabic()[j])) {
                        romanResult += checkNum.getRoman()[j];
                    }
                }

            } else if (result.contains("100")) { // Если 100. (10 * 10 = 100 - это максимальное число)
//                    System.out.println("Трехзначное число");
                romanResult = "C";
            }
            return romanResult;
        }

    }

}


