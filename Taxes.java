import java.util.Scanner;
public class Taxes {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Input income here");
        float income = inScanner.nextFloat();
        if (income < 15000) {
            System.out.println("You are in the 0% tax bracket.\nYou earn all your money tax free!");
        } else {
            String taxBracket, taxString;
            int decimals, decimalFinder;
            double tax;
            if (income < 20000) {
                tax = (income - 15000) * 0.1;
                taxBracket = "10%";
            } else if (income < 30000) {
                tax = ((income - 20000) * 0.15) + 500;
                taxBracket = "15%";
            } else if (income < 45000) {
                tax = ((income - 30000) * 0.2) + 2000;
                taxBracket = "20%";
            } else {
                tax = ((income - 45000) * 0.25) + 5000;
                taxBracket = "25%";
            }
            tax = (tax * 100 - ((tax * 100) % 1)) / 100;
            taxString = "" + tax;
            decimalFinder = taxString.indexOf(".");
            decimals = taxString.length() - decimalFinder;
            if (decimals == 2) {
                taxString = taxString + "0";
            }
            System.out.println("You are in the " + taxBracket + " tax bracket.\n" +
                    "You will be paying £" + taxString + " in tax.");
        }
    }
}
/*
0      - 14,999 :  0pc
15,000 - 19,999 : 10pc
20,000 - 29,999 : 15pc
30,000 - 44,999 : 20pc
45,000 +        : 25pc
*/