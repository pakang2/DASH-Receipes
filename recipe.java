//Paul Kang

public class recipe {
    String name;
    String ingredients;
    String directions;

    recipe()
    {
        name = "";
        ingredients = "";
        directions = "";
    }
    recipe(String name, String ingredients, String directions)
    {
        this.name = name;
        this.ingredients = ingredients;
        this.directions = directions;
    }
}
