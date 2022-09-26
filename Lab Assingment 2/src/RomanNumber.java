public class RomanNumber {
    public static void integerToRoman(int num) {

        System.out.println("Integer: " + num);
        int[] values = {1000, 500, 100, 50,  10, 5, 1};
        String[] romanLiterals = {"M", "D", "C",  "L",  "X",  "V",  "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        System.out.println("Roman: " + roman.toString());
    }
}
