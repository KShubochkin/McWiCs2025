import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class EventHandler {
    private HashMap<String, Consumer<Object>> eventHandler;
    public void register_event(){
    }
    public void triggerEvent(String eventName, Object data){
        if(eventHandler.containsKey(eventName)){
            eventHandler.get(eventName).accept(data);
        } else {
            //error
        }
    }
    public static boolean yesOrNo(){
        //connect to UI to read user input
        boolean input = false;
        return input;
    }
    public static Unit askWhatUnit(){
        //read user response, determine if it's a real unit, then return if it is. otherwise error
        return new Unit();
    }
    public static Set<Tag> askWhatTags(){
        Set<Tag> tags = new HashSet<Tag>();
        //parse user response
        return tags;
    }
    public static void addFoodToInventory(){

    }
}
