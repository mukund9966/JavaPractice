package project;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 65) {
            return "C";
        } else if (marks >=55){
            return "D";
        }
        else {
            return "F";
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Marks: " + marks;
    }
}

class GraduateStudent extends Student {
    public GraduateStudent(String name, int rollNumber, int marks) {
        super(name, rollNumber, marks);
    }

    @Override
    public String calculateGrade() {
        if (getMarks() >= 34) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}

public class MiniProject {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        String filename = "Data.txt";

        createFile(filename);

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Do you want to enter  student details?");
            System.out.println("Press 1 to enter details, 0 to exit.");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = scanner.next();
                System.out.print("Enter roll number: ");
                int rollNumber = scanner.nextInt();
                System.out.print("Enter marks: ");
                int marks = scanner.nextInt();

                Student newStudent = new Student(name, rollNumber, marks);
                students.add(newStudent);
                appendData(filename, newStudent);
            }
        } while (choice != 0);

        readData(filename, students);
    }

    private static void createFile(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void readData(String filename, List<Student> students) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0].trim();
                int rollNumber = Integer.parseInt(parts[1].trim());
                int marks = Integer.parseInt(parts[2].trim());

                Student student = new Student(name, rollNumber, marks);
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void appendData(String filename, Student student) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println(student.getName() + "," + student.getRollNumber() + "," + student.getMarks());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
