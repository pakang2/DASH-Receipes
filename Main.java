// Paul Kang

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, recipe> map = new HashMap<>();
        int hashCount = 1;

        try{
            File file = new File("recipes.txt");
            Scanner sc = new Scanner(file);
            
            // Store recipe information into HashMap
            while(sc.hasNextLine())
            {
                String name = sc.nextLine(); 
                String ingredients = sc.nextLine(); 
                String directions = sc.nextLine();
                recipe currRecipe = new recipe(name, ingredients, directions);
                map.put(hashCount, currRecipe);
                hashCount++;
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Recive input from user
        for (int i = 1; i < hashCount; i++) {
            recipe currRecipe = map.get(i);
            currRecipe.printName();
        }
        System.out.println();
        System.out.println("Please type a number to select one of the recipes: ");

        int inputFromUser = input.nextInt();
        if (inputFromUser < hashCount && inputFromUser > 0) {
            recipe requestedRecipe = map.get(inputFromUser);
            requestedRecipe.printName();
            requestedRecipe.printInfo();
        } else {
            System.out.println("Please enter a number from 1 to " + (hashCount - 1));
        }
        
        input.close();
    }
}