import javax.swing.*;

public class FirstJavaQsW2 {

    public static void main(String[] args) {

        rateQuestionUD();

    }

    public static double rateQuestionUD ()
    {
       String rateQuestionAsString = JOptionPane.showInputDialog("Please enter the rate current rate of GB to euro:");
       double rateQuestion = Double.parseDouble(rateQuestionAsString);
       poundQuestionUD();
       return rateQuestion;

    }

    public static double poundQuestionUD()
    {
        String poundInputAsString = JOptionPane.showInputDialog("Please enter the amount of pounds you want to convert to euros:");
        double poundInput = Double.parseDouble(poundInputAsString);
        poundsToEuroConverter();
        return poundInput;
    }

    public static double poundsToEuroConverter(double rateQuestion, double poundInput)
    {
         double theFinalConvertedResult;
         theFinalConvertedResult = rateQuestion * poundInput;
         return theFinalConvertedResult;
    }

    public static void theLastResult(double theFinalConvertedResult)
    {
        JOptionPane.showMessageDialog(null,"The total amount of euros that you're getting: " + theFinalConvertedResult);
    }


}
