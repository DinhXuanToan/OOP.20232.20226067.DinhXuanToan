package ex2;

import javax.swing.*;

public class FirstDegree {
    public static void main(String[] args) {
        String stringa, stringb, result;
        double a, b;
        stringa = JOptionPane.showInputDialog(null, "Enter a: ", "Input of ax +b = 0", JOptionPane.INFORMATION_MESSAGE);
        stringb = JOptionPane.showInputDialog(null, "Enter b: ", "Input of ax +b = 0", JOptionPane.INFORMATION_MESSAGE);
        a = Double.parseDouble(stringa);
        b = Double.parseDouble(stringb);
        if (a == 0) {
            if (b != 0)
                result = "No Solutions";
            else
                result = "Many Solutions";
        } else
            result = "Solution:\nx = " + (-b / a);
        JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}