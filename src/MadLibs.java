import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert color, pastTenseVerb, adjective and noun");
        String color = scanner.next();
        String pastTenseVerb = scanner.next();
        String adjective = scanner.next();
        String noun = scanner.next();
        System.out.print("The " + color + " dragon " + pastTenseVerb + " at the " +
                adjective);
        System.out.println(" knigt, who rode in on a sturdy, giant " + noun + ".");
    }
}
