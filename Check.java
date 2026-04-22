import java.util.Scanner;

class Student {
   
    void checkResult(int marks) {
        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        s1.checkResult(marks);

        sc.close();
    }
}