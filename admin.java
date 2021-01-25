import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args){

    public class adminPage {

// >>>>>>>>>> ADMIN PAGE <<<<<<<<<<

        boolean usingAdmin = true;
    do {
        int i;
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please select what to do:"
                + "\n Add player [1]"
                + "\n Add Team [2]"
                + "\n Generate fixtures [3]"
                + "\n Generate team stats [4]");
        i = input.nextInt();

        // user has to select a number 1 to 4, this will take them to different parts of the admin page
        if (i < 1)
            System.out.print("Please choose a number between 1 and 4");
        if (i > 4)
            System.out.print("Please choose a number between 1 and 4");
        switch (i) {


            // enter new player details
            case 1:

                System.out.print("Please enter the players first name");
                firstName = user_input.next();

                System.out.print("Please enter the players surname");
                lastName = user_input.next();

                fullName = firstName + " " + lastName;

                System.out.print("Please enter the players team");
                teamName = user_input.next();

                break;

            // enter new team
            case 2:
                System.out.print("Please enter the team name");
                newTeam = user_input.next();
                break;

            // generate fixtures
            case 3:
                break;

            // Generate team stats
            case 4:
                break;
        }

        }while(usingAdmin =true);


    }

}

