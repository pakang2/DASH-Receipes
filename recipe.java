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

    public void printName()
    {
        System.out.println(name);
    }

    public void printInfo()
    {
        System.out.println(ingredients);
        System.out.println(directions);
    }
}
