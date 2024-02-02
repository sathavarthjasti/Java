package Java.VacationManagement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.JSONObject;
import org.json.JSONException;

public class Menu {

    public static void main(String[] args) throws IOException, JSONException {

       long randomNumber = Math.round(Math.random() * 10000);

        Integer selection;
        do {
            System.out.println("\n");
            System.out.println("-------------------- Welcome to Vacation Management--------------------");
            System.out.println("  1.      Register    ");
            System.out.println("  2.      Book Vacation    ");
            System.out.println("  3.      Display all Vacation    ");
            System.out.println("  4.      Generate Bill    ");
            System.out.println("  5.      Thank you   ");
            System.out.println("          Press 0 to Exit     ");


            Scanner myObj = new Scanner(System.in);

            System.out.println("\n  Please select an option from the above ");
            selection = myObj.nextInt();





        switch (selection) {
            case 0:
                System.out.println(" EXIT ");
                break;
            case 1:

                File f = new File("/Users/sathavarthjasti/Documents/Java/Java/acc_" + randomNumber) ;

                boolean bool = f.mkdir();
                FileWriter file = new FileWriter("/Users/sathavarthjasti/Documents/Java/Java/acc_"+randomNumber+"/"+"acc_"+randomNumber+".json");
                if (bool == true) {
                    System.out.println("Account Registered successfully");
                } else {
                    System.out.println("Account is not Registered");
                }
                Scanner myOb = new Scanner(System.in);


                System.out.println("\n  Enter the Name :");
                String name= myOb.nextLine();

                System.out.println("\n Enter the Email :");
                String email = myOb.nextLine();

                System.out.println("\n Enter the Address:");
                String address = myOb.nextLine();

                System.out.println("\n Enter the Phone Number:");
                Long phoneNumber = myOb.nextLong();



                JSONObject jsonobject = new JSONObject();

                jsonobject.put("Name", name );

                jsonobject.put("Email ", email );

                jsonobject.put("Phone Number", phoneNumber);

                jsonobject.put("Address", address);

                file.write(jsonobject.toString());
                file.close();

                break;
            case 2:
                System.out.println("Book Vacation");
                break;
            case 3:
                System.out.println("Display All Vacation");
                break;
            case 4:
                System.out.println("Generate Bill");
                break;
            case 5:
                System.out.println("Thank you");
                break;

            default:
                System.out.println("Please choose an option from the above");
        }

        }

        while( selection != 0);
    }
}
