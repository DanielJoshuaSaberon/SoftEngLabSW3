package LabSeatwork;

import java.util.Scanner;
import java.time.LocalDate;
import LabSeatwork.Adaptee.*;
import LabSeatwork.Adapter.*;
import LabSeatwork.Target.*;

public class SchoolManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {

            System.out.println("1. Attendance System");
            System.out.println("2. Grading System");
            System.out.println("3. Library System");
            System.out.println("4. Exit");
            System.out.print("Select an option:");
            choice = scanner.nextInt();scanner.nextLine();

            LocalDate today = LocalDate.now();

            switch (choice) {
                case 1:
                    AttendanceSystem attendance = new AttendanceSystem();
                    App attendanceTarget = new AttendanceSystemAdapter(attendance);
                    System.out.println(attendanceTarget.integrateSystem() +"\nOn: "+ today);
                    break;

                case 2:
                    GradingSystem grade = new GradingSystem();
                    App gradeTarget = new GradingSystemAdapter(grade);
                    System.out.println(gradeTarget.integrateSystem() +"\nOn: "+ today);
                    break;

                case 3:
                    LibrarySystem library = new LibrarySystem();
                    App libraryTarget = new LibrarySystemAdapter(library);
                    System.out.println(libraryTarget.integrateSystem() +"\nOn: "+ today);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.println();
        } while (choice != 4);
    }
}
