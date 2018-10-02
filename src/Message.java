import javax.swing.*;

public class Message {

    private String recipient;
    private String sender;
    private String messageText;

    public void setRecipient(String recipient) {this.recipient = recipient;}
    public String getRecipient(){return recipient;}

    public void setSender(String sender) {this.sender = sender;}
    public String getSender(){return sender;}

    public void setMessageText(String messageText) {this.messageText = messageText;}
    public String getMessageText(){return messageText;}

    public Message()
    {
        this.recipient = "No Recipient";
        this.sender = "No Sender";
        this.messageText = "No Message Text";
    }

    public Message(String recipient, String sender, String addedText)
    {
        setRecipient(recipient);
        setSender(sender);
        setMessageText(addedText);
    }

    public String append()
    {
        String addedText = "How is it going? Good? Good.";

        return addedText;
    }

    public String toString()
    {
        return "The Recipient: " + getRecipient() + "\nThe Sender: " + getSender()
                + "\nThe Message " + getMessageText();
    }


}
