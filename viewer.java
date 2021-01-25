import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class test {
    private static Scanner x; // searches file
    public static void main(String[] args) {

        int i;
        Scanner input = new Scanner(System.in);
        System.out.print("\n Please select what to do:"
                + "\n View team stats[1]"
                + "\n View fixture and result chart [2]"
                + "\n Show all team rankings[3]"
                + "\n View a match score [4]");
        i = input.nextInt();

        // user has to select a number 1 to 4, this will take them to different parts of the admin page
        if (i < 1)
            System.out.print("Please choose a number between 1 and 4");
        if (i > 4)
            System.out.print("Please choose a number between 1 and 4");
        switch (i) {




        case1:

                string filePath = "players.csv";
                string searchTerm = user_input.next();

            public static void readRecord (String searchTerm, String filePath){

                // has the data the user is looking for been found
                boolean found = false;

                // CSV FIELDS
                String teams = "";
                String playerOne = "";
                String playerTwo = "";
                String playerThree = "";


                try {
                    x = new Scanner(new File(filePath)); // Tells the scanner to read the file
                    x.useDelimiter("[,/n]"); //used to seperate fields in the file


                    // checks if there is anything left to read in the file and found is not true
                    while (x.hasNext() && !found) {
                        // reads the text until the next coma / line
                        teams = x.next();
                        playerOne = x.next();
                        playerTwo = x.next();
                        playerThree = x.next();


                        //Is the team name that has been entered true? If so, terminate loop
                        if (teams.equals(searchTerm)) {
                            found = true;
                        }

                    }
                    if (found) {
                        // If the data is found then print the team and all players
                        JOptionPane.showMessageDialog(null, "team" + team + "playerOne" + playerOne
                                + "playerTwo" + playerTwo + "playerThree" + playerThree);
                    } else {
                        //If the data is not found then print error message
                        JOptionPane.showMessageDialog(null, "Data not found");
                    }
                } catch (Exception e) {
                    //If he try catch doesn't work, print error message
                    JOptionPane.showMessageDialog(null, "Error reading file");
                }


            }
            break;
        }
    }
}