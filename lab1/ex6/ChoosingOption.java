package ex6;

import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showOptionDialog(
                null,
                "Do you wanna change to the first class ticket?",
                "Question", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                new String[] { "Yes, I do", "No, I don't" }, null);
        JOptionPane.showMessageDialog(null, (option == JOptionPane.YES_NO_OPTION ? "oke" : "???"));
        System.exit(0);

    }
}