import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Ingredient,Double> items = new HashMap<>();
    public void addItem(Ingredient item, double amount){
        //check if item exists
        if(IngredientDatabase.itemExists(item)){
            Double newAmt = items.get(item) +amount;
            items.replace(item, newAmt);
        }
        //if so, add
        //if not, plus show "similar results"
        ingredientNotFound(item, amount);
    }
    Inventory(){
        //load all existing foods from selected ones
        for(Ingredient i:IngredientDatabase.getInstance().getIngredients()){
            items.put(i,0.0);
        }
    }
    private void ingredientNotFound(String item, Double amount){
        //search existing ingredients for similarly spelled items, or items that contain the input (if we have time lmao)
        //ask if you want to create ingredient (trigger event)
        String output = "Do you want to create the new ingredient '" +item+"'?";
        if(EventHandler.yesOrNo()){
            IngredientDatabase.addIngredient(item,EventHandler.askWhatUnit(),null);
        }
        //create new ingredient in "database"
        //item.newItem();
    }

}
//
