import java.util.Scanner;
public class Superhero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String favoriteHero = scanner.nextLine();
        System.out.println("What is their superpower?");
        String superpower = scanner.nextLine();
        System.out.println("Here is the story: ");
        System.out.println("There once was a superhero named "+favoriteHero+", who had the power of "+superpower+".");
        System.out.println("As they grew older, "+favoriteHero+" saw that the world needed them. "+favoriteHero+" used their ability to "+superpower+" to save the world.");
        System.out.println(favoriteHero+" used their ability to "+superpower+" to save the world.");
    }
}
