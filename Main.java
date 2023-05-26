//Paul Kang

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type a number to select a recipe: ");
        
        int inputByUser = input.nextInt();
        System.out.println("You selected " + inputByUser);

        input.close();
    }
}