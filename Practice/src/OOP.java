import java.util.Scanner;

public class OOP{
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Student Name: ");
    String name = scanner.nextLine();
    
    System.out.println("Enter Student Course: ");
    String course = scanner.nextLine();

    System.out.println("Enter Student Grade: ");
    double grade = scanner.nextDouble();

    Student student = new Student(name, course, grade);


    student.displayInfo();
    scanner.nextLine();

    System.out.println("Do you want to update grade? ");
    String answer = scanner.nextLine();

        if (answer.equals("yes")) {

            System.out.println("Enter new grade: ");
            double newGrade = scanner.nextDouble();

            student.updateGrade(newGrade);

            System.out.println("Updated Information: ");
            student.displayInfo();
            
        } else {
            System.out.println(grade);

            
        }


}


    static class Student {
        String name;
        String course;
        double grade;
        boolean isEnrolled;

        Student (String name, String course, double grade){
            this.name = name;
            this.course = course;
            this.grade = grade;
            this.isEnrolled = true;
    }

    void displayInfo (){
        System.out.println("Student Name: " + name);
        System.out.println("Student Course: " + course);
        System.out.println("Student Grade: " + grade);
        System.out.println("Is the student enrolled? " + isEnrolled);
    }

    void updateGrade(double newGrade){

        this.grade = newGrade;
    }




    }
}