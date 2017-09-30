package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

   static int count;

    static Scanner input = new Scanner(System.in);

    public static void game(){
        // scanner


        System.out.println("Hello stranger! You are about to begin the category game. ");
        System.out.println("Whether you like it or not. ");
        System.out.println("I am only kidding. But for this game, I'm going to help you remember all the colors. ");

        //ROUND 1
        // begin the game : by telling both users to enter in all the colors they know for points
        // to win this round you must name more colors then the 2nd player
        // ask the first user to enter in all the colors they know
        System.out.println("User 1: You have 30 seconds to think of all the colors you know. ");
        System.out.println("Hint for User 1: Please remember that some colors that you think are colors, are actually shades.");

        // create the array of colors :
        String[] trueColors = {"blue", "green", "yellow", "orange", "violet", "brown", "pink", "red", "purple", "burgundy"};
        String[] notTrueColors = {"black", "white", "grey"};

        // ask the user for how many colors they've thought of:
        System.out.println(" Enter in the number of colors that you've thought of: ");
        int colorsEntered = input.nextInt();

        // ask the user to enter in the number of colors they thought of:
        System.out.println("Now enter in exactly all " + colorsEntered + " colors that you've thought of");

        // creating an empty array for user input :
        String[] user1Answers = new String[colorsEntered];

        // a for loop that puts the contents of user 1 into an empty array :
        for (int i = 0; i < colorsEntered; i++) {
            user1Answers[i] = input.next();
        }
        System.out.println("These are the colors you've chosen: " + Arrays.toString(user1Answers));

        // comparing the value of a string to a different variable and adding 1 to a counter:
        int count = 0;
        for (int i = 0; i < user1Answers.length; i++) {

            for (int j = 0; j < trueColors.length; j++) {

                if (user1Answers[i].equals(trueColors[j])) {
                    count++;
                    System.out.println("Congrats, you currently have " + count + " points!");
                }
            }
        }
// if user has entered not true colors: ( and lose points )
        for (int i = 0; i < user1Answers.length; i++) {

            for (int j = 0; j < notTrueColors.length; j++) {

                if (user1Answers[i].equals(notTrueColors[j])) {
                    count--;
                    System.out.println("Congrats, you have currently lost " + count + " points because you've entered a shade instead of a color!");
                }
            }
        }

    }

    public static void main(String[] args) {
       game();
        //while loop asking if user wants to keep playing the game till they get all the colors:
       if( count !=10) {


            System.out.println("Would you like to keep playing this game till you've gotten all " +
                    "the colors and no shades? ");
            Scanner keyboard = new Scanner(System.in);
            String yesOrNO = keyboard.nextLine();
            switch (yesOrNO) {
                case "yes": game();
                    break;
                case "no":
                    System.out.println("Congrats! This game is over. ");
                    break;

            }

        }



 // end
    }}

