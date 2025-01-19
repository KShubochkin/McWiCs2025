import java.util.Set;

public class Ingredient {
    private Unit unit;
    private String name;
    private Set<Tag> tags;

    public Ingredient(String name, Unit unit,Set<Tag> tags){
        this.unit = unit;
        this.name = name;
        this.tags = tags;
    }
    public Unit getUnit(){
        return unit;
    }
    public String getName(){
        return name;
    }
    public Set<Tag> getTags(){
        return tags;
    }
}
