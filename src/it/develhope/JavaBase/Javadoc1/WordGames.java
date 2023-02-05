package it.develhope.JavaBase.Javadoc1;

/**
 * This class represents word games
 * @author Emmanuele Ottanà
 */
public class WordGames {
    /**
     * @param word it's a word
     * @return "Hello "+ @word
     */
    public String addHelloWord(String word){
        return "Hello "+word;
    }

    /**
     * @param name is the name
     * @param surname is the surname
     * @return @name + @surname
     */
    public String getFullName(String name, String surname){
        return name +" "+ surname;
    }
}