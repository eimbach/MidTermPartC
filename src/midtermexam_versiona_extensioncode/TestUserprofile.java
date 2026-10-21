/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author bacha
 */


    


public class TestUserprofile {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = inp.nextLine();
        
        System.out.print("Please select your favourite genre (0 - Comedy, 1 - Action, 2 - Drama, 3 - Mystery: ");
        int genreNum = inp.nextInt();
        
        UserProfile testUser = new UserProfile();
        
        testUser.userInputted(name, genreNum);
        
        System.out.print("Hello " + testUser.getUserID() + ", your user profile with \"" + testUser.getGenre() + "\" has been created.");
        
    }
}
