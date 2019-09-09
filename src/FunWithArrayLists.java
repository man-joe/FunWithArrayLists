/*
Try the following exercises:

Write a Java program to create a new array list to hold colors.
Add at least 3 colors (string) to the array list and print out all its values.
Using the array list created above, print out the value at index 1.
Using the array list above, prompt the user for one new color, and add that color to the array list.
Using the array list, continue prompting the user for colors until they type in "Q" or "q" to quit.
Each time the user enters a color, add that to the array list. Print out the list at the end.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class FunWithArrayLists {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String input = "";

        // Add at least 3 colors
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");

        // Print current list
        System.out.println(colors.toString());

        // Print value at index 1
        System.out.println("Color at index 1 is: " + colors.get(1));

        //Continue prompting user for colors till they press Q or q
        do{
            System.out.print("Enter colors or q to quit: ");
            input = sc.next();
            if(input.equalsIgnoreCase("Q"))
                break;
            else
                colors.add(input);
        } while(true);

        //Printing ArrayList
        for(String s : colors)
            System.out.println(s);
    }

}
