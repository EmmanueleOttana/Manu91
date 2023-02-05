package it.develhope.JavaBase.Javadoc1;
/**
 * This is a class of testers
 * @author Emmanuele Ottanà
 */
public class Tester {
    public static void main(String[] args) {
        WordGames wordGames = new WordGames();

        System.out.println(wordGames.addHelloWord("word"));
        System.out.println(wordGames.getFullName("Harry","Potter"));

    }
}
