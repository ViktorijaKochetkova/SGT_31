package wltProject;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RegAndLog {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/java31";
        String username = "root";
        String password = "V!kt0r1ja";

        Scanner scanner = new Scanner(System.in);
        char again = 'y';


        try (Connection conn = DriverManager.getConnection(dbURL, username, password)) {
            System.out.println("Welcome!");

            while (again == 'y') {

                System.out.println("Are you our driver(y/n)?");
                char action = scanner.nextLine().charAt(0);
                if (action == 'y') {
                    System.out.println("Enter your ID number and password");
                //Need create and insert login password check

                } else if (action == 'n') {//need insert ,that can input only latin,only verbs and number,no symbols,without spaces(in password available insert symbols too)
                    System.out.println("Do you want to start job at us?");
                    System.out.println("Choose 'r' or 'q'");
                    System.out.println("r - register new driver");
                    System.out.println("q - quite");
                    String result = scanner.nextLine();

                    if (result.equals("r")){
                        System.out.println("Enter driver`s license number");
                        int newdlid = Integer.parseInt(scanner.nextLine());

                        System.out.println("Enter password");
                        String newPassword = scanner.nextLine();

                        System.out.println("Enter Full Name");
                        String newName = scanner.nextLine();

                        System.out.println("Enter email");
                        String newSurname = scanner.nextLine();

                        driverReg(conn, newdlid, newPassword, newName, newSurname);

                    } else {
                        System.out.println("Good luck!");
                    }
                }

                System.out.println("Do you want to do something more y/n");
                again = scanner.nextLine().charAt(0);
            }

        } catch(Exception e){
            e.printStackTrace();
        }
    }



        public static void driverReg (Connection conn, int dlid, String password,String name,String surname) throws SQLException {
        String sql = "INSERT INTO drivers(dlid,password,name,surname) VALUES (?,?,?,?)";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, dlid);
        statement.setString(2, password);
        statement.setString(3, name);
        statement.setString(4, surname);

        int rowsInserted = statement.executeUpdate();

        if (rowsInserted > 0) {
            System.out.println("Congratulations! You have been registered");
        } else {
            System.out.println("Something was wrong");
        }
    }
}