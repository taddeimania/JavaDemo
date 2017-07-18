package io.joel;

public class Main {

    public static void main(String[] args) {
        int numStudents = 403;
        int numTeachers = 62;
        double averageGPA = 2.98;
        String name = "Grady High School";
        String city = "Atlanta, GA";

        System.out.println("School: " + name);
        System.out.println("Teachers: " + numTeachers);

        hello(averageGPA, city);

        if (numStudents >= 10) {
           System.out.println("We have at least 10 students");
        }

        if (numTeachers >= 5) {
            System.out.println("We have at least 5 teachers");
        }
    }

    private static void hello (double x, String y) {
        System.out.println(x + ", " + y);
    }
}
