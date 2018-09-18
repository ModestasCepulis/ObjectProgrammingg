import javax.swing.*;

public class SixthJavaQs {


    public static void main(String[] args) {

       QuestionUD();

    }

    public static double SwitchUD(char operationDesiredAsChar) {

        switch (operationDesiredAsChar) {
            case 'A':
                String firstNumberAsString = JOptionPane.showInputDialog("(B) Please enter the first number: ");
                double firstNumber = Double.parseDouble(firstNumberAsString);

                String secondNumberAsString = JOptionPane.showInputDialog("(C) Please enter the second number: ");
                double secondNumber = Double.parseDouble(firstNumberAsString);

                double result = firstNumber + secondNumber;

                return result;

        }
    }

    public static void QuestionUD()
    {
        String operationDesired = JOptionPane.showInputDialog("(A) Please choose one of the following: \nA (for addition) " +
                "\nS (for subtraction) \n M (for multiplication) \n D (for division)");

        char operationDesiredAsChar = operationDesired.charAt(0);
        operationDesiredAsChar = operationDesiredAsChar;
        SixthJavaQs.SwitchUD(operationDesiredAsChar);
    }
    
}
