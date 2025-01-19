import java.util.HashSet;
import java.util.Set;
  
class IngredientDatabase{
  private static IngredientDatabase instance;
  private Set<Ingredient> ingredients;
  IngredientDatabase(){
    ingredients = new HashSet<>();
  }
  public static IngredientDatabase getInstance(){
    if (instance == null){
      instance = new IngredientDatabase();
    }
    return instance;
  }
  public Set<Ingredient> getIngredients(){
    return ingredients;
  }
  public Set<Ingredient> search(Tag tag){
    Set<Ingredient> toReturn = new HashSet<>();
    for (Ingredient ingredient: ingredients){
      if (ingredient.getTags().contains(tag)){
        toReturn.add(ingredient);
      }
    }
    return toReturn;
  }
  public static void addIngredient(String name, Unit unit, Tag[] tags){
    Set<Tag> toAdd = new HashSet<>();
    for (Tag tag: tags){
      toAdd.add(tag);
    }
    getInstance().ingredients.add(new Ingredient(name, unit, toAdd,0.0));
  }
  public boolean itemExists(Ingredient item){
    return false;
  }
}
