import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class Responder
{
    private Random r;
    private HashMap<String, String> responseMap;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        r = new Random();
        responseMap = new HashMap<>();
        fillResponseMap();
    }
    
    public void fillResponseMap(){
        responseMap.put("techsupport", "This isn't actually a tech support thing I lied.");
        responseMap.put("test", "It works!");
    }
    
    public String pickDefaultResponse(){
        return "This isn't actually a tech support thing btw I lied. Also I have no idea what you just said.";
    }
    
    public String generateResponse(HashSet<String> words){
        for(String word : words){
            String response = (responseMap.get(word) != null)? responseMap.get(word) : pickDefaultResponse();
            if(response != null){
                return response;
            }
        }
        return pickDefaultResponse();
    }
}

