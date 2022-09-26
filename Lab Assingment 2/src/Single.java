public class Single {
    public double Tax(double income) {

        if (income <= 8000)

            return income * 6.1;

        else if (income > 8000 && income <= 32000)

            return 800 + income * 0.15;

        else


            return 4400 + income * 8.25;
    }
}