// Q2) Define an abstract class Staff with protected members id and name. Define a parameterized 
// constructor. Define one subclass OfficeStaff with member department. Create n objects of 
// OfficeStaff and display all details.

import java.util.Scanner;

// Abstract class Staff
abstract class Staff {
    protected int id;
    protected String name;

    // Parameterized constructor
    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Abstract method to display staff details
    public abstract void display();
}

// Subclass OfficeStaff that extends Staff
class OfficeStaff extends Staff {
    private String department;

    // Parameterized constructor
    public OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    // Implement display method to show details
    @Override
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
}

public class Office {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of OfficeStaff objects
        System.out.print("Enter the number of staff members: ");
        int n = sc.nextInt();

        // Create an array of OfficeStaff objects
        OfficeStaff[] staffArray = new OfficeStaff[n];

        // Input staff details for n staff members
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for staff member " + (i + 1) + ": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume the newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Department: ");
            String department = sc.nextLine();

            // Create OfficeStaff object and store it in the array
            staffArray[i] = new OfficeStaff(id, name, department);
        }

        // Display all staff details
        System.out.println("\nStaff Details:");
        for (OfficeStaff staff : staffArray) {
            staff.display();
        }

        sc.close();
    }
}

