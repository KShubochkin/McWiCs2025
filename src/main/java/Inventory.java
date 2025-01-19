import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<Ingredient,Double> items = new HashMap<>();
    /*public void addItem(Ingredient item, double amount){
        //check if item exists
        if(IngredientDatabase.itemExists(item)){
            Double newAmt = items.get(item) +amount;
            items.replace(item, newAmt);
        }
        //if so, add
        //if not, plus show "similar results"
        ingredientNotFound(item, amount);
    }*/
    Inventory(){
        //load all existing foods from selected ones
        for(Ingredient i:IngredientDatabase.getInstance().getIngredients()){
            items.put(i,0.0);
        }
    }

    private class TrieNode{
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEnd;
    }

    private TrieNode trieRoot = new TrieNode();
    
    ArrayList<String> searchForIngredients(String firstLetters){
        TrieNode node = trieRoot;
        ArrayList<String> results = new ArrayList<>();
        char[] characters = firstLetters.toLowerCase().toCharArray();
        for (int i = 0; i < characters.length; i++){
            if (!node.isEnd){
                String toAdd = "";
                for (int j = 0; j <= i; j++){
                    toAdd = toAdd + characters[j];
                }
                results.add(toAdd);
            }
            node = node.children.get('c'); //?
            if (node == null){
                return new ArrayList<>();
            }
        }
        getIngredients(node, firstLetters, results);
        return results;
    }
    
    private void getIngredients(TrieNode node, String firstLetters, ArrayList<String> results){
        if (node.isEnd){
            String ingredient = firstLetters.substring(0, 1) + firstLetters.substring(1);
            results.add(ingredient);
        }
        for (char c: node.children.keySet()){
            getIngredients(node.children.get(c), firstLetters + c, results);
        }
    }
    
    /*private void ingredientNotFound(String item, Double amount){
        //search existing ingredients for similarly spelled items, or items that contain the input (if we have time lmao)
        ArrayList<String> possibilities = searchForIngredients(item);
        String possibilitiesAsString[] = possibilities.toArray;
        String newString = "";
        if (possibilitiesAsString.length != 0){
            if (possibilitiesAsString.length == 1){
                newString = possibilitiesAsString[0];
            }
            if (possibilitiesAsString.length == 2){
                newString = "'"+possibilitiesAsString[0] + "' or '" + possibilitiesAsString[1] + "'";}
            else{
                for (int j = 0; j < possibilitiesAsString.length - 1; j++){
                    newString = newString + "'" + possibilitiesAsString[j] + ",' ";
                }
                newString = newString + "or '" + possibilitiesAsString[possibilitiesAsString.length - 1] +"'";
            }
            String output = "Did you mean '" + newString + "?";
        }
        //EventHandler where if they meant another option it adds/removes for the other ingredient instead. 
        //ask if you want to create ingredient (trigger event)
        String output = "Do you want to create the new ingredient '" +item+"'?";
        if(EventHandler.yesOrNo()){
            IngredientDatabase.addIngredient(item,EventHandler.askWhatUnit(),null);
        }
        //create new ingredient in "database"
        //item.newItem();
    }*/

}
