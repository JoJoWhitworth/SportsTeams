import java.io.*;
import java.lang.*;
import java.util.*;


public class editor {
    private Formatter x;
    public void openFile(){
        try{
            x = new Formatter("editPlayers.csv");

        }
        catch (Exception e) {
            System.out.println("There was an error editing the file.");

        }
    }
    public void addRecords(){
        x.format("%s%s%s%s", user_input.next, user_input.next,user_input.next,user_input.next );
    }
    public void closeFile(){
        x.close();
    }
}
