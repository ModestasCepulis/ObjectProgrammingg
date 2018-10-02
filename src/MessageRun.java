import javax.swing.*;

public class MessageRun {

    static Message msg;

    public static void main(String[] args) {
        msg = new Message();

        String recipient = inputRecipient();
        String sender = inputSender();

        finalOutput(recipient,sender);

    }

    public static String inputRecipient()
    {
        String recipientString;
        msg.setRecipient(recipientString = JOptionPane.showInputDialog("Please enter the recipients information"));
        return recipientString;
    }

    public static String inputSender()
    {
        String senderString;
        msg.setSender(senderString = JOptionPane.showInputDialog("Please enter the senders information"));
        return senderString;
    }


    public static void finalOutput(String recipientString, String senderString)
    {
        msg.setRecipient(recipientString);
        msg.setSender(senderString);
        msg.setMessageText(msg.append());

        JOptionPane.showMessageDialog(null,msg.toString());
    }
}
