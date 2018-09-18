import javax.swing.*;

public class SixthJavaQs {


    public static void main(String[] args) {

       QuestionUD();



    }

    public static void SwitchUD(char operationDesiredAsChar) {

        switch (operationDesiredAsChar) {
            case 'A':
                getNum1();
                getNum2();
                break;
            case 'S':
                getNum1();
                getNum2();
                Subtraction(getNum1(), getNum2());
                break;

            case 'M':
                getNum1();
                getNum2();
                break;

            case 'D':
                getNum1();
                getNum2();
                break;

            default:
                JOptionPane.showMessageDialog(null,"Invalid! Please enter a choice: \nA\nS\nM\nD");
                break;
        }



    }



    public static void QuestionUD()
    {
        String operationDesired = JOptionPane.showInputDialog("(A) Please choose one of the following: \nA (for addition) " +
                "\nS (for subtraction) \n M (for multiplication) \n D (for division)");

        char operationDesiredAsChar = operationDesired.charAt(0);
        operationDesiredAsChar = operationDesiredAsChar;
        SixthJavaQs.SwitchUD(operationDesiredAsChar);

        SixthJavaQs.theLastResult(double result);
    }

    public static void theLastResult(double result)
    {
        JOptionPane.showMessageDialog(null,"your result is: " + result);
    }

    public static double Addition(double firstNumber, double secondNumber)
    {
        double result;
        result = firstNumber + secondNumber;
        return result;

    }

    public static double Subtraction(double firstNumber, double secondNumber)
    {
        double result;
        result = firstNumber - secondNumber;
        return result;

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
