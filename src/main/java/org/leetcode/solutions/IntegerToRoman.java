package org.leetcode.solutions;
// TODO: rewrite to easier version
public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int order = 0;
        int diviser = 1000;
        while (num != 0) {
            int digit = num / diviser;
            num = num % diviser;
            returnRomanOneOrder(digit, result, order);
            order++;
            diviser /= 10;
        }
        return result.toString();
    }

    private static void returnRomanOneOrder (int number, StringBuilder result, int order){
        String[][] romanDigits = new String[4][3];
        romanDigits[0] = new String[]{"M"};
        romanDigits[1] = new String[]{"C", "D", "M"};
        romanDigits[2] = new String[]{"X", "L", "C"};
        romanDigits[3] = new String[]{"I", "V", "X"};
        switch (number) {
            case 1, 2, 3: {
                result.append(romanDigits[order][0].repeat(number));
                break;
            }
            case 4: {
                result.append(romanDigits[order][0]).append(romanDigits[order][1]);
                break;
            }
            case 5: {
                result.append(romanDigits[order][1]);
                break;
            }
            case 6, 7, 8: {
                result.append(romanDigits[order][1]).append(romanDigits[order][0].repeat(number - 5));
                break;
            }
            case 9: {
                result.append(romanDigits[order][0]).append(romanDigits[order][2]);
                break;
            }
        }
    }
}
