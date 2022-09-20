package Menu;

import List.AscNumb;
import List.DesNumb;

import java.util.Scanner;

public class Menu {
    // This function is to start the menu and list the options for the User.
    public static void menuRun() {

        // This lists the Options for the User

        System.out.println("\n" + "Trooper Tracking Application" + "\n" + "By Benjiman Sutton");
        System.out.println("\n");
        System.out.println("Select the Option you want to use" + "\n"
                + "1 Display Troopers via their Number in Ascending Order" + "\n" + "2 Display Troopers via their Number in Descending Order " + "\n"
                + "3 Exit");

        Scanner input = new Scanner(System.in);

        String menuchoice = input.nextLine();

        //This is the Switch for the Menu

        switch (menuchoice) {

            case "1":
                System.out.println(AscNumb.getAscNumb());
                System.out.println("\n");
                System.out.println("\n");
                menuRun();
                break;

            case "2":
                System.out.println(DesNumb.getDesNumb());
                System.out.println("\n");
                System.out.println("\n");
                menuRun();
                break;

            case "3":
                System.out.println("Over and Out");
                System.exit(0);

            default:
                System.out.println("Option not Valid, Pick Again");
        }

    }

}
