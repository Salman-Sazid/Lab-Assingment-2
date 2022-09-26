import java.util.Scanner;

public class RomanConv {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.println("Enter a number:");

        int number = num.nextInt();

        RomanNumber.integerToRoman(number);
    }
}
