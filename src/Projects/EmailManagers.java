package Projects;
import java.util.ArrayList;
class Email{
    String subject;
    String sender;
    String message;

    public Email(String subject, String sender, String message){
        this.subject = subject;
        this.sender = sender;
        this.message = message;
    }
}

public class EmailManagers {
    ArrayList<Email> emails;
    public EmailManagers() {
        emails = new ArrayList<Email>();
    }
    public void addEmail(Email email){
        emails.add(email);
    }
    public void printEmails() {
        for (Email email : emails) {
            System.out.println("Subject: " + email.subject);
            System.out.println("Sender: " + email.sender);
            System.out.println("Message: " + email.message);
        }
    }
    public ArrayList<Email> getEmailsLongerThan(int minMessageLength){
        ArrayList<Email> longEmail = new ArrayList<Email>();
        for (Email email: emails){
            if (email.message.length() > minMessageLength){
                longEmail.add(email);
            }
        }
        return longEmail;
    }
    public static void main(String[] args) {
        // You can run this class to test your code
        EmailManagers em = new EmailManagers();
        em.addEmail(new Email("Hello", "Donald", "Hello, world!"));
        em.addEmail(new Email("CITS2005", "Max", "Good luck with the lab!"));
        em.addEmail(new Email("The halting problem", "Alan", "I'm not sure if this is solvable."));
        em.printEmails();
        System.out.println("Long emails:");
        for (Email email : em.getEmailsLongerThan(20)) {
            System.out.println(email.subject);
        }
    }
}
