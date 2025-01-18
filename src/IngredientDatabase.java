import java.util.Set
  
class IngredientDatabase{
  private static IngredientDatabase instance;
  private Set<Ingredient> ingredients;
  private IngredientsDatabase(){
    ingredients = new HashSet<>();
  }
  public static IngredientDatabase getInstance(){
    if (instance == null){
      instance = new IngredientDatabase;
    }
    return instance;
  }
  public Set<Ingredient> getIngredients(){
    return ingredients;
  }
  public Set<Ingredient> search(Tag tag){
    Set<Ingredient> toReturn = newHashSet<>();
    for (Ingredient ingredient: ingredients){
      if (ingredient.getTags().contains(tag)){
        toReturn.add(ingredient);
      }
    }
    return toReturn;
}
