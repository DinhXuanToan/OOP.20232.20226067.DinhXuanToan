package ex2;

import javax.swing.*;

public class FirstDegreeSystem {
        public static void main(String[] args) {

                String stringa, stringb, stringc, stringd, stringe1, stringe2, result;
                double a, b, c, d, e1, e2;
                stringa = JOptionPane.showInputDialog(null, "Equation:\nax + by = e1\ncx + dy = e2 \nEnter a: ",
                                "Input",
                                JOptionPane.INFORMATION_MESSAGE);
                stringb = JOptionPane.showInputDialog(null, "Equation:\nax + by = e1\ncx + dy = e2 \nEnter b: ",
                                "Input",
                                JOptionPane.INFORMATION_MESSAGE);
                stringe1 = JOptionPane.showInputDialog(null, "Equation:\nax + by = e1\ncx + dy = e2 \nEnter e1: ",
                                "Input",
                                JOptionPane.INFORMATION_MESSAGE);
                stringc = JOptionPane.showInputDialog(null, "Equation:\nax + by = e1\ncx + dy = e2 \nEnter c: ",
                                "Input",
                                JOptionPane.INFORMATION_MESSAGE);
                stringd = JOptionPane.showInputDialog(null, "Equation:\nax + by = e1\ncx + dy = e2 \nEnter d: ",
                                "Input",
                                JOptionPane.INFORMATION_MESSAGE);
                stringe2 = JOptionPane.showInputDialog(null, "Equation:\nax + by = e1\ncx + dy = e2 \nEnter e2: ",
                                "Input",
                                JOptionPane.INFORMATION_MESSAGE);
                a = Double.parseDouble(stringa);
                b = Double.parseDouble(stringb);
                c = Double.parseDouble(stringc);
                d = Double.parseDouble(stringd);
                e1 = Double.parseDouble(stringe1);
                e2 = Double.parseDouble(stringe2);

                double D = a * d - b * c;
                double D1 = d * e1 - b * e2;
                double D2 = a * e2 - c * e1;

                if (D == 0 && (D2 == 0) && (D1 == 0)) {
                        result = "Many Solutions";
                } else if (D == 0) {
                        result = "No Solutions";
                } else {
                        double x = D1 / D;
                        double y = D2 / D;
                        result = "Solution:\nx = " + x + "\ny = " + y;
                }

                JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
        }
}