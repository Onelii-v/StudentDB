import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertData insertOp = new InsertData();
        Select selectOp = new Select();
        UpdateDelete updateOp = new UpdateDelete();

        while (true) {
            System.out.println("\n=== Student Database Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    insertOp.addStudent(new Student(name, age, course));
                    break;

                case 2:
                    List<Student> students = selectOp.getAllStudents();
                    students.forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    Student s = selectOp.getStudentById(id);
                    if (s != null) System.out.println(s);
                    else System.out.println("❌ Student not found.");
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String nName = sc.nextLine();
                    System.out.print("Enter New Age: ");
                    int nAge = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Course: ");
                    String nCourse = sc.nextLine();
                    updateOp.updateStudent(new Student(uid, nName, nAge, nCourse));
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    updateOp.deleteStudent(did);
                    break;

                case 6:
                    System.out.println("👋 Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("❌ Invalid choice, try again.");
            }
        }
    }
}
