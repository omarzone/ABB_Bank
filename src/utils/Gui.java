package utils;

import java.util.Scanner;

public class Gui {



    public void showHomeView() {
        System.out.println("=======================================================");
        System.out.println("               Bank Manager");
        System.out.println("=======================================================");
        System.out.println("    Select an option:");
        System.out.println("        1. Register Client");
        System.out.println("        2. Modify Client");
        System.out.println("        3. Delete Client");
        System.out.println("        4. Generate Report");
        System.out.println("        5. Exit");
        System.out.println("");
    }

    public int showModifyTypeView() {
        int option = -1;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("=======================================================");
            System.out.println("               Bank Manager");
            System.out.println("=======================================================");
            System.out.println("   Select the data to modify:");
            System.out.println("        1. Personal information");
            System.out.println("        2. Balance");
            System.out.println("");
            option = input.nextInt();
            return option;

        } catch (Exception ex) {
            System.out.println("Select a valid option");
            showModifyTypeView();
        }
        return option;
    }

    public int showReportTypeView() {
        int option = -1;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("=======================================================");
            System.out.println("               Bank Manager");
            System.out.println("=======================================================");
            System.out.println("   What report do you want to generate?:");
            System.out.println("        1. All customers");
            System.out.println("        2. Clients older than 5 years");
            System.out.println("");
            option = input.nextInt();
            return option;

        } catch (Exception ex) {
            System.out.println("Select a valid option");
            showReportTypeView();
        }
        return option;
    }

    public void headerEditableView(String message) {
        System.out.println("=======================================================");
        System.out.println("               Bank Manager");
        System.out.println("=======================================================");
        System.out.println("   " + message + ":");

    }


}
