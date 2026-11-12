import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public HashSet<String> getInput()
    {
        // print prompt
        System.out.print("> ");         
        String inputLine = reader.nextLine().trim().toLowerCase();
        
        // Use a Scanner to split at spaces
        Scanner splitter = new Scanner(inputLine);
        
        // Add each word into the HashSet
        HashSet<String> words = new HashSet();
        while(splitter.hasNext()){
            words.add(splitter.next());
        }
        
        return words;
    }
}
