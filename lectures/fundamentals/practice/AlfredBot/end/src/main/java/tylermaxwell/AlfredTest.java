package lectures.fundamentals.practice.AlfredBot.end.src.main.java.tylermaxwell;
import java.util.Date;
public class AlfredTest {
    /*
    * This main method will always be the launch point for a Java application
    * For now, we are using the main to test all our 
    * AlfredQuotes methods.
    */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // Make some test greetings, providing any necessary data
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        System.out.println("Hello, Beth Kane. Lovely to see you.");
        System.out.println(testGuestGreeting);
        System.out.println(testGuestGreeting.equals("Hello, Beth Kane. Lovely to see you."));


        String testDateAnnouncement = alfredBot.dateAnnouncement();
        System.out.println(testDateAnnouncement);
        Date date = new Date();
        String testString = String.format("It is currently %s.", date);
        System.out.println(testString);
        System.out.println(testDateAnnouncement.equals(testString));
        
        String alexisTest = alfredBot.respondBeforeAlexis(
                            "Alexis! Play some low-fi beats."
                            );
        String alfredTest = alfredBot.respondBeforeAlexis(
            "I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis(
            "Maybe that's what Batman is about. Not winning. But failing.."
        );
        
        // Print the greetings to test.
        System.out.println(testGreeting);
        
        // Uncomment these one at a time as you implement each method.
        // System.out.println(testGuestGreeting);
        // System.out.println(testDateAnnouncement);
        // System.out.println(alexisTest);
        // System.out.println(alfredTest);
        // System.out.println(notRelevantTest);
    }
}

