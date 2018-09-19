import javax.swing.*;

public class FifthJavaQs {


    public static void main(String[] args) {
        QuestionUD();
    }



    public static void SwitchUD(char operationDesiredAsChar) {

        double result;

        switch (operationDesiredAsChar) {
            case 'A':
                result = getNum1() + getNum2();
                theLastResult(result);
                break;
            case 'S':
                result = getNum1() - getNum2();
                theLastResult(result);
                break;
            case 'M':
                result = getNum1() * getNum2();
                theLastResult(result);
                break;

            case 'D':
                result = getNum1() / getNum2();
                theLastResult(result);
                break;

            default:
                JOptionPane.showMessageDialog(null,"Invalid! Please enter a choice: \nA\nS\nM\nD");
                QuestionUD();
                break;
        }



    }



    public static void QuestionUD()
    {

        String operationDesired = JOptionPane.showInputDialog("(A) Please choose one of the following: \nA (for addition) " +
                "\nS (for subtraction) \n M (for multiplication) \n D (for division)");

        char operationDesiredAsChar = operationDesired.charAt(0);

        if(!operationDesired.equals("Quit"))
        {
            SixthJavaQs.SwitchUD(operationDesiredAsChar);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Thanks for using the program! Quitting now...s");
        }

    }

    public static void theLastResult(double result)

    {
        JOptionPane.showMessageDialog(null,"your result is: " + result);
    }

    public static double getNum1()
    {
        String firstNumberAsString = JOptionPane.showInputDialog("(B) Please enter first number: ");
        double firstNumber = Double.parseDouble(firstNumberAsString);
        return firstNumber;
    }

    public static double getNum2()
    {
        String secondNumberAsString = JOptionPane.showInputDialog("(C) Please enter the second number: ");
        double secondNumber = Double.parseDouble(secondNumberAsString);
        return secondNumber;
    }
}
