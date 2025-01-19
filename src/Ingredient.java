import java.util.Set;

public class Ingredient {
    private Unit unit;
    private String name;
    private Set<Tag> tags;
    private Float amount;

    public Ingredient(String name, Unit unit,Set<Tag> tags, Float amount){
        this.unit = unit;
        this.name = name;
        this.tags = tags;
        this.amount = amount;
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
    public Float getAmount(){
        return amount;
    }
}
