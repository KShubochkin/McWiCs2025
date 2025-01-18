import java.util.Set;

public class Ingredient {
    private Unit unit;
    private String name;
    private Set<Tag> tags;

    public void addIngredient(String ingredient, Unit unit, String[] tags){
        //Create a new ingredient with the corresponding ingredient name, unit type, and appropriate tags
        this.name = ingredient;
        this.unit = unit;
        for (int i = 0; i < tags.length; i++){
                this.tags.add(tags[i]);
        }
    }
        
}
