import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Ingredient,Double> items = new HashMap<>();
    public void addItem(Ingredient item, double amount){
        //check if item exists
        //if so, add
        //if not, ask if you want to create ingredient (trigger event), plus show "similar results"
        ingredientNotFound(item);
    }
    private void ingredientNotFound(Ingredient item){
        //search existing ingredients for similarly spelled items, or items that contain the input (if we have time lmao)

    }
}
