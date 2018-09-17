import javax.swing.*;

public class FifthJavaQs {
    public static void main(String[] args) {


        






    }








    public void Result(double result)
    {
        JOptionPane.showMessageDialog(null,"The result is : " + result);
    }

    public String Question()
    {
        String operationDesired = JOptionPane.showInputDialog("(A) Please choose one of the following: \nA (for addition) " +
                "\nS (for subtraction) \n M (for multiplication) \n D (for division)");
        return operationDesired;
    }

    public void switchCode(String operationDesired)
    {

        char operationDesiredAsChar = operationDesired.charAt(0);

        switch (operationDesiredAsChar) {
            case 'A':
                String firstNumberAsString = JOptionPane.showInputDialog("(B) Please enter first number: ");
                double firstNumber = Double.parseDouble(firstNumberAsString);

                String secondNumberAsString = JOptionPane.showInputDialog("(B) Please enter first number: ");
                double secondNumber = Double.parseDouble(firstNumberAsString);

                double result = firstNumber + secondNumber;
            case 'S':
                firstNumberAsString = JOptionPane.showInputDialog("(B) Please enter first number: ");
                firstNumber = Double.parseDouble(firstNumberAsString);

                secondNumberAsString = JOptionPane.showInputDialog("(B) Please enter first number: ");
                secondNumber = Double.parseDouble(firstNumberAsString);

                result = firstNumber - secondNumber;
            case 'M':
                firstNumberAsString = JOptionPane.showInputDialog("(B) Please enter first number: ");
                firstNumber = Double.parseDouble(firstNumberAsString);

                secondNumberAsString = JOptionPane.showInputDialog("(B) Please enter first number: ");
                secondNumber = Double.parseDouble(firstNumberAsString);

                result = firstNumber * secondNumber;

            case 'D':
                firstNumberAsString = JOptionPane.showInputDialog("(B) Please enter first number: ");
                firstNumber = Double.parseDouble(firstNumberAsString);
                secondNumberAsString = JOptionPane.showInputDialog("(B) Please enter first number: ");
                secondNumber = Double.parseDouble(firstNumberAsString);

                result = firstNumber * secondNumber;

            default:
                JOptionPane.showMessageDialog(null,"Invalid! Please enter a choice: \nA\nS\nM\nD");
                break;



        }


        }
    }

