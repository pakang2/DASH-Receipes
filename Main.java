// Paul Kang

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, recipe> map = new HashMap<>();
        int hashcount = 1;

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
                currRecipe.print();
                map.put(hashcount, currRecipe);
                hashcount++;
            }
            

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        /*
        // Recive input from user
        System.out.println("Please type a number to select a recipe: ");

        int inputFromUser = input.nextInt();
        if (inputFromUser <= hashcount && inputFromUser > 10) {
            recipe currRecipe = map.get(inputFromUser);
            currRecipe.print();
        } else {
            System.out.println("Please enter a number from 1 to " + hashcount);
        }
        */
        
        input.close();
    }
}