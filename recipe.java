//Paul Kang

public class recipe {
    String name;
    String ingredients;
    String directions;

    // Constructors
    recipe() {
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

    public void print()
    {
        System.out.println(name);
        System.out.println(ingredients);
        System.out.println(directions);
    }
}
