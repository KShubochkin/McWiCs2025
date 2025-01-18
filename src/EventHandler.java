import java.util.HashMap;
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
}
