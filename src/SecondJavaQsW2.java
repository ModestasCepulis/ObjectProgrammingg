import javax.swing.*;

public class SecondJavaQsW2 {
    public static void main(String[] args) {


        yardsInputNumber();

    }

    public static int yardsInputNumber ()
    {
        int inchesCalculator;
        int[] theInchesOutput;

        for(int a=1; a < 11; a++)
        {
            String yardInputAsString = JOptionPane.showInputDialog("Please enter the amount of yards");
            int yardInput = Integer.parseInt(yardInputAsString);
            inchesCalculator = (yardInput * 12) * 3;

            theInchesOutput = new int[11];
            theInchesOutput[a] = yardInput;
            return theInchesOutput[a];

        }
    }


    public static void arrayOutput(int theInchesOutput)
    {

        JOptionPane.showMessageDialog(null,"Yards \n" + theInchesOutput[5]);

    }





    }

