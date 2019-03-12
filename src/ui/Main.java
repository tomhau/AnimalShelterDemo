package ui;
import application.Controller;

public class Main {

    public static void main(String [] args){
        System.out.println("main console");
        Controller c = new Controller();
        // (1) Sending raw info to the controller (from this GUI)

        System.out.print(c.animalInfo("Carl", "dog")); // getting the recieved data back..

        // Create another animal (not a dog) what happens then...
    }
}
