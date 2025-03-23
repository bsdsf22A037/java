import java.util.Scanner;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store different types of staff
        Staff[] staffList = new Staff[4];

        // Taking input for Professor
        System.out.println("Enter details for Professor:");
        System.out.print("Name: ");
        String profName = scanner.next();
        System.out.print("ID: ");
        int profID = scanner.nextInt();
        System.out.print("Department: ");
        String profDept = scanner.next();
        System.out.print("Monthly Salary: ");
        double profSalary = scanner.nextDouble();
        staffList[0] = new Professor(profName, profID, profDept, profSalary);

        // Taking input for Lecturer
        System.out.println("\nEnter details for Lecturer:");
        System.out.print("Name: ");
        String lectName = scanner.next();
        System.out.print("ID: ");
        int lectID = scanner.nextInt();
        System.out.print("Department: ");
        String lectDept = scanner.next();
        System.out.print("Pay per Lecture: ");
        double payPerLecture = scanner.nextDouble();
        System.out.print("Number of Lectures: ");
        double numLectures = scanner.nextDouble();
        staffList[1] = new Lecturer(lectName, lectID, lectDept, payPerLecture, numLectures);

        // Taking input for Administrator
        System.out.println("\nEnter details for Administrator:");
        System.out.print("Name: ");
        String adminName = scanner.next();
        System.out.print("ID: ");
        int adminID = scanner.nextInt();
        System.out.print("Department: ");
        String adminDept = scanner.next();
        System.out.print("Base Salary: ");
        double baseSalary = scanner.nextDouble();
        System.out.print("Performance Bonus: ");
        double bonus = scanner.nextDouble();
        staffList[2] = new Administrator(adminName, adminID, adminDept, baseSalary, bonus);


        // Display staff details and salary
        System.out.println("\n--- University Staff Payroll ---");
        for (Staff staff : staffList) {
            System.out.println(staff.toString());
            System.out.println("Salary: " + staff.calculateSalary());
            
            // Using instanceof for type checking
            if (staff instanceof Professor) {
                System.out.println("Type: Professor");
            } else if (staff instanceof Lecturer) {
                System.out.println("Type: Lecturer");
            } else if (staff instanceof Administrator) {
                System.out.println("Type: Administrator");
            } 
            System.out.println("----------------------------------");
        }

        scanner.close();
    }
}
