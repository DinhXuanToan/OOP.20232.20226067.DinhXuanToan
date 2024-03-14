package ex2;

import javax.swing.*;

public class SecondDegree {
    public static void main(String[] args) {
        String stringa, stringb, stringc, result;
        double a, b, c;
        stringa = JOptionPane.showInputDialog(null, "Enter a: ", "Input of ax^2 + bx + c =0",
                JOptionPane.INFORMATION_MESSAGE);
        stringb = JOptionPane.showInputDialog(null, "Enter b: ", "Input of ax^2 + bx + c =0",
                JOptionPane.INFORMATION_MESSAGE);
        stringc = JOptionPane.showInputDialog(null, "Enter c: ", "Input of ax^2 + bx + c =0",
                JOptionPane.INFORMATION_MESSAGE);
        a = Double.parseDouble(stringa);
        b = Double.parseDouble(stringb);
        c = Double.parseDouble(stringc);

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    result = "Many Solutions";
                } else {
                    result = "No Solutions";
                }
            } else {
                result = "Solution:\nx = " + (-c / b);
            }
        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                result = "2 Distinct Solutions:\nx1 =" + x1 + "\nx2 = " + x2;
            } else if (delta == 0) {
                double x = -b / (2 * a);
                result = "Double Solutions:\nx1 = x2 = " + x;
            } else {
                result = "No Solutions";
            }
        }
        JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}