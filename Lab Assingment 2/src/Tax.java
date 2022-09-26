import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char maritalStatus;
        System.out.print("Are you married? (N/Y): ");
        char Status = in.next().charAt(0);
        System.out.print("Enter your income: ");
        double income;
        double tax;
        income = in.nextDouble();
        Married married= new Married();
        Single single = new Single();
        if (Status == 'Y') {

            tax = married.Tax(income);
            System.out.println("The tax is: " + tax);
        } else if (Status == 'N') {


            tax = single.Tax(income);

            System.out.println("The tax is: " + tax);
        }
    }
}