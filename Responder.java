import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Responder
{
    private ArrayList<String> responses;
    private Random r;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        responses = new ArrayList<>();
        fillResponses();
        r = new Random();
    }
    
    private void fillResponses(){
        responses.add("Imagine Dragons In The Fade");
        responses.add("These answers are randomly generated I don't actually know what you said.");
        responses.add("bleh :P");
        responses.add("ae");
        responses.add("Richard on his way to Egwithas");
        responses.add("Bismillah c'est les tenebres");
        responses.add("Bonne fete Kevin");
        responses.add("I love the hit video game Dragon Age Origins");
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int index = r.nextInt(responses.size());
        String response = responses.get(index);
        return response;
    }
}

