import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class HelloSirMadz {

    public static void main(String[] args) {
        displayGreeting();
        displayRandomNumber();
        displayCurrentTime();
    }

    public static void displayGreeting() {
        String[] greetings = {"Hello Sir Madz!", "Greetings Sir Madz!", "Salutations Sir Madz!", "Welcome Sir Madz!", "Ahoy Sir Madz!"};
        Random random = new Random();
        int randomIndex = random.nextInt(greetings.length);
        System.out.println(greetings[randomIndex]);
    }

    public static void displayRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(100); 
        System.out.println("A random number for Sir Madz: " + randomNumber);
    }

    public static void displayCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Current time for Sir Madz: " + formattedDateTime);
    }
}

