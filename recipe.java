//Paul Kang

public class recipe {
    String name;
    String ingredients;
    String directions;

    //Empty Constructor
    recipe()
    {
        name = "";
        ingredients = "";
        directions = "";
    }

    //Constructor
    recipe(String name, String ingredients, String directions)
    {
        this.name = name;
        this.ingredients = ingredients;
        this.directions = directions;
    }

    public void print()
    {
        
    }
}
