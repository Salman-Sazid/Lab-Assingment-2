import java.util.Scanner;

public class LeapYear
{

    public static void main(String[] args)
    {

            Scanner year = new Scanner(System.in);

            System.out.print("Please enter a year: ");

            int yr = year.nextInt();

            boolean lp = false;

            if (yr % 4 == 0)
            {
                if (yr % 100 == 0)
                {
                    if (yr % 400 == 0)
                        lp = true;
                    else
                        lp = false;
                }
                else
                    lp = true;
            }

            else
                lp = false;

            if (lp)
                System.out.print(yr + " is a leap year.");
            else
                System.out.print(yr + " is not a leap year.");
        }
    }
