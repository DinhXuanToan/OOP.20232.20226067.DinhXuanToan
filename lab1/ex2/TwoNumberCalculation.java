package ex2;

import javax.swing.*;

public class TwoNumberCalculation {
    public static void main(String[] args) {
        String string1, string2, result;
        double num1, num2, sum, difference, product, quotient;
        string1 = JOptionPane.showInputDialog(null, "Enter a: ", "Input", JOptionPane.INFORMATION_MESSAGE);
        string2 = JOptionPane.showInputDialog(null, "Enter b: ", "Input", JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(string1);
        num2 = Double.parseDouble(string2);
        sum = num1 + num2;
        result = "sum: " + sum + "\n";

        difference = num1 - num2;
        result += "difference: " + difference + "\n";

        product = num1 * num2;
        result += "product: " + product + "\n";

        if (num2 != 0) {
            quotient = num1 / num2;
            result += "quotient: " + quotient + "\n";
        } else
            result += "quotient: NULL";
        JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}